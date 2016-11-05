package Client;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import java.awt.*;

public class EGUI
{
	public static int translateGameX;
	public static int translateGameY;
	public static int updateFrameHz = 50;
	public static int updateFrameInterval = 1000/updateFrameHz;
	public static long lastFrameUpdate;
    public static final int MAX_WIDTH = 3200;
    public static final int MAX_HEIGHT = 1800;
	
	public static void main(String args[])
	{
    	translateGameX = 2;
    	translateGameY = 23;
		String[] clientArgs = {"127.0.0.1"};
		client.main(clientArgs);
	}
	
	public static void write(String filename, byte[]x) throws IOException{
		  BufferedWriter outputWriter = null;
		  outputWriter = new BufferedWriter(new FileWriter(filename));
		  for (int i = 0; i < x.length; i++) {
		    // Maybe:
		    //outputWriter.write(x[i]+"");
		    // Or:
		    outputWriter.write(Integer.toString(x[i]));
		    outputWriter.newLine();
		  }
		  outputWriter.flush();  
		  outputWriter.close();  
		}
}