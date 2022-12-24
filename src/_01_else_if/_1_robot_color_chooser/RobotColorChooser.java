
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;


public class RobotColorChooser {
	public static void main(String[] args) {
		Random ran = new Random();
				
		//1. Create a new Robot
		Robot rob = new Robot();
		
		for (int i = 0; i < 10; i ++) {
		//2. Make the robot draw a shape (this will take more than one line of code)		
			rob.setSpeed(100);
		//3. Set the pen width to 10
			rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
			rob.penDown();
			String color = JOptionPane.showInputDialog(null, "What color: (Red, Orange, Yellow, Green, Blue, Purple");
		
		//5. Use an if/else statement to set the pen color that the user requested
			if (color.equals("Red")) {
				rob.setPenColor(255, 0, 0);
				
			}
			
			else if (color.equals("Orange")) {
				rob.setPenColor(255, 165, 0);
				
			}
			
			else if (color.equals("Yellow")) {
				rob.setPenColor(255,255,0);
				
			}
			
			else if (color.equals("Green")) {
				rob.setPenColor(0, 255, 0);
				
			}
			
			else if (color.equals("Blue")) {
				rob.setPenColor(0, 0, 255);
				
			}
			
			else if (color.equals("Purple")) {
				rob.setPenColor(230,230,250);
				
			}
			
			else {
				rob.setRandomPenColor();
				
			}
			rob.move(50);
			rob.turn(90);
			rob.move(50);
			rob.turn(90);
			rob.move(50);
			rob.turn(90);
			rob.move(50);
			rob.penUp();
		//6. If the user doesn't enter anything, choose a random color
			int num1 = ran.nextInt(500);
			int num2 = ran.nextInt(500);
			rob.setX(num1);
			rob.setY(num2);
			//7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		}

		



	}
}
