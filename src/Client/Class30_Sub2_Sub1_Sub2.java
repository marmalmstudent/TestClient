package Client;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

import Client.sign.signlink;

public final class Class30_Sub2_Sub1_Sub2 extends Class30_Sub2_Sub1
{

    public Class30_Sub2_Sub1_Sub2(Class44 class44, String s, int i)
    {
        aBoolean1447 = false;
        anInt1448 = 360;
        aByte1449 = 3;
        Class30_Sub2_Sub2 class30_sub2_sub2 = null;
        class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.loadCache(s + ".dat", null), 891);
        Class30_Sub2_Sub2 class30_sub2_sub2_1 = new Class30_Sub2_Sub2(class44.loadCache("index.dat", null), 891);
        class30_sub2_sub2_1.anInt1406 = class30_sub2_sub2.method410();
        panelWidth = class30_sub2_sub2_1.method410();
        panelHeight = class30_sub2_sub2_1.method410();
        int j = class30_sub2_sub2_1.method408();
        texturesArray1 = new int[j];
        for(int k = 0; k < texturesArray1.length-1; k++)
        	texturesArray1[k + 1] = class30_sub2_sub2_1.method412();

        for(int l = 0; l < i; l++)
        {
            class30_sub2_sub2_1.anInt1406 += 2;
            class30_sub2_sub2.anInt1406 += class30_sub2_sub2_1.method410() * class30_sub2_sub2_1.method410();
            class30_sub2_sub2_1.anInt1406++;
        }

