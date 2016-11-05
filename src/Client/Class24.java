package Client;
import Client.sign.signlink;
import java.io.*;
import java.net.Socket;

public final class Class24
    implements Runnable
{

    public Class24(GameApplet gApplet, int i, Socket socket)
        throws IOException
    {
        anInt416 = -53;
        aBoolean417 = true;
        anInt418 = 519;
        aBoolean422 = false;
        clientConnected = false;
        ioEror = false;
        while(i >= 0) 
            aBoolean417 = !aBoolean417;
        this.gApplet = gApplet;
        clientSock = socket;
        clientSock.setSoTimeout(30000);
        clientSock.setTcpNoDelay(true);
        in = clientSock.getInputStream();
        out = clientSock.getOutputStream();
    }

    /**
     * Client disconnecting
     */
    public void method267()
    {
        aBoolean422 = true;
        try
        {
            if(in != null)
                in.close();
            if(out != null)
                out.close();
            if(clientSock != null)
                clientSock.close();
        }
        catch(IOException _ex)
        {
            System.out.println("Error closing stream");
        }
        clientConnected = false;
        synchronized(this)
        {
            notify();
        }
        buffer = null;
    }

    public int method268()
        throws IOException
    {
        if(aBoolean422)
            return 0;
        else
            return in.read();
    }

    public int getAvailableDataSize()
        throws IOException
    {
        if(aBoolean422)
            return 0;
        else
            return in.available();
    }

    public void method270(byte abyte0[], int i, int j)
        throws IOException
    {
        if(aBoolean422)
            return;
        int k;
        for(; j > 0; j -= k)
        {
            k = in.read(abyte0, i, j);
            if(k <= 0)
                throw new IOException("EOF");
            i += k;
        }

    }

    public void method271(int i, int j, byte abyte0[], int k)
        throws IOException
    {
        if(aBoolean422)
            return;
        if(ioEror)
        {
            ioEror = false;
            throw new IOException("Error in writer thread");
        }
        if(buffer == null)
            buffer = new byte[5000];
        synchronized(this)
        {
            for(int l = 0; l < i; l++)
            {
                buffer[bufferWriteIdx] = abyte0[l + k];
                bufferWriteIdx = (bufferWriteIdx + 1) % 5000;
                if(bufferWriteIdx == (bufferReadIdx + 4900) % 5000)
                    throw new IOException("buffer overflow");
            }

            if(!clientConnected)
            {
                clientConnected = true;
                gApplet.StartThread(this, 3);
            }
            notify();
        }
        if(j != 0)
            anInt418 = 255;
    }

    public void run()
    {
        while(clientConnected) 
        {
            int numBytesInBuffer;
            int offset;
            synchronized(this)
            {
                if(bufferWriteIdx == bufferReadIdx)
                    try
                    {
                        wait();
                    }
                    catch(InterruptedException _ex) { }
                if(!clientConnected)
                    return;
                offset = bufferReadIdx;
                if(bufferWriteIdx >= bufferReadIdx)
                    numBytesInBuffer = bufferWriteIdx - bufferReadIdx;
                else
                    numBytesInBuffer = 5000 - bufferReadIdx;
            }
            if(numBytesInBuffer > 0)
            {
                try
                {
                    out.write(buffer, offset, numBytesInBuffer);
                }
                catch(IOException _ex)
                {
                    ioEror = true;
                }
                bufferReadIdx = (bufferReadIdx + numBytesInBuffer) % 5000;
                try
                {
                    if(bufferWriteIdx == bufferReadIdx)
                        out.flush();
                }
                catch(IOException _ex)
                {
                    ioEror = true;
                }
            }
        }
    }

    public void method272(byte byte0)
    {
        if(byte0 != 1)
            anInt416 = 457;
        System.out.println("dummy:" + aBoolean422);
        System.out.println("tcycl:" + bufferReadIdx);
        System.out.println("tnum:" + bufferWriteIdx);
        System.out.println("writer:" + clientConnected);
        System.out.println("ioerror:" + ioEror);
        try
        {
            System.out.println("available:" + getAvailableDataSize());
            return;
        }
        catch(IOException _ex)
        {
            return;
        }
    }

    private int anInt416;
    private boolean aBoolean417;
    private int anInt418;
    private InputStream in;
    private OutputStream out;
    private Socket clientSock;
    private boolean aBoolean422;
    GameApplet gApplet;
    private byte buffer[];
    private int bufferReadIdx;
    private int bufferWriteIdx;
    private boolean clientConnected;
    private boolean ioEror;
}
