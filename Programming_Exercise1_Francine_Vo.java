/**
 * Programming_Exercise1_Francine_Vo.java
 * Francine Vo
 * 01253035
 * 09/06/2023
 */

/** Algorithm
 *Goal: Convert pounds into kilograms
 *Input: Number in pounds
 *Output: Displays results in kilograms
 *
 *1. Declare Variables
 *2. Prompt User to enter a value in pounds
 *3. Calculate pounds to kilograms conversion (one pound = 0.4536 kilograms)
 *4. Output results
 */

import java.util.Scanner;

public class Programming_Exercise1_Francine_Vo {

	public static void main(String[] args) {
		// 1. Declare Variables
		double pounds;
		double kilograms;
		
		// 2. Prompt user to enter a value in pounds
		System.out.print("Enter a value in pounds: ");
		Scanner input = new Scanner(System.in);
		pounds = input.nextDouble();
		input.close();
		
		// 3. Convert pounds to kilograms
		kilograms = (pounds * 0.4536);
		
		// 4. Output Results
		System.out.print(pounds);
		System.out.print(" pounds is equal to " + kilograms);
		System.out.print(" kilograms");

	}

}
