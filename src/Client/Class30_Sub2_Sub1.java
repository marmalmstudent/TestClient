package Client;
import java.awt.Color;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import Client.sign.signlink;

public class Class30_Sub2_Sub1 extends Class30_Sub2
{

    public static void method331(int Height, int Width, int PixelsArray[])
    {
    	pixelsArray = PixelsArray;
        width = Width;
        height = Height;
        method333(Height, 0, Width, 0);
    }

    public static void method332()
    {
        	startWidth = 0;
        	startHeight = 0;
            endWidth = width;
            endHeight = height;
            endWidthMinusOne = endWidth - 1;
            endWidthHalf = endWidth / 2;
            return;
    }

    public static void method333(int Height, int StartHeight, int Width, int StartWidth)
    {
    	if(StartHeight < 0)
        	StartHeight = 0;
        if(StartWidth < 0)
        	StartWidth = 0;
        if(Width > width)
        	Width = width;
        if(Height > height)
        	Height = height;
        startWidth = StartHeight;
        startHeight = StartWidth;
        endWidth = Width;
        endHeight = Height;
        endWidthMinusOne = endWidth - 1;
        endWidthHalf = endWidth / 2;
        endHeightHalf = endHeight / 2;
    }
    public static void ResetPixelArray(BackgroundImages bgi)
    {
    	int i = width * height;
    	for(int j = 0; j < i; j++)
    	{
    		pixelsArray[j] = bgi.imageArray[j];
    	}
    }
    public static void ResetPixelArray()
    {
    	int i = width * height;
    	for(int j = 0; j < i; j++)
    		pixelsArray[j] = 0;
    }
    
    /**
     * Standard background color (used in prayerinfo screeen,
     * equipmentinfo screen, magicinfo screen) if you set i=256,
     * i1=0. Otherwise it produces the same thing as
     * BackgroundColor1
     * @param i
     * @param yPixel
     * @param endXPixel
     * @param endYPixel
     * @param i1
     * @param xPixel
     */
    public static void BackGroundColor2(int i, int yPixel, int endXPixel, int endYPixel, int i1, int xPixel)
    {
        if(xPixel < startWidth)
        {
        	endXPixel -= startWidth - xPixel;
            xPixel = startWidth;
        }
        if(yPixel < startHeight)
        {
        	endYPixel -= startHeight - yPixel;
            yPixel = startHeight;
        }
        if(xPixel + endXPixel > endWidth)
        	endXPixel = endWidth - xPixel;
        if(yPixel + endYPixel > endHeight)
        	endYPixel = endHeight - yPixel;
        int l1 = 256 - i1;
        int i2 = (i >> 16 & 0xff) * i1;
        int j2 = (i >> 8 & 0xff) * i1;
        int k2 = (i & 0xff) * i1;
        int endXOffset = width - endXPixel;
        int pixelCoord = xPixel + yPixel * width;
        for(int m = 0; m < endYPixel; m++)
        {
            for(int n = -endXPixel; n < 0; n++)
            {
                int l2 = (pixelsArray[pixelCoord] >> 16 & 0xff) * l1;
                int i3 = (pixelsArray[pixelCoord] >> 8 & 0xff) * l1;
                int j3 = (pixelsArray[pixelCoord] & 0xff) * l1;
                int k4 = ((i2 + l2 >> 8) << 16) + ((j2 + i3 >> 8) << 8) + (k2 + j3 >> 8);
                pixelsArray[pixelCoord++] = k4;
            }

            pixelCoord += endXOffset;
        }
    }
    /**
     * Sets background colors for items, scrollbars, loadbars,
     *  prayerinfo screen, magicinfo screen. As far as i know.
     * @param lengthY height of image
     * @param yPixel start height (y-pos)
     * @param xPixel start length (x-pos)
     * @param pixelColor color value
     * @param lengthX length of image
     */
    public static void BackgroundColor1(int lengthY, int yPixel, int xPixel, int pixelColor, int lengthX)
    {
        if(xPixel < startWidth)
        {
        	lengthX -= startWidth - xPixel;
            xPixel = startWidth;
        }
        if(yPixel < startHeight)
        {
        	lengthY -= startHeight - yPixel;
            yPixel = startHeight;
        }
        if(xPixel + lengthX > endWidth)
        	lengthX = endWidth - xPixel;
        if(yPixel + lengthY > endHeight)
        	lengthY = endHeight - yPixel;
        int k1 = width - lengthX;
        int pixelCoord = xPixel + yPixel * width;
        for(int i = -lengthY; i < 0; i++)
        {
            for(int j = -lengthX; j < 0; j++)
            	pixelsArray[pixelCoord++] = pixelColor;

            pixelCoord += k1;
        }

    }