        imageXOffset = class30_sub2_sub2_1.method408();
        imageYOffset = class30_sub2_sub2_1.method408();
        imageWidth = class30_sub2_sub2_1.method410();
        imageHeight = class30_sub2_sub2_1.method410();
        int i1 = class30_sub2_sub2_1.method408();
        int imageArraySize = imageWidth * imageHeight;
        imageArray = new byte[imageArraySize];
        if(i1 == 0)
        {
        	for(int idx = 0; idx < imageArraySize; idx++)
        		imageArray[idx] = class30_sub2_sub2.method409();
        	return;
        }
        if(i1 == 1)
        {
        	for(int x = 0; x < imageWidth; x++)
        	{
        		for(int y = 0; y < imageHeight; y++)
        			imageArray[x + y * imageWidth] = class30_sub2_sub2.method409();
        	}
        }
    }

    /**
     * this method decreases size of the image but it's not clear what
     * happens to the original image stored in imageArray.
     * @param flag
     */
    public void method356(boolean flag)
    {
        panelWidth /= 2;
        panelHeight /= 2;
        byte tmp[] = new byte[panelWidth * panelHeight];
        int idx = 0;
        for(int y = 0; y < imageHeight; y++)
        {
            for(int x = 0; x < imageWidth; x++)
                tmp[(x + imageXOffset >> 1) + (y + imageYOffset >> 1) * panelWidth] = imageArray[idx++];

        }

        imageArray = tmp;
        imageWidth = panelWidth;
        imageHeight = panelHeight;
        imageXOffset = 0;
        if(flag)
        {
            return;
        } else
        {
            imageYOffset = 0;
            return;
        }
    }

    /**
     * puts the image in a new panel with a given size and
     * offset relative to the new panel.
     * @param flag
     */
    public void incImgSizeNoScale(boolean flag)
    {
        if(imageWidth == panelWidth && imageHeight == panelHeight)
            return;
        byte tmp[] = new byte[panelWidth * panelHeight];
        if(flag)
            return;
        int i = 0;
        for(int y = 0; y < imageHeight; y++)
        {
            for(int x = 0; x < imageWidth; x++)
                tmp[x + imageXOffset + (y + imageYOffset) * panelWidth] = imageArray[i++];

        }

        imageArray = tmp;
        imageWidth = panelWidth;
        imageHeight = panelHeight;
        imageXOffset = 0;
        imageYOffset = 0;
    }

    public void flipHoriImageArray(int i)
    {
        if(i != 0)
            return;
        byte tmp[] = new byte[imageWidth * imageHeight];
        int j = 0;
        for(int y = 0; y < imageHeight; y++)
        {
            for(int x = imageWidth - 1; x >= 0; x--)
                tmp[j++] = imageArray[x + y * imageWidth];

        }

        imageArray = tmp;
        imageXOffset = panelWidth - imageWidth - imageXOffset;
    }

    public void flipVertImageArray(boolean flag)
    {
        byte tmp[] = new byte[imageWidth * imageHeight];
        int i = 0;
        for(int y = imageHeight - 1; y >= 0; y--)
        {
            for(int x = 0; x < imageWidth; x++)
                tmp[i++] = imageArray[x + y * imageWidth];

        }

        imageArray = tmp;
        if(!flag)
            anInt1446 = -48;
        imageYOffset = panelHeight - imageHeight - imageYOffset;
    }

    public void method360(int i, int j, int k, int l)
    {
        for(int i1 = 0; i1 < texturesArray1.length; i1++)
        {
            int j1 = texturesArray1[i1] >> 16 & 0xff;
            j1 += i;
            if(j1 < 0)
                j1 = 0;
            else
            if(j1 > 255)
                j1 = 255;
            int k1 = texturesArray1[i1] >> 8 & 0xff;
            k1 += j;
            if(k1 < 0)
                k1 = 0;
            else
            if(k1 > 255)
                k1 = 255;
            int l1 = texturesArray1[i1] & 0xff;
            l1 += k;
            if(l1 < 0)
                l1 = 0;
            else
            if(l1 > 255)
                l1 = 255;
            texturesArray1[i1] = (j1 << 16) + (k1 << 8) + l1; // some objects on the minimap
        }

        if(l != 0)
            anInt1446 = 69;
    }

    public void method361(int x, int flag, int y)
    {
        x += imageXOffset;
        y += imageYOffset;
        int startIdx = x + y * Class30_Sub2_Sub1.width;
        int nbrPixToAdd = 0;
        if(flag != 16083)
            return;
        int tmpImgHeight = imageHeight;
        int tmpImgWidth = imageWidth;
        int l1 = Class30_Sub2_Sub1.width - tmpImgWidth;
        int i2 = 0;
        if(y < Class30_Sub2_Sub1.startHeight)
        {
            int yOffset = Class30_Sub2_Sub1.startHeight - y;
            tmpImgHeight -= yOffset;
            y = Class30_Sub2_Sub1.startHeight;
            nbrPixToAdd += yOffset * tmpImgWidth;
            startIdx += yOffset * Class30_Sub2_Sub1.width;
        }
        if(y + tmpImgHeight > Class30_Sub2_Sub1.endHeight)
        {
            tmpImgHeight -= (y + tmpImgHeight) - Class30_Sub2_Sub1.endHeight;
            // disregard the rest of the pixels
        }
        if(x < Class30_Sub2_Sub1.startWidth)
        {
            int xOffset = Class30_Sub2_Sub1.startWidth - x;
            tmpImgWidth -= xOffset;
            x = Class30_Sub2_Sub1.startWidth;
            nbrPixToAdd += xOffset;
            startIdx += xOffset;
            i2 += xOffset;
            l1 += xOffset;
        }
        if(x + tmpImgWidth > Class30_Sub2_Sub1.endWidth)
        {
            int overflowWidth = (x + tmpImgWidth) - Class30_Sub2_Sub1.endWidth;
            tmpImgWidth -= overflowWidth;
            i2 += overflowWidth;
            l1 += overflowWidth;
        }
        if(tmpImgWidth <= 0 || tmpImgHeight <= 0)
        {
            return;
        } else
        {
            method362(tmpImgHeight, (byte)9, Class30_Sub2_Sub1.pixelsArray, imageArray, l1, startIdx, tmpImgWidth, nbrPixToAdd, texturesArray1, i2); // something about the login screen
            return;
        }
    }

    /**
     * A void function that does not change any class variables?
     * @param cropedImgHeight
     * @param byte0
     * @param pixArray
     * @param imageArray
     * @param j
     * @param k
     * @param cropedImgWidth
     * @param i1
     * @param texture
     * @param j1
     */
    private void method362(int cropedImgHeight, byte byte0, int pixArray[], byte imageArray[], int j, int k, int cropedImgWidth, 
            int i1, int texture[], int j1)
    {
        if(byte0 != 9)
            aBoolean1447 = !aBoolean1447;
        int k1 = -(cropedImgWidth >> 2);
        cropedImgWidth = -(cropedImgWidth & 3);
        for(int l1 = -cropedImgHeight; l1 < 0; l1++)
        {
            for(int i2 = k1; i2 < 0; i2++)
            {
                byte byte1 = imageArray[i1++];
                if(byte1 != 0)
                    pixArray[k++] = texture[byte1 & 0xff];
                else
                    k++;
                byte1 = imageArray[i1++];
                if(byte1 != 0)
                    pixArray[k++] = texture[byte1 & 0xff];
                else
                    k++;
                byte1 = imageArray[i1++];
                if(byte1 != 0)
                    pixArray[k++] = texture[byte1 & 0xff];
                else
                    k++;
                byte1 = imageArray[i1++];
                if(byte1 != 0)
                    pixArray[k++] = texture[byte1 & 0xff];
                else
                    k++;
            }

            for(int j2 = cropedImgWidth; j2 < 0; j2++)
            {
                byte byte2 = imageArray[i1++];
                if(byte2 != 0)
                    pixArray[k++] = texture[byte2 & 0xff];
                else
                    k++;
            }

            k += j;
            i1 += j1;
        }
    }

    private int anInt1446;
    private boolean aBoolean1447;
    private int anInt1448;
    private byte aByte1449;
    public byte imageArray[];
    public int texturesArray1[];
    public int imageWidth;
    public int imageHeight;
    public int imageXOffset;
    public int imageYOffset;
    public int panelWidth;
    public int panelHeight;
}
