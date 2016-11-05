package Client;
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.PrintStream;

import Client.sign.signlink;

public class GameApplet extends JApplet
    implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener, ComponentListener
{

	public BackgroundImages bgi;
    public final void OpenClient(int gameHeight, int gameWidth)
    {
    	this.gameWidth = gameWidth;
    	this.gameHeight = gameHeight;
    	gFrame = new GameFrame(this, gameWidth, gameHeight);
    	graphics = getFrameComponent().getGraphics();
		bgi = new BackgroundImages("./src/Images/skybackground.png", gameWidth - 2*EGUI.translateGameX - 4,
				gameHeight - EGUI.translateGameY - EGUI.translateGameX - 4);
    	aClass15_13 = new Class15(gameWidth, gameHeight, getFrameComponent(), EGUI.MAX_WIDTH, EGUI.MAX_HEIGHT);
    	getFrameComponent().addComponentListener(this);
    	StartThread(this, 1);
    }

    public final void InitOpenClient(int gameHeight, int gameWidth)
    {
    	this.gameWidth = gameWidth;
    	this.gameHeight = gameHeight;
    	graphics = getFrameComponent().getGraphics();
        aClass15_13 = new Class15(gameWidth, gameHeight, getFrameComponent(), EGUI.MAX_WIDTH, EGUI.MAX_HEIGHT);
        StartThread(this, 1);
    }

    public void run()
    {
    	getFrameComponent().addMouseListener(this);
    	getFrameComponent().addMouseMotionListener(this);
    	getFrameComponent().addKeyListener(this);
    	getFrameComponent().addFocusListener(this);
        if(gFrame != null)
        	gFrame.addWindowListener(this);
        method13(0, "Loading...");
        method6();
        int i = 0;
        int j = 256;
        int k = 1;
        int i1 = 0;
        int j1 = 0;
        for(int k1 = 0; k1 < 10; k1++)
            aLongArray7[k1] = System.currentTimeMillis();

        long l = System.currentTimeMillis();
        while(anInt4 >= 0) 
        {
            if(anInt4 > 0)
            {
                anInt4--;
                if(anInt4 == 0)
                {
                    method3(4747);
                    return;
                }
            }
            int i2 = j;
            int j2 = k;
            j = 300;
            k = 1;
            long l1 = System.currentTimeMillis();
            if(aLongArray7[i] == 0L)
            {
                j = i2;
                k = j2;
            } else
            if(l1 > aLongArray7[i])
                j = (int)((long)(2560 * anInt5) / (l1 - aLongArray7[i]));
            if(j < 25)
                j = 25;
            if(j > 256)
            {
                j = 256;
                k = (int)((long)anInt5 - (l1 - aLongArray7[i]) / 10L);
            }
            if(k > anInt5)
                k = anInt5;
            aLongArray7[i] = l1;
            i = (i + 1) % 10;
            if(k > 1)
            {
                for(int k2 = 0; k2 < 10; k2++)
                    if(aLongArray7[k2] != 0L)
                        aLongArray7[k2] += k;

            }
            if(k < anInt6)
                k = anInt6;
            try
            {
                Thread.sleep(k);
            }
            catch(InterruptedException _ex)
            {
                j1++;
            }
            for(; i1 < 256; i1 += j)
            {
                anInt26 = anInt22;
                mousePressedX2 = mousePressedX;
                mousePressedY2 = mousePressedY;
                aLong29 = aLong25;
                anInt22 = 0;
                method7(24869);
                anInt32 = anInt33;
            }

            i1 &= 0xff;
            if(anInt5 > 0)
                anInt8 = (1000 * j) / (anInt5 * 256);
            method9(0); //when game has finished loading
            if(aBoolean9)
            {
                System.out.println("ntime:" + l1);
                for(int l2 = 0; l2 < 10; l2++)
                {
                    int i3 = ((i - l2 - 1) + 20) % 10;
                    System.out.println("otim" + i3 + ":" + aLongArray7[i3]);
                }

                System.out.println("fps:" + anInt8 + " ratio:" + j + " count:" + i1);
                System.out.println("del:" + k + " deltime:" + anInt5 + " mindel:" + anInt6);
                System.out.println("intex:" + j1 + " opos:" + i);
                aBoolean9 = false;
                j1 = 0;
            }
        }
        if(anInt4 == -1)
            method3(4747);
    }

