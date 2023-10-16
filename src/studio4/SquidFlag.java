package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class SquidFlag {

	public static void main(String[] args) throws FileNotFoundException {

		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		int xSize = in.nextInt();
		int ySize = in.nextInt();
		double GotchaArray[][] = new double[xSize][ySize];
		
		
		for(int j = 0; j < ySize; j++)
		{
			for(int i = 0; i < xSize; i++)
			{
				GotchaArray[i][j] = in.nextInt();
			}
		}
		
		
		StdDraw.setXscale(0, xSize);
		StdDraw.setYscale(0, ySize);
		
		double halfWidth = 0.5;
		double halfHeight = 0.5;
		
		double xPosition = halfWidth;
		double yPosition = (ySize - halfHeight);
		
		for(int j = 0; j < ySize; j++)
		{
			xPosition = halfWidth;
			
			for(int i = 0; i < xSize; i++)
			{	
				if(GotchaArray[i][j] == 0)
				{
					StdDraw.setPenColor(255, 255, 255);  //white
					StdDraw.filledRectangle(xPosition, yPosition, halfWidth, halfHeight);
				}
				
				else if(GotchaArray[i][j] == 1)
				{
					StdDraw.setPenColor(0, 0, 0);  //black
					StdDraw.filledRectangle(xPosition, yPosition, halfWidth, halfHeight);
				}
				
				else if(GotchaArray[i][j] == 2)
				{
					StdDraw.setPenColor(187, 223, 209);  //squidward blueish green (187, 223, 209)
					StdDraw.filledRectangle(xPosition, yPosition, halfWidth, halfHeight);
				}
				
				else if(GotchaArray[i][j] == 3)
				{
					StdDraw.setPenColor(253, 240, 188);  //squidward eye yellow (253, 240, 188)
					StdDraw.filledRectangle(xPosition, yPosition, halfWidth, halfHeight);
				}
				
				xPosition += 2 * halfWidth;
			}
			
			yPosition -= 2 * halfHeight;
		}

	}

}
