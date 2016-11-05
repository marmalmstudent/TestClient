package Client;
import java.awt.*;
import java.awt.image.PixelGrabber;
import java.io.PrintStream;
//import sign.signlink;
import java.io.*;
import java.net.URL;

public final class Class30_Sub2_Sub1_Sub1 extends Class30_Sub2_Sub1
{

	public Class30_Sub2_Sub1_Sub1(int i, int j)
	{
		aBoolean1428 = false;
		anInt1429 = 24869;
		anInt1431 = -32357;
		aByte1432 = 3;
		aBoolean1433 = false;
		anInt1434 = -388;
		aBoolean1436 = true;
		aBoolean1435 = false;
		aBoolean1437 = true;
		aBoolean1438 = false;
		anIntArray1439 = new int[i * j];
		anInt1440 = anInt1444 = i;
		anInt1441 = anInt1445 = j;
		anInt1442 = anInt1443 = 0;
	}

	public Class30_Sub2_Sub1_Sub1(byte abyte0[], Component component)
	{
		aBoolean1428 = false;
		anInt1429 = 24869;
		anInt1431 = -32357;
		aByte1432 = 3;
		aBoolean1433 = false;
		anInt1434 = -388;
		aBoolean1435 = false;
		aBoolean1436 = true;
		aBoolean1437 = true;
		aBoolean1438 = false;
		try
		{
			//Image image = Toolkit.getDefaultToolkit().createImage(abyte0);

			/*
			 * ./src/Images/background.png as we are in the project package "Client".
			 * otherwise it's just background.png
			 */
			Image image = Toolkit.getDefaultToolkit().getImage("./src/Images/background.png");
			MediaTracker mediatracker = new MediaTracker(component);
			mediatracker.addImage(image, 0);
			mediatracker.waitForAll();
			anInt1440 = image.getWidth(component);
			anInt1441 = image.getHeight(component);
			anInt1444 = anInt1440;
			anInt1445 = anInt1441;
			anInt1442 = 0;
			anInt1443 = 0;
			anIntArray1439 = new int[anInt1440 * anInt1441];
			PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
			pixelgrabber.grabPixels();
			return;
		}
		catch(Exception exception)
		{
			System.out.println("Error converting jpg");
		}
	}

	public Class30_Sub2_Sub1_Sub1(Class44 class44, String s, int i)
	{
		aBoolean1428 = false;
		anInt1429 = 24869;
		anInt1431 = -32357;
		aByte1432 = 3;
		aBoolean1433 = false;
		anInt1434 = -388;
		aBoolean1435 = false;
		aBoolean1436 = true;
		aBoolean1437 = true;
		aBoolean1438 = false;
		Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.loadCache((new StringBuilder()).append(s).append(".dat").toString(), ((byte []) (null))), 891);
		Class30_Sub2_Sub2 class30_sub2_sub2_1 = new Class30_Sub2_Sub2(class44.loadCache("index.dat", ((byte []) (null))), 891);
		class30_sub2_sub2_1.anInt1406 = class30_sub2_sub2.method410();
		anInt1444 = class30_sub2_sub2_1.method410();
		anInt1445 = class30_sub2_sub2_1.method410();
		int j = class30_sub2_sub2_1.method408();
		int ai[] = new int[j];
		for (int k = 0; k < j - 1; k++)
		{
			ai[k + 1] = class30_sub2_sub2_1.method412();
			if (ai[k + 1] == 0)
				ai[k + 1] = 1;
		}

		for (int l = 0; l < i; l++)
		{
			class30_sub2_sub2_1.anInt1406 += 2;
			class30_sub2_sub2.anInt1406 += class30_sub2_sub2_1.method410() * class30_sub2_sub2_1.method410();
			class30_sub2_sub2_1.anInt1406++;
		}

