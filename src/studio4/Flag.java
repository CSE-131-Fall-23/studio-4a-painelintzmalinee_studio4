package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		File file = new File(Flag.class.getResource("resources/Images").getFile());
		String[] imageList = file.list();
		String imageName = imageList[0];
		StdDraw.picture(0, 0, imageName);
		
	}
}