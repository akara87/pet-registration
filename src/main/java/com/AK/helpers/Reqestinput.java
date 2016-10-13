/**
 * File Name: Reqestinput.java<br>
 * Akarapu, Sruthi<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 8, 2016
 */
package com.AK.helpers;

import java.util.*;

/**
 * Reqestinput //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Akarapu, Sruthi
 * @version 1.0.0
 * @since 1.0
 */
public class Reqestinput {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @return
	 */
	public static int getInt(String question) {
		{
			return getInt(question, 0, 0);
		}
	}

	/**
	 * @return
	 */
	public static int getInt(String question, int min, int max) {
		int userNumber = 0;
		boolean isValid = false;
		while (!isValid) {
			String input;
			System.out.print(question + ": ");
			// Capture user input
			input = scanner.nextLine();
			try {
				// convert string into number
				userNumber = Integer.parseInt(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("Sorry you must enter only digit characters(" + input + "is invalid)");
				// TODO: handle exception
			}
			if (min != 0 || max != 0) {
				if (userNumber < min || userNumber > max) {
					System.out.println("The number" + userNumber + " is  not with the valid range of" + min + " and " + max);
					isValid = false;
				}
			}
		}
		return userNumber;
	}
}