    public final void method3(int i)
    {
        anInt4 = -2;
        method8(493);
        if(i != 4747)
            return;
        if(gFrame != null)
        {
            try
            {
                Thread.sleep(1000L);
            }
            catch(Exception _ex) { }
            try
            {
                System.exit(0);
                return;
            }
            catch(Throwable _ex) { }
        }
    }

    public final void method4(boolean flag, int i)
    {
        if(flag)
        {
            return;
        } else
        {
            anInt5 = 1000 / i;
            return;
        }
    }

    public final void start()
    {
        if(anInt4 >= 0)
            anInt4 = 0;
    }

    public final void stop()
    {
        if(anInt4 >= 0)
            anInt4 = 4000 / anInt5;
    }

    public final void destroy()
    {
        anInt4 = -1;
        try
        {
            Thread.sleep(5000L);
        }
        catch(Exception _ex) { }
        if(anInt4 == -1)
            method3(4747);
    }

    public final void update(Graphics g)
    {
        if(graphics == null)
            graphics = g;
        aBoolean16 = true;
        method10((byte)1);
    }

    public final void paint(Graphics g)
    {
        if(graphics == null)
            graphics = g;
        aBoolean16 = true;
        method10((byte)1);
    }

    public final void mousePressed(MouseEvent mouseevent)
    {
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        if(gFrame != null)
        {
            i -= EGUI.translateGameX;
            j -= EGUI.translateGameY;
        }
        anInt18 = 0;
        mousePressedX = i;
        mousePressedY = j;
        aLong25 = System.currentTimeMillis();
        if(mouseevent.isMetaDown())
        {
            anInt22 = 2;
            anInt19 = 2;
            return;
        } else
        {
            anInt22 = 1;
            anInt19 = 1;
            return;
        }
    }

    public final void mouseReleased(MouseEvent mouseevent)
    {
        anInt18 = 0;
        anInt19 = 0;
    }

    public final void mouseClicked(MouseEvent mouseevent)
    {
    }

    public final void mouseEntered(MouseEvent mouseevent)
    {
    }

    public final void mouseExited(MouseEvent mouseevent)
    {
        anInt18 = 0;
        mouseMovedX = -1;
        mouseMovedY = -1;
    }

    public final void mouseDragged(MouseEvent mouseevent)
    {
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        if(gFrame != null)
        {
            i -= EGUI.translateGameX;
            j -= EGUI.translateGameY;
        }
        anInt18 = 0;
        mouseMovedX = i;
        mouseMovedY = j;
    }

    public final void mouseMoved(MouseEvent mouseevent)
    {
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        if(gFrame != null)
        {
            i -= EGUI.translateGameX;
            j -= EGUI.translateGameY;
        }
        anInt18 = 0;
        mouseMovedX = i;
        mouseMovedY = j;
    }

    public final void keyPressed(KeyEvent keyevent)
    {
        anInt18 = 0;
        int i = keyevent.getKeyCode();
        int j = keyevent.getKeyChar();
        System.out.println("gameapplet; keypressed: "+i+" "+j);
        j = ((client)this).checkKeybindsDown(i, j);
        if(j > 0 && j < 128)
        {
            keyDown[j] = 1; // 1 to press key
        }
        if(j > 4)
        {
            anIntArray31[anInt33] = j;
            anInt33 = anInt33 + 1 & 0x7f; // 0<anint33<128
        }
    }

    public final void keyReleased(KeyEvent keyevent)
    {
        anInt18 = 0;
        int i = keyevent.getKeyCode();
        int c = keyevent.getKeyChar();
        c = ((client)this).checkKeybindRelease(i, c);
        if(c > 0 && c < 128)
            keyDown[c] = 0; // 0 to release key
    }

    public final void keyTyped(KeyEvent keyevent)
    {
    }

    public final int method5()
    {
        int key = -1;
        if(anInt33 != anInt32)
        {
            key = anIntArray31[anInt32];
            anInt32 = anInt32 + 1 & 0x7f;
        }
        return key;
    }

    public final void focusGained(FocusEvent focusevent)
    {
        aBoolean17 = true;
        aBoolean16 = true;
        method10((byte)1);
    }

    public final void focusLost(FocusEvent focusevent)
    {
        aBoolean17 = false;
        for(int i = 0; i < 128; i++)
            keyDown[i] = 0;

    }

    public final void windowActivated(WindowEvent windowevent)
    {
    }

