package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRaceCircle {
	// 8. try different races with different amounts of robots.
	// 9. make the robots race around a circular track.
	public static void main(String[] args) {

		boolean raceEnd = false;
		int x = 0;

		Robot [] robotArray = new Robot [5];

		for(int i = 0; i<3; i++) {
			robotArray[i] = new Robot();

			robotArray[i].setX(150);
			robotArray[i].setY(350);
			robotArray[i].setAngle(0);
			robotArray[i].setSpeed(30);

		}


		while(raceEnd == false) {

			for(int i = 0; i<3; i++) {
				robotArray[i].move(new Random().nextInt(50));

				if(robotArray[i].getY()<400 && robotArray[i].getY()>325 && robotArray[i].getX()<500) {
					robotArray[i].setAngle(15);
				}

				if(robotArray[i].getY()<325 && robotArray[i].getY()>250 && robotArray[i].getX()<500) {
					robotArray[i].setAngle(30);
				}

				if(robotArray[i].getY()<250 && robotArray[i].getY()>200 && robotArray[i].getX()<500) {
					robotArray[i].setAngle(45);
				}

				if(robotArray[i].getY()<200 && robotArray[i].getY()>150 && robotArray[i].getX()<500) {
					robotArray[i].setAngle(60);
				}

				if(robotArray[i].getY()<150 && robotArray[i].getY()>100 && robotArray[i].getX()<500) {
					robotArray[i].setAngle(60);
				}

				if(robotArray[i].getY()<100 && robotArray[i].getY()>50 && robotArray[i].getX()<500) {
					robotArray[i].setAngle(90);
				}



				if(robotArray[i].getX()>500 && robotArray[i].getX()<525 && robotArray[i].getY()<300) {
					robotArray[i].setAngle(105);
				}

				if(robotArray[i].getX()>525 && robotArray[i].getX()<550 && robotArray[i].getY()<300) {
					robotArray[i].setAngle(120);
				}

				if(robotArray[i].getX()>550 && robotArray[i].getX()<575 && robotArray[i].getY()<300) {
					robotArray[i].setAngle(135);
				}

				if(robotArray[i].getX()>575 && robotArray[i].getX()<600 && robotArray[i].getY()<300) {
					robotArray[i].setAngle(150);
				}

				if(robotArray[i].getX()>600 && robotArray[i].getX()<625 && robotArray[i].getY()<300) {
					robotArray[i].setAngle(165);
				}

				if(robotArray[i].getX()>625 && robotArray[i].getX()<650 && robotArray[i].getY()<300) {
					robotArray[i].setAngle(180);
				}



				if(robotArray[i].getY()<350 && robotArray[i].getY()>300 && robotArray[i].getX()>160) {
					robotArray[i].setAngle(195);
				}

				if(robotArray[i].getY()<400 && robotArray[i].getY()>350 && robotArray[i].getX()>160) {
					robotArray[i].setAngle(210);
				}

				if(robotArray[i].getY()<450 && robotArray[i].getY()>400 && robotArray[i].getX()>160) {
					robotArray[i].setAngle(225);
				}

				if(robotArray[i].getY()<500 && robotArray[i].getY()>450 && robotArray[i].getX()>160) {
					robotArray[i].setAngle(240);
				}

				if(robotArray[i].getY()<550 && robotArray[i].getY()>500 && robotArray[i].getX()>160) {
					robotArray[i].setAngle(255);
				}

				if(robotArray[i].getY()<600 && robotArray[i].getY()>550 && robotArray[i].getX()>160) {
					robotArray[i].setAngle(270);
				}



				if(robotArray[i].getY()<600 && robotArray[i].getY()>550 && robotArray[i].getX()<200) {
					robotArray[i].setAngle(315);
				}

				if(robotArray[i].getY()<600 && robotArray[i].getY()>550 && robotArray[i].getX()<175) {
					robotArray[i].setAngle(360);
				}


				if(robotArray[i].getY()>350 && robotArray[i].getY()<400 && robotArray[i].getX()<200) {
					JOptionPane.showMessageDialog(null, "Robot #" + (i+1) + " is the winner!");
					raceEnd = true;
				}

			}
		}

		while (true) {
			for(int i = 0; i<3; i++) {
				robotArray[i].setAngle(x);
			}
			x += 1;
		}



	}

}