    /**
     * Sets foreground colors for border lines for
     * prayerinfo screeen, equipmentinfo screen,
     * magicinfo screen, loadbars). As far as i know.
     * @param xPixel start length (x-pos)
     * @param lengthX length of image
     * @param lengthY length of image
     * @param pixelColor color value
     * @param yPixel start height (y-pos)
     */
    public static void BorderColor1(int xPixel, int lengthX, int lengthY, int pixelColor, int yPixel)
    {
    	ForegroundColorHoriz1(yPixel, pixelColor, lengthX, xPixel);
    	ForegroundColorHoriz1((yPixel + lengthY) - 1, pixelColor, lengthX, xPixel);
    	ForegroundColorVert1(yPixel, pixelColor, lengthY, xPixel, anInt1376);
    	ForegroundColorVert1(yPixel, pixelColor, lengthY, (xPixel + lengthX) - 1, anInt1376);
    }
    /**
     * Standard border color (used in prayerinfo screeen,
     * equipmentinfo screen, magicinfo screen) if you set i=256,
     * i1=0. Otherwise it produces the same thing as
     * BorderColor1
     * @param yPixel
     * @param j
     * @param k
     * @param l
     * @param endPixel
     * @param xPixel
     */
    public static void BorderColor2(int yPixel, int j, int k, int l, int endPixel, int xPixel)
    {
    	System.out.println(l+" "+k);
    	ForegroundColorHoriz2(l, endPixel, yPixel, k, xPixel);
    	ForegroundColorHoriz2(l, endPixel, (yPixel + j) - 1, k, xPixel);
        if(j >= 3)
        {
        	ForegroundColorVert2(l, xPixel, k, yPixel + 1, j - 2);
        	ForegroundColorVert2(l, (xPixel + endPixel) - 1, k, yPixel + 1, j - 2);
        }
    }

    /**
     * Sets foreground colors for part of scrollbars and
     * some horizontal lines (chat window, prayerinfo screeen,
     * magicinfo screen, loadbars). As far as i know.
     * @param yPixel start height (y-pos)
     * @param pixelColor color value
     * @param lengthX length of image
     * @param xPixel start length (x-pos)
     */
    public static void ForegroundColorHoriz1(int yPixel, int pixelColor, int lengthX, int xPixel)
    {
        if(yPixel < startHeight || yPixel >= endHeight)
            return;
        if(xPixel < startWidth)
        {
        	lengthX -= startWidth - xPixel;
            xPixel = startWidth;
        }
        if(xPixel + lengthX > endWidth)
        	lengthX = endWidth - xPixel;
        int pixelCoord = xPixel + yPixel * width; // represents the pixel (l,i) in the pixelsArray
        for(int relPixIdx = 0; relPixIdx < lengthX; relPixIdx++)
        	pixelsArray[pixelCoord + relPixIdx] = pixelColor;

    }

