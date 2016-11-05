package Client;
import Client.sign.signlink;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public final class GameFrame extends JFrame
{

    public GameFrame(GameApplet gApplet, int gameWidth, int gameHeight)
    {
        this.gApplet = gApplet;
        setTitle("TextClientV1");
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setBackground(Color.BLACK);
        setResizable(false);
        setVisible(true);
        toFront();
        //setSize(gameWidth + 2*EGUI.translateGameX, gameHeight + EGUI.translateGameY + EGUI.translateGameX);
        setSize(1000, 600);
        this.setLocation(20, 20);
        setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Graphics getGraphics()
    {
        Graphics g = super.getGraphics();
        g.translate(EGUI.translateGameX, EGUI.translateGameY);
        return g;
    }

    public final void update(Graphics g)
    {
    	gApplet.update(g);
    }

    public final void paint(Graphics g)
    {
    	gApplet.paint(g);
    }


    GameApplet gApplet;
}
