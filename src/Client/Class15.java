package Client;
import Client.sign.signlink;
import java.awt.*;
import java.awt.image.*;
import java.io.PrintStream;

public final class Class15 implements ImageProducer, ImageObserver
{
	public int[] backgroundImage; //background image
	public Component comp;
	/**
	 * used for gamewindow
	 * @param gameWidth
	 * @param gameHeight
	 * @param component
	 * @param bgi
	 */
    public Class15(int gameWidth, int gameHeight, Component component, int maxWidth, int maxHeight)
    {
        this.imageWidth = gameWidth;
        this.imageHeight = gameHeight;
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
        imagePixelsArray = new int[maxWidth * maxHeight];
        colorModel = new DirectColorModel(32, 0xff0000, 0xff00, 0xff);
        image = component.createImage(this);
        method239();
        component.prepareImage(image, this);
        method239();
        component.prepareImage(image, this);
        method239();
        component.prepareImage(image, this);
        method237();
    }
    
    public Class15(int gameWidth, int gameHeight, Component component)
    {
        this.imageWidth = gameWidth;
        this.imageHeight = gameHeight;
        imagePixelsArray = new int[gameWidth * gameHeight];
        colorModel = new DirectColorModel(32, 0xff0000, 0xff00, 0xff);
        image = component.createImage(this);
        method239();
        component.prepareImage(image, this);
        method239();
        component.prepareImage(image, this);
        method239();
        component.prepareImage(image, this);
        method237();
    }

    public void method237()
    {
        Class30_Sub2_Sub1.method331(imageHeight, imageWidth, imagePixelsArray);
    }

    /**
     * GraphicsPositioner
     * @param y
     * @param g
     * @param x
     */
    public void GraphicsPositioner(int y, Graphics g, int x)
    {
        method239();
        g.drawImage(image, x, y, this);
    }

    public synchronized void addConsumer(ImageConsumer imageConsumer)
    {
    	this.imageConsumer = imageConsumer;
    	imageConsumer.setDimensions(imageWidth, imageHeight);
    	imageConsumer.setProperties(null);
    	imageConsumer.setColorModel(colorModel);
    	imageConsumer.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer imageConsumer)
    {
        return this.imageConsumer == imageConsumer;
    }

    public synchronized void removeConsumer(ImageConsumer imageConsumer)
    {
        if(this.imageConsumer == imageConsumer)
        	this.imageConsumer = null;
    }

    public void startProduction(ImageConsumer imageConsumer)
    {
        addConsumer(imageConsumer);
    }

    public void requestTopDownLeftRightResend(ImageConsumer imageConsumer)
    {
        System.out.println("TDLR");
    }

    /**
     * needs to be called every time the game size changes
     */
    public synchronized void method239()
    {
        if(imageConsumer == null)
        {
            return;
        } else
        {
        	imageConsumer.setPixels(0, 0, imageWidth, imageHeight, colorModel, imagePixelsArray, 0, imageWidth);
        	imageConsumer.imageComplete(2);
            return;
        }
    }

    public boolean imageUpdate(Image image, int i, int j, int k, int l, int i1)
    {
        return true;
    }
    
    public int getGameWidth() {
    	return imageWidth;
    }
    public int getGameHeight() {
    	return imageHeight;
    }
    public int[] getPixelsArray() {
    	return imagePixelsArray;
    }
    public void setGameWidth(int newWidth) {
    	imageWidth = newWidth;
    }
    public void setGameHeight(int newHeight) {
    	imageHeight = newHeight;
    }

    private int imageWidth;
    private int imageHeight;
    public int maxWidth;
    public int maxHeight;
    public int imagePixelsArray[];
    ColorModel colorModel;
    ImageConsumer imageConsumer;
    public Image image;
}