    /**
     * Same thing as ForegroundColorHoriz1 but used when
     * BorderColor2 is called.
     * @param i
     * @param endPixel
     * @param yPixel
     * @param l
     * @param xPixel
     */
    public static void ForegroundColorHoriz2(int i, int endPixel, int yPixel, int l, int xPixel)
    {
        if(yPixel < startHeight || yPixel >= endHeight)
            return;
        if(xPixel < startWidth)
        {
        	endPixel -= startWidth - xPixel;
            xPixel = startWidth;
        }
        if(xPixel + endPixel > endWidth)
        	endPixel = endWidth - xPixel;
        int j1 = 256 - l;
        int k1 = (i >> 16 & 0xff) * l;
        int l1 = (i >> 8 & 0xff) * l;
        int i2 = (i & 0xff) * l;
        int pixelCoord = xPixel + yPixel * width;
        for(int j3 = 0; j3 < endPixel; j3++)
        {
            int j2 = (pixelsArray[pixelCoord] >> 16 & 0xff) * j1;
            int k2 = (pixelsArray[pixelCoord] >> 8 & 0xff) * j1;
            int l2 = (pixelsArray[pixelCoord] & 0xff) * j1;
            int k3 = ((k1 + j2 >> 8) << 16) + ((l1 + k2 >> 8) << 8) + (i2 + l2 >> 8);
            pixelsArray[pixelCoord++] = k3;
        }

    }

    /**
     * Sets foreground colors for part of scrollbars and
     * some horizontal lines (prayerinfo screeen,
     * magicinfo screen, loadbars). As far as i know.
     * @param yPixel start height (y-pos)
     * @param pixelColor color value
     * @param lengthY length of image
     * @param xPixel start length (x-pos)
     * @param i1 some type of flag
     */
    public static void ForegroundColorVert1(int yPixel, int pixelColor, int lengthY, int xPixel, int i1)
    {
        if(xPixel < startWidth || xPixel >= endWidth)
            return;
        if(yPixel < startHeight)
        {
        	lengthY -= startHeight - yPixel;
            yPixel = startHeight;
        }
        if(yPixel + lengthY > endHeight)
        	lengthY = endHeight - yPixel;
        int pixelCoord = xPixel + yPixel * width;
        if(i1 != anInt1376)
            return;
        for(int relPixIdx = 0; relPixIdx < lengthY; relPixIdx++)
        	pixelsArray[pixelCoord + relPixIdx * width] = pixelColor;

    }

    /**
     * Same thing as ForegroundColorVert1 but used when
     * BorderColor2 is called.
     * @param i
     * @param xPixel
     * @param k
     * @param yPixel
     * @param i1
     */
    public static void ForegroundColorVert2(int i, int xPixel, int k, int yPixel, int endPixel)
    {
        if(xPixel < startWidth || xPixel >= endWidth)
            return;
        if(yPixel < startHeight)
        {
        	endPixel -= startHeight - yPixel;
            yPixel = startHeight;
        }
        if(yPixel + endPixel > endHeight)
        	endPixel = endHeight - yPixel;
        int j1 = 256 - k;
        int k1 = (i >> 16 & 0xff) * k;
        int l1 = (i >> 8 & 0xff) * k;
        int i2 = (i & 0xff) * k;
        int pixelCoord = xPixel + yPixel * width;
        for(int relPixIdx = 0; relPixIdx < endPixel; relPixIdx++)
        {
            int j2 = (pixelsArray[pixelCoord] >> 16 & 0xff) * j1;
            int k2 = (pixelsArray[pixelCoord] >> 8 & 0xff) * j1;
            int l2 = (pixelsArray[pixelCoord] & 0xff) * j1;
            int k3 = ((k1 + j2 >> 8) << 16) + ((l1 + k2 >> 8) << 8) + (i2 + l2 >> 8);
            pixelsArray[pixelCoord] = k3;
            pixelCoord += width;
        }

    }

    public Class30_Sub2_Sub1()
    {
    }

    private static int anInt1376 = -12499;
    public static int pixelsArray[];
    public static int width;
    public static int height;
    public static int startHeight;
    public static int endHeight;
    public static int startWidth;
    public static int endWidth;
    public static int endWidthMinusOne;
    public static int endWidthHalf;
    public static int endHeightHalf;
    public static boolean aBoolean1388;

}