		anInt1442 = class30_sub2_sub2_1.method408();
		anInt1443 = class30_sub2_sub2_1.method408();
		anInt1440 = class30_sub2_sub2_1.method410();
		anInt1441 = class30_sub2_sub2_1.method410();
		int i1 = class30_sub2_sub2_1.method408();
		int j1 = anInt1440 * anInt1441;
		anIntArray1439 = new int[j1];
		//writeTemp(""+s+" "+i+"", "Sprite_Dump.txt");
		if (s.startsWith("back") || s.startsWith("BACK"))
		{
			try
			{
				if(s.equals("backleft1") && i == 0)
				{
					anInt1440 = anInt1444 = 4;
					anInt1441 = anInt1445 = 334;
				}
				if(s.equals("backleft2") && i == 0)
				{
					anInt1440 = anInt1444 = 7;
					anInt1441 = anInt1445 = 128;
				}
				if(s.equals("backright1") && i == 0)
				{
					anInt1440 = anInt1444 = 48;
					anInt1441 = anInt1445 = 156;
				}
				if(s.equals("backright2") && i == 0)
				{
					anInt1440 = anInt1444 = 28;
					anInt1441 = anInt1445 = 261;
				}
				if(s.equals("backtop1") && i == 0)
				{
					anInt1440 = anInt1444 = 249; //765
					anInt1441 = anInt1445 = 4;
				}
				if(s.equals("backvmid1") && i == 0)
				{
					anInt1440 = anInt1444 = 29;
					anInt1441 = anInt1445 = 156;
				}
				if(s.equals("backvmid2") && i == 0)
				{
					anInt1440 = anInt1444 = 31;
					anInt1441 = anInt1445 = 261;
				}
				if(s.equals("backvmid3") && i == 0)
				{
					anInt1440 = anInt1444 = 4;
					anInt1441 = anInt1445 = 128;
				}
				if(s.equals("backhmid2") && i == 0)
				{
					anInt1440 = anInt1444 = 516;
					anInt1441 = anInt1445 = 7;
				}
				if(s.equals("backbase1") && i == 0)
				{
					anInt1440 = anInt1444 = 516;
					anInt1441 = anInt1445 = 30;
				}
				if(s.equals("backbase2") && i == 0)
				{
					anInt1440 = anInt1444 = 249;
					anInt1441 = anInt1445 = 38;
				}
				if(s.equals("backhmid1") && i == 0)
				{
					anInt1440 = anInt1444 = 249;
					anInt1441 = anInt1445 = 36;
				}
				Image image = Toolkit.getDefaultToolkit().getImage("./src/Client/Sprites/"+s.toUpperCase()+" "+i+".png");
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();

			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}
		else if (s.startsWith("mapback") || s.startsWith("MAPBACK"))
		{
			try
			{
				anInt1440 = anInt1444 = 172;
				anInt1441 = anInt1445 = 156;
				Image image = Toolkit.getDefaultToolkit().getImage("./src/Client/Sprites/MAPBACK 0.png");
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();

			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}/* else if (s.startsWith("headicons_prayer"))
		{
			try
			{
				System.out.println("Width: "+anInt1440+" Height: "+anInt1441);
				Image image = Toolkit.getDefaultToolkit().getImage("./src/Client/Sprites/"+s+" "+i+".png");
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}*/ else if (s.startsWith("sideicon") || s.startsWith("SIDEICON"))
		{
			try
			{
				Image image;
				if(s.startsWith("SIDEICONS"))
					image = Toolkit.getDefaultToolkit().getImage("./src/Client/Sprites/"+s+" 13.png");
				else
					image = Toolkit.getDefaultToolkit().getImage("./src/Client/Sprites/"+s.toUpperCase()+" "+i+".png");
				/* without the ancient book icon
				Image image = Toolkit.getDefaultToolkit().getImage("./src/Client/Sprites/"+s.toUpperCase()+" "+i+".png");
				*/
				anInt1440 = 35;
				anInt1441 = 35;
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();

			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}
		else if (s.startsWith("staticons") || s.startsWith("STATICONS"))
		{
			try
			{
				Image image = Toolkit.getDefaultToolkit().getImage("./src/Client/Sprites/"+s.toUpperCase()+" "+i+".png");
				anInt1440 = 30;
				anInt1441 = 30;
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}
		else if (s.startsWith("chat") || s.startsWith("CHAT"))
		{
			try
			{
				if(s.equals("chatback") && i == 0)
				{
					anInt1440 = anInt1444 = 505;
					anInt1441 = anInt1445 = 128;
				}
				Image image = Toolkit.getDefaultToolkit().getImage("./src/Client/Sprites/CHATBACK 0.png");
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();

			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}

		else if (s.startsWith("redstone2") || s.startsWith("REDSTONE2"))
		{
			try
			{
				Image image = Toolkit.getDefaultToolkit().getImage("./src/Client/Sprites/REDSTONE2 0.png");
				anInt1440 = 38;
				anInt1441 = 38;
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();

			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}
		else if (s.startsWith("redstone1") || s.startsWith("REDSTONE1"))
		{
			try
			{
				anInt1440 = 38;
				anInt1441 = 38;
				anIntArray1439 = new int[anInt1440 * anInt1441];
				Image image = Toolkit.getDefaultToolkit().getImage("./src/Client/Sprites/REDSTONE1 0.png");
				if(client.flip) { image = Toolkit.getDefaultToolkit().getImage("./src/Client/Sprites/REDSTONE1 1.png"); }
				if(client.flip_s) { image = Toolkit.getDefaultToolkit().getImage("./src/Client/Sprites/REDSTONE1 2.png"); }
				if(client.flip_r) { image = Toolkit.getDefaultToolkit().getImage("./src/Client/Sprites/REDSTONE1 3.png"); }
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();

			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}
		else if (s.startsWith("scroll") || s.startsWith("SCROLL"))
		{
			try
			{
				Image image = Toolkit.getDefaultToolkit().getImage("./src/Client/Sprites/"+s.toUpperCase()+" "+i+".png");
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();

			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}
		else if (s.equalsIgnoreCase("invback") || s.startsWith("INVBACK"))
		{
			try
			{
				anInt1440 = anInt1444 = 190;
				anInt1441 = anInt1445 = 261;
				Image image = Toolkit.getDefaultToolkit().getImage("./src/Client/Sprites/"+s.toUpperCase()+" "+i+".png");
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();

			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}
		else if (s.startsWith("headicons_prayer") && i == 6)
		{
			try
			{

				Image image = Toolkit.getDefaultToolkit().getImage("./src/Client/Sprites/"+s+" "+i+".png");

				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}

		else if (s.equalsIgnoreCase("compass") || s.startsWith("COMPASS"))
		{
			try
			{
				Image image = Toolkit.getDefaultToolkit().getImage("./src/Client/Sprites/COMPASS 0.png");
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}
		else {
			if(i1 == 0)
			{
				for(int k1 = 0; k1 < j1; k1++)
					anIntArray1439[k1] = ai[class30_sub2_sub2.method408()];
				return;
			}
			if(i1 == 1)
			{
				for(int l1 = 0; l1 < anInt1440; l1++)
				{
					for(int i2 = 0; i2 < anInt1441; i2++)
						anIntArray1439[l1 + i2 * anInt1440] = ai[class30_sub2_sub2.method408()];

				}
			}
		}
	}
	public static void writeTemp(String tempData, String tempFile) {
		try {
			BufferedWriter LV = new BufferedWriter(new FileWriter(tempFile, true));
			LV.write(tempData); LV.newLine();
			LV.flush();
		} catch(IOException IOE) {}
	}
	public void method343(int i)
	{
		if(i != 0)
			aBoolean1438 = !aBoolean1438;
		Class30_Sub2_Sub1.method331(anInt1441, anInt1440, anIntArray1439);
	}

	public void method344(int i, int j, int k, int l)
	{
		if(l != 0)
			anInt1430 = 314;
		for(int i1 = 0; i1 < anIntArray1439.length; i1++)
		{
			int j1 = anIntArray1439[i1];
			if(j1 != 0)
			{
				int k1 = j1 >> 16 & 0xff;
				k1 += i;
				if(k1 < 1)
					k1 = 1;
				else
					if(k1 > 255)
						k1 = 255;
				int l1 = j1 >> 8 & 0xff;
				l1 += j;
				if(l1 < 1)
					l1 = 1;
				else
					if(l1 > 255)
						l1 = 255;
				int i2 = j1 & 0xff;
				i2 += k;
				if(i2 < 1)
					i2 = 1;
				else
					if(i2 > 255)
						i2 = 255;
				anIntArray1439[i1] = (k1 << 16) + (l1 << 8) + i2;
			}
		}

	}

	public void method345(int i)
	{
		int ai[] = new int[anInt1444 * anInt1445];
		if(i != 5059)
			anInt1429 = -247;
		for(int j = 0; j < anInt1441; j++)
		{
			for(int k = 0; k < anInt1440; k++)
				ai[(j + anInt1443) * anInt1444 + (k + anInt1442)] = anIntArray1439[j * anInt1440 + k];

		}

		anIntArray1439 = ai;
		anInt1440 = anInt1444;
		anInt1441 = anInt1445;
		anInt1442 = 0;
		anInt1443 = 0;
	}

	public void method346(int i, int j, int k)
	{
		i += anInt1442;
		j += anInt1443;
		int l = i + j * Class30_Sub2_Sub1.width;
		int i1 = 0;
		int j1 = anInt1441;
		int k1 = anInt1440;
		int l1 = Class30_Sub2_Sub1.width - k1;
		int i2 = 0;
		if(k != anInt1431)
			aBoolean1438 = !aBoolean1438;
		if(j < Class30_Sub2_Sub1.startHeight)
		{
			int j2 = Class30_Sub2_Sub1.startHeight - j;
			j1 -= j2;
			j = Class30_Sub2_Sub1.startHeight;
			i1 += j2 * k1;
			l += j2 * Class30_Sub2_Sub1.width;
		}
		if(j + j1 > Class30_Sub2_Sub1.endHeight)
			j1 -= (j + j1) - Class30_Sub2_Sub1.endHeight;
		if(i < Class30_Sub2_Sub1.startWidth)
		{
			int k2 = Class30_Sub2_Sub1.startWidth - i;
			k1 -= k2;
			i = Class30_Sub2_Sub1.startWidth;
			i1 += k2;
			l += k2;
			i2 += k2;
			l1 += k2;
		}
		if(i + k1 > Class30_Sub2_Sub1.endWidth)
		{
			int l2 = (i + k1) - Class30_Sub2_Sub1.endWidth;
			k1 -= l2;
			i2 += l2;
			l1 += l2;
		}
		if(k1 <= 0 || j1 <= 0)
		{
			return;
		} else
		{
			method347(l, k1, j1, i2, i1, 28339, l1, anIntArray1439, Class30_Sub2_Sub1.pixelsArray);
			return;
		}
	}

	private void method347(int i, int j, int k, int l, int i1, int j1, int k1,
			int ai[], int ai1[])
	{
		int l1 = -(j >> 2);
		j = -(j & 3);
		for(int i2 = -k; i2 < 0; i2++)
		{
			for(int j2 = l1; j2 < 0; j2++)
			{
				ai1[i++] = ai[i1++];
				ai1[i++] = ai[i1++];
				ai1[i++] = ai[i1++];
				ai1[i++] = ai[i1++];
			}

			for(int k2 = j; k2 < 0; k2++)
				ai1[i++] = ai[i1++];

			i += k1;
			i1 += l;
		}

		if(j1 != 28339)
			anInt1431 = 90;
	}

	public void method348(int xCoord, int j, int yCoord)
	{
		xCoord += anInt1442;
		yCoord += anInt1443;
		if(j != 16083)
			return;
		int l = xCoord + yCoord * Class30_Sub2_Sub1.width;
		int i1 = 0;
		int j1 = anInt1441;
		int k1 = anInt1440;
		int l1 = Class30_Sub2_Sub1.width - k1;
		int i2 = 0;
		if(yCoord < Class30_Sub2_Sub1.startHeight)
		{
			int j2 = Class30_Sub2_Sub1.startHeight - yCoord;
			j1 -= j2;
			yCoord = Class30_Sub2_Sub1.startHeight;
			i1 += j2 * k1;
			l += j2 * Class30_Sub2_Sub1.width;
		}
		if(yCoord + j1 > Class30_Sub2_Sub1.endHeight)
			j1 -= (yCoord + j1) - Class30_Sub2_Sub1.endHeight;
		if(xCoord < Class30_Sub2_Sub1.startWidth)
		{
			int k2 = Class30_Sub2_Sub1.startWidth - xCoord;
			k1 -= k2;
			xCoord = Class30_Sub2_Sub1.startWidth;
			i1 += k2;
			l += k2;
			i2 += k2;
			l1 += k2;
		}
		if(xCoord + k1 > Class30_Sub2_Sub1.endWidth)
		{
			int l2 = (xCoord + k1) - Class30_Sub2_Sub1.endWidth;
			k1 -= l2;
			i2 += l2;
			l1 += l2;
		}
		if(k1 <= 0 || j1 <= 0)
		{
			return;
		} else
		{
			method349(Class30_Sub2_Sub1.pixelsArray, anIntArray1439, 0, i1, l, k1, j1, l1, i2);
			return;
		}
	}

	private void method349(int AllPixelsArray[], int ImgPixelsArray[], int i, int j, int k, int ImgWidth, int ImgHeight, 
			int j1, int k1)
	{
		int l1 = -(ImgWidth >> 2);
		ImgWidth = -(ImgWidth & 3);
        for(int i2 = -ImgHeight; i2 < 0; i2++)
        {
            for(int j2 = l1; j2 < 0; j2++)
            {
                i = ImgPixelsArray[j++];
                if(i != 0 && i != -1)
                {
                	AllPixelsArray[k++] = i;
                } else
                {
                    k++;
                }
                i = ImgPixelsArray[j++];
                if(i != 0 && i != -1)
                {
                	AllPixelsArray[k++] = i;
                } else
                {
                    k++;
                }
                i = ImgPixelsArray[j++];
                if(i != 0 && i != -1)
                {
                	AllPixelsArray[k++] = i;
                } else
                {
                    k++;
                }
                i = ImgPixelsArray[j++];
                if(i != 0 && i != -1)
                {
                	AllPixelsArray[k++] = i;
                } else
                {
                    k++;
                }
            }

            for(int k2 = ImgWidth; k2 < 0; k2++)
            {
                i = ImgPixelsArray[j++];
                if(i != 0 && i != -1)
                {
                	AllPixelsArray[k++] = i;
                } else
                {
                    k++;
                }
            }

            k += j1;
            j += k1;
        }
	}

	public void method350(int i, int j, int k, boolean flag)
	{
		i += anInt1442;
		if(flag)
		{
			for(int l = 1; l > 0; l++);
		}
		j += anInt1443;
		int i1 = i + j * Class30_Sub2_Sub1.width;
		int j1 = 0;
		int k1 = anInt1441;
		int l1 = anInt1440;
		int i2 = Class30_Sub2_Sub1.width - l1;
		int j2 = 0;
		if(j < Class30_Sub2_Sub1.startHeight)
		{
			int k2 = Class30_Sub2_Sub1.startHeight - j;
			k1 -= k2;
			j = Class30_Sub2_Sub1.startHeight;
			j1 += k2 * l1;
			i1 += k2 * Class30_Sub2_Sub1.width;
		}
		if(j + k1 > Class30_Sub2_Sub1.endHeight)
			k1 -= (j + k1) - Class30_Sub2_Sub1.endHeight;
		if(i < Class30_Sub2_Sub1.startWidth)
		{
			int l2 = Class30_Sub2_Sub1.startWidth - i;
			l1 -= l2;
			i = Class30_Sub2_Sub1.startWidth;
			j1 += l2;
			i1 += l2;
			j2 += l2;
			i2 += l2;
		}
		if(i + l1 > Class30_Sub2_Sub1.endWidth)
		{
			int i3 = (i + l1) - Class30_Sub2_Sub1.endWidth;
			l1 -= i3;
			j2 += i3;
			i2 += i3;
		}
		if(l1 <= 0 || k1 <= 0)
		{
			return;
		} else
		{
			method351(j1, l1, Class30_Sub2_Sub1.pixelsArray, 0, anIntArray1439, j2, k1, i2, k, i1, 8);
			return;
		}
	}

	private void method351(int i, int j, int ai[], int k, int ai1[], int l, int i1,
			int j1, int k1, int l1, int i2)
	{
		int j2 = 256 - k1;
		for(int k2 = -i1; k2 < 0; k2++)
		{
			for(int l2 = -j; l2 < 0; l2++)
			{
				k = ai1[i++];
				if(k != 0)
				{
					int i3 = ai[l1];
					ai[l1++] = ((k & 0xff00ff) * k1 + (i3 & 0xff00ff) * j2 & 0xff00ff00) + ((k & 0xff00) * k1 + (i3 & 0xff00) * j2 & 0xff0000) >> 8;
				} else
				{
					l1++;
				}
			}

			l1 += j1;
			i += l;
		}

		if(i2 < 8 || i2 > 8)
			aBoolean1428 = !aBoolean1428;
	}

	public void method352(int i, int j, int ai[], int k, int ai1[], int l, int i1,
			int j1, int k1, int l1, int i2)
	{
		while(l >= 0)
			anInt1434 = 362;
		try
		{
			int j2 = -l1 / 2;
			int k2 = -i / 2;
			int l2 = (int)(Math.sin((double)j / 326.11000000000001D) * 65536D);
			int i3 = (int)(Math.cos((double)j / 326.11000000000001D) * 65536D);
			l2 = l2 * k >> 8;
		i3 = i3 * k >> 8;
		int j3 = (i2 << 16) + (k2 * l2 + j2 * i3);
		int k3 = (i1 << 16) + (k2 * i3 - j2 * l2);
		int l3 = k1 + j1 * Class30_Sub2_Sub1.width;
		for(j1 = 0; j1 < i; j1++)
		{
			int i4 = ai1[j1];
			int j4 = l3 + i4;
			int k4 = j3 + i3 * i4;
			int l4 = k3 - l2 * i4;
			for(k1 = -ai[j1]; k1 < 0; k1++)
			{
				Class30_Sub2_Sub1.pixelsArray[j4++] = anIntArray1439[(k4 >> 16) + (l4 >> 16) * anInt1440];
				k4 += i3;
				l4 -= l2;
			}

			j3 += l2;
			k3 += i3;
			l3 += Class30_Sub2_Sub1.width;
		}

		return;
		}
		catch(Exception _ex)
		{
			return;
		}
	}

	public void method353(int i, int j, int k, int l, int i1, int j1, int k1,
			double d, int l1)
	{
		if(i1 != 41960)
			return;
		try
		{
			int i2 = -k / 2;
			int j2 = -k1 / 2;
			int k2 = (int)(Math.sin(d) * 65536D);
			int l2 = (int)(Math.cos(d) * 65536D);
			k2 = k2 * j1 >> 8;
		l2 = l2 * j1 >> 8;
			int i3 = (l << 16) + (j2 * k2 + i2 * l2);
			int j3 = (j << 16) + (j2 * l2 - i2 * k2);
			int k3 = l1 + i * Class30_Sub2_Sub1.width;
			for(i = 0; i < k1; i++)
			{
				int l3 = k3;
				int i4 = i3;
				int j4 = j3;
				for(l1 = -k; l1 < 0; l1++)
				{
					int k4 = anIntArray1439[(i4 >> 16) + (j4 >> 16) * anInt1440];
					if(k4 != 0)
						Class30_Sub2_Sub1.pixelsArray[l3++] = k4;
					else
						l3++;
					i4 += l2;
					j4 -= k2;
				}

				i3 += k2;
				j3 += l2;
				k3 += Class30_Sub2_Sub1.width;
			}

			return;
		}
		catch(Exception _ex)
		{
			return;
		}
	}

	public void method354(Class30_Sub2_Sub1_Sub2 class30_sub2_sub1_sub2, boolean flag, int i, int j)
	{
		j += anInt1442;
		i += anInt1443;
		int k = j + i * Class30_Sub2_Sub1.width;
		int l = 0;
		if(flag)
			anInt1429 = -364;
		int i1 = anInt1441;
		int j1 = anInt1440;
		int k1 = Class30_Sub2_Sub1.width - j1;
		int l1 = 0;
		if(i < Class30_Sub2_Sub1.startHeight)
		{
			int i2 = Class30_Sub2_Sub1.startHeight - i;
			i1 -= i2;
			i = Class30_Sub2_Sub1.startHeight;
			l += i2 * j1;
			k += i2 * Class30_Sub2_Sub1.width;
		}
		if(i + i1 > Class30_Sub2_Sub1.endHeight)
			i1 -= (i + i1) - Class30_Sub2_Sub1.endHeight;
		if(j < Class30_Sub2_Sub1.startWidth)
		{
			int j2 = Class30_Sub2_Sub1.startWidth - j;
			j1 -= j2;
			j = Class30_Sub2_Sub1.startWidth;
			l += j2;
			k += j2;
			l1 += j2;
			k1 += j2;
		}
		if(j + j1 > Class30_Sub2_Sub1.endWidth)
		{
			int k2 = (j + j1) - Class30_Sub2_Sub1.endWidth;
			j1 -= k2;
			l1 += k2;
			k1 += k2;
		}
		if(j1 <= 0 || i1 <= 0)
		{
			return;
		} else
		{
			// related to putting icons on the minimap (dungeon, minigame, shops)
			method355(anIntArray1439, j1, class30_sub2_sub1_sub2.imageArray, i1, Class30_Sub2_Sub1.pixelsArray, 0, aBoolean1436, k1, k, l1, l);
			return;
		}
	}

	private void method355(int ai[], int i, byte abyte0[], int j, int ai1[], int k, boolean flag,
			int l, int i1, int j1, int k1)
	{
		int l1 = -(i >> 2);
		if(!flag)
		{
			for(int i2 = 1; i2 > 0; i2++);
		}
		i = -(i & 3);
		for(int j2 = -j; j2 < 0; j2++)
		{
			for(int k2 = l1; k2 < 0; k2++)
			{
				k = ai[k1++];
				if(k != 0 && abyte0[i1] == 0)
					ai1[i1++] = k;
				else
					i1++;
				k = ai[k1++];
				if(k != 0 && abyte0[i1] == 0)
					ai1[i1++] = k;
				else
					i1++;
				k = ai[k1++];
				if(k != 0 && abyte0[i1] == 0)
					ai1[i1++] = k;
				else
					i1++;
				k = ai[k1++];
				if(k != 0 && abyte0[i1] == 0)
					ai1[i1++] = k;
				else
					i1++;
			}

			for(int l2 = i; l2 < 0; l2++)
			{
				k = ai[k1++];
				if(k != 0 && abyte0[i1] == 0)
					ai1[i1++] = k;
				else
					i1++;
			}

			i1 += l;
			k1 += j1;
		}

	}

	private boolean aBoolean1428;
	private int anInt1429;
	private int anInt1430;
	private int anInt1431;
	private byte aByte1432;
	private boolean aBoolean1433;
	private int anInt1434;
	private boolean aBoolean1435;
	private boolean aBoolean1436;
	private boolean aBoolean1437;
	private boolean aBoolean1438;
	public int anIntArray1439[];
	public int anInt1440;
	public int anInt1441;
	public int anInt1442;
	public int anInt1443;
	public int anInt1444;
	public int anInt1445;

}
