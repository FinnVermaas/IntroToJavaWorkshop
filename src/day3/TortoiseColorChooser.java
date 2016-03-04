package day3;

// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class TortoiseColorChooser {
	public static void main(String[] args) {
		Robot the = new Robot();
		while (true) {
			// 3. ask the user what color they would like the tortoise to draw
			String color = JOptionPane.showInputDialog(null, "what color would you like the robot to draw?");
			// 4. use an if/else statement to set the pen color that the user requested
the.penDown();
the.setPenWidth(10);
			if (color.equals("red")) {
				the.setPenColor(Color.red);
			} else if (color.equals("blue")) {
				the.setPenColor(Color.blue);
			} else if (color.equals("green")) {
				the.setPenColor(Color.green);
			} else if (color.equals("black")) {
				the.setPenColor(Color.black);
			} else {
				JOptionPane.showMessageDialog(null, "to bad");
			}
			// 5. if the user doesn’t enter anything, choose a random color

			// 6. put a loop around your code so that you keep asking the user for more colors & drawing them

			// 2. set the pen width to 10//
			the.setPenWidth(10);

			for (int i = 0; i < 8; i++) {
			the.move(100);
			the.turn(45);	
			}
		}
	}
}