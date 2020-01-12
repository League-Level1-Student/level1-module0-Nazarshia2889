package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
		Robot walle = new Robot();
		Robot.setWindowColor(Color.BLACK);
		walle.setX(30);
		walle.setY(500);
		walle.penDown();
		walle.setSpeed(100);
		walle.setPenWidth(5);
		drawHouse(walle);
		
		
		
		
	}
	public void drawHouse(Robot walle) {
		drawFlatRoof(walle, "large", Color.BLUE);
		drawPointyRoof(walle, "small", Color.MAGENTA);
		drawFlatRoof(walle, "large", Color.RED);
		drawFlatRoof(walle, "medium", Color.ORANGE);
		drawPointyRoof(walle, "medium", Color.PINK);
		drawPointyRoof(walle, "small", Color.YELLOW);
		drawFlatRoof(walle, "large", Color.RED);
		drawFlatRoof(walle, "large", Color.ORANGE);
		drawPointyRoof(walle, "medium", Color.BLUE);
		drawPointyRoof(walle, "small", Color.RED);
	}
	public void drawFlatRoof(Robot walle, String shgt, Color c) {
		int height = 0;
		if(shgt.equalsIgnoreCase("small")) {
			height = 60;
		}
		else if(shgt.equalsIgnoreCase("medium")) {
			height = 120;
		}
		else if(shgt.equalsIgnoreCase("large")) {
			height = 250;
		}
		walle.setPenColor(c);
		walle.move(height);
		walle.turn(90);
		walle.move(20);
		walle.turn(90);
		walle.move(height);
		walle.turn(-90);
		walle.setPenColor(Color.GREEN);
		walle.move(15);
		walle.turn(-90);
	}
	public void drawPointyRoof(Robot walle, String shgt, Color c) {
		int height = 0;
		if(shgt.equalsIgnoreCase("small")) {
			height = 60;
		}
		else if(shgt.equalsIgnoreCase("medium")) {
			height = 120;
		}
		else if(shgt.equalsIgnoreCase("large")) {
			height = 250;
		}
		walle.setPenColor(c);
		walle.move(height);
		walle.turn(45);
		walle.move(20);
		walle.turn(90);
		walle.move(20);
		walle.turn(45);
		walle.move(height);
		walle.turn(-90);
		walle.setPenColor(Color.GREEN);
		walle.move(15);
		walle.turn(-90);
	}
	
}
