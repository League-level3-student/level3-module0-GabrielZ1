package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	//1. make a main method
	public static void main(String[] args) {

		boolean raceEnd = false;
		int x = 0;

		//2. create an array of 5 robots.
		Robot [] robotArray = new Robot [5];
		//3. use a for loop to initialize the robots.
		for(int i = 0; i<5; i++) {
			robotArray[i] = new Robot();
			//4. make each robot start at the bottom of the screen, side by side, facing up
			robotArray[i].setX(250+(100*i));
			robotArray[i].setY(550);
			robotArray[i].setAngle(0);
			robotArray[i].setSpeed(30);
		}
		//5. use another for loop to iterate through the array and make each robot move 
		//   a random amount less than 50.
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		//7. declare that robot the winner and throw it a party!

		while(raceEnd == false) {
			for(int i = 0; i<5; i++) {
				robotArray[i].move(new Random().nextInt(50));

				//7. declare that robot the winner and throw it a party!

				if(robotArray[i].getY()<50) {
					JOptionPane.showMessageDialog(null, "Robot #" + (i+1) + " is the winner!");
					raceEnd = true;
				}
			}
		}

		while (true) {
			for(int i = 0; i<5; i++) {
				robotArray[i].setAngle(x);
			}
			x += 1;
		}

		// 8. try different races with different amounts of robots.
		// 9. make the robots race around a circular track.

	}

}