    public final void windowClosed(WindowEvent windowevent)
    {
    }

    public final void windowClosing(WindowEvent windowevent)
    {
        destroy();
    }

    public final void windowDeactivated(WindowEvent windowevent)
    {
    }

    public final void windowDeiconified(WindowEvent windowevent)
    {
    }

    public final void windowIconified(WindowEvent windowevent)
    {
    }

    public final void windowOpened(WindowEvent windowevent)
    {
    }

    public void method6()
    {
    }

    public void method7(int i)
    {
        if(i == anInt2);
    }

    public void method8(int i)
    {
        i = 91 / i;
    }

    public void method9(int i)
    {
        if(i != 0)
        {
            for(int j = 1; j > 0; j++);
        }
    }

    public void method10(byte byte0)
    {
        if(byte0 == 1)
            byte0 = 0;
    }

    public Component getFrameComponent()
    {
        if(gFrame != null)
            return gFrame;
        else
            return this;
    }

    public void StartThread(Runnable runnable, int priority)
    {
        Thread thread = new Thread(runnable);
        thread.start();
        thread.setPriority(priority);
    }

    public void method13(int i, String s)
    {
        while(graphics == null) 
        {
            graphics = getFrameComponent().getGraphics();
            try
            {
            	getFrameComponent().repaint();
            }
            catch(Exception _ex) { }
            try
            {
                Thread.sleep(1000L);
            }
            catch(Exception _ex) { }
        }
        Font font = new Font("Helvetica", 1, 13);
        FontMetrics fontmetrics = getFrameComponent().getFontMetrics(font);
        Font font1 = new Font("Helvetica", 0, 13);
        getFrameComponent().getFontMetrics(font1);
        /*
        if(aBoolean16)
        {
            graphics.setColor(Color.black);
            graphics.fillRect(0, 0, gameWidth, gameHeight);
            aBoolean16 = false;
        }
        Color color = new Color(140, 17, 17);
        int j = gameHeight / 2 - 18;
        graphics.setColor(color);
        graphics.drawRect(gameWidth / 2 - 152, j, 304, 34);
        graphics.fillRect(gameWidth / 2 - 150, j + 2, i * 3, 30);
        graphics.setColor(Color.black);

        graphics.fillRect((gameWidth / 2 - 150) + i * 3, j + 2, 300 - i * 3, 30);
        graphics.setFont(font);
        graphics.setColor(Color.white);
        graphics.drawString(s, (gameWidth - fontmetrics.stringWidth(s)) / 2, j + 22);
        */
        return;
    }

    public void componentHidden(ComponentEvent arg0) {
    }
    public void componentMoved(ComponentEvent arg0) {   
    }
    public void componentResized(ComponentEvent arg0)
    { // need to change the size of the game
    	((client)this).resizedWindow();
    }
    public void componentShown(ComponentEvent arg0) {

    }

    public GameApplet()
    {
        aBoolean1 = true;
        anInt2 = 24869;
        anInt3 = 748;
        anInt5 = 20;
        anInt6 = 1;
        aLongArray7 = new long[10];
        aBoolean9 = false;
        aClass30_Sub2_Sub1_Sub1Array14 = new Class30_Sub2_Sub1_Sub1[6];
        aBoolean16 = true;
        aBoolean17 = true;
        keyDown = new int[128];
        anIntArray31 = new int[128];
    }

    private boolean aBoolean1;
    private int anInt2;
    private int anInt3;
    private int anInt4;
    private int anInt5;
    public int anInt6;
    private long aLongArray7[];
    public int anInt8;
    public boolean aBoolean9;
    public int gameWidth;
    public int gameHeight;
    public Graphics graphics;
    public Class15 aClass15_13;
    public Class30_Sub2_Sub1_Sub1 aClass30_Sub2_Sub1_Sub1Array14[];
    public GameFrame gFrame;
    public boolean aBoolean16;
    public boolean aBoolean17;
    public int anInt18;
    public int anInt19;
    public int mouseMovedX;
    public int mouseMovedY;
    public int anInt22;
    public int mousePressedX;
    public int mousePressedY;
    public long aLong25;
    public int anInt26;
    public int mousePressedX2;
    public int mousePressedY2;
    public long aLong29;
    public int keyDown[];
    private int anIntArray31[];
    private int anInt32;
    private int anInt33;
    public static int anInt34;
}
