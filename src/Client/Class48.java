package Client;
import Client.sign.signlink;

public class Class48
    implements Runnable
{

    public void run()
    {
        while(aBoolean808) 
        {
            synchronized(anObject806)
            {
                if(anInt810 < 500)
                {
                    anIntArray809[anInt810] = ((GameApplet) (c)).mouseMovedX;
                    anIntArray807[anInt810] = ((GameApplet) (c)).mouseMovedY;
                    anInt810++;
                }
            }
            try
            {
                Thread.sleep(50L);
            }
            catch(Exception _ex) { }
        }
    }

    public Class48(client client1, int i)
    {
        anObject806 = new Object();
        anIntArray807 = new int[500];
        aBoolean808 = true;
        for(anIntArray809 = new int[500]; i >= 0;)
            throw new NullPointerException();

        c = client1;
    }

    private client c;
    public Object anObject806;
    public int anIntArray807[];
    public boolean aBoolean808;
    public int anIntArray809[];
    public int anInt810;
}
