package Client;
import javax.swing.*;
import java.awt.*;
import java.awt.image.PixelGrabber;

public class BackgroundImages extends JPanel
{
	public Image skybackground;
	public int imageWidth, imageHeight;
	public int[] imageArray;
	private int bgImageWidth, bgImageHeight;
	
	public int getImageWidth()
	{
		return imageWidth;
	}
	public int getImageHeight()
	{
		return imageHeight;
	}

	public BackgroundImages(String filename, int width, int height)
	{
		bgImageWidth = width;
		bgImageHeight = height;
		skybackground = Imager("./src/Images/skybackground.png");
	}
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(skybackground, 0, 0, this);
    }
	public Image Imager(String filename)
	{
		try
		{
			Image image = Toolkit.getDefaultToolkit().getImage(filename);
			Image image2 = image.getScaledInstance(bgImageWidth, bgImageHeight, Image.SCALE_SMOOTH);
			MediaTracker mediatracker = new MediaTracker(this);
			mediatracker.addImage(image2, 0);
			mediatracker.waitForAll();
			this.imageWidth = image2.getWidth(this);
			this.imageHeight = image2.getHeight(this);
			imageArray = new int[imageWidth*imageHeight];
			PixelGrabber pixelgrabber = new PixelGrabber(image2, 0, 0, this.imageWidth, this.imageHeight, imageArray, 0, this.imageWidth);
			pixelgrabber.grabPixels();
			return image2;
		} catch(Exception e)
		{
			System.err.println(e.getStackTrace());
		}
		return null;
		
	}
}
