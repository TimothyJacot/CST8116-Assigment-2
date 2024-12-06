package assignment2;
/*Student Name: Timothy Jacot
 * Student Number: 041113276
 * Lab Professor: Leanne Seaward
 * Due Date: November 24th 2024
 * Description: CST8116 Assignment 2 Battery Checker object class
 */


public class BatteryChecker {

	//declaring my final epsilon variables
	private static final double EPSILON_DIAMETER = 0.1 + 10E-14;
	private static final double EPSILON_HEIGHT = 0.3 + 10E-14;


	
	public boolean checkWithinTolerance(Battery battery) {
		
		
	
		//instantiating local variables for diameter and height
		double actualDiameter = battery.getDiameter();
		double actualHeight = battery.getHeight();
		
		double expectedDiameter = battery.EXPECTED_DIAMETER;
		double expectedHeight = battery.EXPECTED_HEIGHT;
		
		//setting tolerance for diameter and height using math.abs
		boolean diameterWithinTolerance = Math.abs(actualDiameter - expectedDiameter) <= EPSILON_DIAMETER;
		boolean heightWithinTolerance = Math.abs(actualHeight - expectedHeight) <= EPSILON_HEIGHT; 
		 

		
		//returning diameter and height boolean response
		return diameterWithinTolerance && heightWithinTolerance;

				
	}
}

