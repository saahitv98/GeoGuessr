package Gainsbot22;

import java.io.File;

import javax.swing.*;

public class GameController
{
	private Window1Panel window1Panel;
	private JFrame window1;
	
	private static final String[] levelNames = 
		{
			null,
			"Level 1",
			"Level 2",
			"Level 3",
			"Level 4",
			"Level 5",
			"Level 6",
			"Level 7",
			"Level 8",
			"Level 9",
			"Level 10"
		};
	private static final File[] fileNames = 
		{
			null, 
			new File("1.jpg"),
			new File("2.jpg"),
			new File("3.jpg"),
			new File("4.jpg"),
			new File("5.jpg"),
			new File("6.jpg"),
			new File("7.jpg"),
			new File("8.jpg"),
			new File("9.jpg"),
			new File("10.jpg")
		};
	
	public GameController(int level)
	{
		if (level > 0 && level < levelNames.length)
		{
			this.window1Panel = new Window1Panel(levelNames[level], fileNames[level]);
			this.window1 = new JFrame("dont worry about it");
			this.window1.setContentPane(this.window1Panel);
			this.setLevel(level);
			this.window1.setSize(500, 500);
			this.window1.setVisible(true);
		} else
		{
			System.err.println("Error: cannot open level " + level);
			System.exit(69);
		}
	}
	
	public void setLevel(int level)
	{
		window1Panel.setLevelName("Level " + level);
		window1Panel.setPicture(new File(level + ".jpg"));
		this.window1.setContentPane(this.window1Panel);
		this.window1.repaint();
	}

	public static int getLevel()
	{
		int n=1;
		return n;
	}
}
