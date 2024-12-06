package assignment2;
/* Name: Timothy Jacot
 * Lab Professor: Nilam
 * Due Date: November 24th 2024
 * Assessment: Assignment 02
 * Description: CST8116 Assignment 2 main method Driver class
 */
public class Driver {

	public static void main(String[] args) {
		BatteryChecker batteryChecker = new BatteryChecker();
		Battery battery = new Battery();
		//instantiating and declaring boolean statement for while loop.
		boolean continueUserInput = true;
		//instantiating out-of-tolerance amount variable.
		int batteriesOutsideTolerance = 0;

		//starting while method.
		while (continueUserInput) {
		System.out.println("Enter battery dimensions (Expected: " + Battery.EXPECTED_DIAMETER 
				+	" For diameter,  " + Battery.EXPECTED_HEIGHT +  " for height):	");

		//setting diameter and height from user input.
		battery.setDiameter(User.inputDouble("Enter measured diameter: "));
		battery.setHeight(User.inputDouble("Enter measured height: "));


		//outputting the battery dimensions
		System.out.println(battery.toString());
		//using an if statement to check if the battery dimensions are within
		//tolerance.
		if (batteryChecker.checkWithinTolerance(battery))
				System.out.println("Battery is within tolerance.");
		//if it is not within tolerance, the program will add 1
		//to the amount of batteries out of tolerance.
				else {
				System.out.println("Battery is not within tolerance.");
				batteriesOutsideTolerance++;
				}
		//programmer name on screen.
		System.out.println("Program by: Timothy Jacot");
		
		//using if statement to ask user to try the program again.
		if(!User.inputString("Continue checking? e.g.: YES: ").equalsIgnoreCase("YES"))
			continueUserInput = false;
		}
		//closing while statement
		
		
		//showing the user the amount of intolerances within the dimensions.
		System.out.println("Amount of intolerances: " + batteriesOutsideTolerance);

	}	
}
