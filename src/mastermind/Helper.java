
package mastermind;

import java.util.Scanner;
import java.util.Random;

public class Helper {

//	Deelproblemen:
//	Generating random code
//	userInput 4x
//	If user puts anything but a color in, try again
//	userInput checker
//	Game won checker
//	Printing of winStatement
//	Printing of loseStatement
//	Plays for 10 rounds

//	---------------------------------------------------------------------------------------------------------------

//	Key variables
	Scanner sc = new Scanner(System.in);
	Random randomCode = new Random();

//	User colors
	String[] colors = { "red", "blue", "green", "yellow", "orange", "purple" };

	String[] userInput = { "1", "2", "3", "4" };

//	Code places
	String[] codeVakjes = { "codeVakje1", "codeVakje2", "codeVakje3", "codeVakje4" };

//	Check colors
	String[] checkColors = { "black", "white", "x" };

//	Win/lose statements
	String winStatement = "Congratulations, you won!";
	String loseStatement = "10 rounds are over. You lose.";

	int round = 1;

//	-----------------------------------------------------------------------------------------------------------------------------

//	Begin functions
//	Random code generation
	public String[] codeMaking() {
		for (int length = 0; length < codeVakjes.length; length++) { // Repeat for whole length of codeVakjes
			codeVakjes[length] = colors[randomCode.nextInt(colors.length)]; // Chooses one random color out of colors
		}
		return codeVakjes;
	}

//	--------------------------------------------------------------------------------------------------------------------------------------------

	public boolean checkIfValueInCollection(String x, String[] collection) {
		for (String value : collection) {
			if (x.equalsIgnoreCase(value)) {
				return true;
			}
		}
		return false;
	}

//	---------------------------------------------------------------------------------------------------------------------------------------------------
	
	public int userInputCheck() {
//		Deelprobleem:
//		User Input checker
//		Check code for as long as userInput is
		for (int i = 0; i < userInput.length; i++) {
			if (userInput[i].equalsIgnoreCase(codeVakjes[i])) { // If userInput = codeVakje then sysout black
				System.out.println(checkColors[0]);
				continue; // If color is not in right position, continue to next stuff
			}

			Helper helper = new Helper();
			boolean checkIfTrue = helper.checkIfValueInCollection(userInput[i], codeVakjes);

			if (checkIfTrue == true) {
				System.out.println(checkColors[1]); // sysout white, because color is found in codeVakjes but not in right position
			} else {
				System.out.println(checkColors[2]); // sysout x, because color is not found in any of codeVakjes
			}
		}
		return round;
	}

//	------------------------------------------------------------------------------------------------------------------------------------------
	
	public String[] userInputValidator() {
//		Deelprobleem:
//		Input validator
		for (int i = 0; i < userInput.length; i++) { // Loop user input until 4 inputs are given
			boolean validInput = false; // user input is false by default
			while (!validInput) { // Keep asking for input until a valid color is entered
				try {
					userInput[i] = sc.next(); // Asks for user input

					// Check if the input matches any of the allowed colors
					for (String color : colors) {
						if (userInput[i].equalsIgnoreCase(color)) {
							validInput = true; // User input is right, so continue to next input/check
							break; // Stops the check if user input is true
						}
					} // Closes for

					if (!validInput) { // If input is not valid, try again
						System.out.println("Invalid color. Please enter: Red, Blue, Green, Yellow, Orange, Purple.");
					}

				} catch (Exception e) { // If input is not valid, try again
					System.out.println("Invalid color. Please enter: Red, Blue, Green, Yellow, Orange, Purple.");
				}
			}
		}
		return userInput;
	}

//	----------------------------------------------------------------------------------------------------------------------------------------
	
	public int gameWonCheck() {
		boolean[] equalsBlack = {false, false, false, false};
		
		for (int r = 0; r < userInput.length; r++) {
			if (userInput[r].equalsIgnoreCase(codeVakjes[r])) {
				equalsBlack[r] = true;
			}
		}
		
		boolean didYouWin = true;
		
		for (int t = 0; t < equalsBlack.length; t++) {
			if (equalsBlack[t] == false) {
				didYouWin = false; 
				round++;
				break;
			}
		}
		
		if (didYouWin) {
			round = 12;
		}
		
		if (round == 11) { // If 10 round are over (1+10=11) then sysout loseStatement
			System.out.println(loseStatement + "\n");
			System.out.println("The code was:\n" + codeVakjes[0] + "\n" + codeVakjes[1] + "\n" + codeVakjes[2] + "\n"
					+ codeVakjes[3]);
		} else {
			if (round == 12) { // If round = 12 then sysout winStatement
				System.out.println(winStatement);
			}
		}
		return round;
	}
}
