package mastermind;

import java.util.Random;
import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		Random randomCode = new Random();
		Scanner mastermind = new Scanner(System.in);	//Start scanner
		
//		----------------------------------------------------------------------------------------------------------------------------
		
//		User colors
		String[] colors =
			{"red", "blue", "green", "yellow", "orange", "purple"};
		
//		Check colors:
		String[] checkColors =
			{"black", "white", "x"};
		
		String[] codeVakjes =
				{"codeVakje1", "codeVakje2", "codeVakje3", "codeVakje4"};
		
		for (int i = 0; i < codeVakjes.length; i++) {
		    codeVakjes[i] = colors[randomCode.nextInt(colors.length)];
		}
		
//		Win/lose statements
		String winStatement = "Congratulations, you won!";
		String loseStatement = "10 rounds are over. You lose.";

//		Introduction/welcome statement
		System.out.println("Welcome to Mastermind!\nIn this game you have to guess the right code.\n(The code can include multiple of the same colors.)");

//		-----------------------------------------------------------------------------------------------------------------------------
		
//		Round variable
		int round = 1;
		
//		The game (check) loop
		do {
//			Uitleg
			System.out.println("Round: " + round + "/10.\nYou can choose between Red, Blue, Yellow, Green, Orange and Purple.");

//			User input variablen
			String[] userInput =
				{"input1", "input2", "input3", "input4"};
			
			userInput[0] = mastermind.next();
			userInput[1] = mastermind.next();
			userInput[2] = mastermind.next();
			userInput[3] = mastermind.next();

//			Input 1 check
			if (userInput[0].equalsIgnoreCase(codeVakjes[0])) {
				System.out.println(checkColors[0]);
			} else {
				if (userInput[0].equalsIgnoreCase(codeVakjes[1])) {
					System.out.println(checkColors[1]);
				} else {
					if (userInput[0].equalsIgnoreCase(codeVakjes[2])) {
						System.out.println(checkColors[1]);
					} else {
						if (userInput[0].equalsIgnoreCase(codeVakjes[3])) {
							System.out.println(checkColors[1]);
						} else {
							System.out.println(checkColors[2]);
						}
					}
				}
			}	//End input 1

//			Input 2 check
			if (userInput[1].equalsIgnoreCase(codeVakjes[1])) {
				System.out.println(checkColors[0]);
			} else {
				if (userInput[1].equalsIgnoreCase(codeVakjes[0])) {
					System.out.println(checkColors[1]);
				} else {
					if (userInput[1].equalsIgnoreCase(codeVakjes[2])) {
						System.out.println(checkColors[1]);
					} else {
						if (userInput[1].equalsIgnoreCase(codeVakjes[3])) {
							System.out.println(checkColors[1]);
						} else {
							System.out.println(checkColors[2]);
						}
					}
				}
			}	//end input 2

//			Input 3 check
			if (userInput[2].equalsIgnoreCase(codeVakjes[2])) {
				System.out.println(checkColors[0]);
			} else {
				if (userInput[2].equalsIgnoreCase(codeVakjes[0])) {
					System.out.println(checkColors[1]);
				} else {
					if (userInput[2].equalsIgnoreCase(codeVakjes[1])) {
						System.out.println(checkColors[1]);
					} else {
						if (userInput[2].equalsIgnoreCase(codeVakjes[3])) {
							System.out.println(checkColors[1]);
						} else {
							System.out.println(checkColors[2]);
						}
					}
				}
			}	//End input 3

//			Input 4 check
			if (userInput[3].equalsIgnoreCase(codeVakjes[3])) {
				System.out.println(checkColors[0]);
			} else {
				if (userInput[3].equalsIgnoreCase(codeVakjes[0])) {
					System.out.println(checkColors[1]);
				} else {
					if (userInput[3].equalsIgnoreCase(codeVakjes[1])) {
						System.out.println(checkColors[1]);
					} else {
						if (userInput[3].equalsIgnoreCase(codeVakjes[2])) {
							System.out.println(checkColors[1]);
						} else {
							System.out.println(checkColors[2]);
						}
					}
				}
			}	//End input 4

//			Game won check:
			if (userInput[0].equalsIgnoreCase(codeVakjes[0])) {
				if (userInput[1].equalsIgnoreCase(codeVakjes[1])) {
					if (userInput[2].equalsIgnoreCase(codeVakjes[2])) {
						if (userInput[3].equalsIgnoreCase(codeVakjes[3])) {
							round = 12;
						} else {	// Else = next round
							round++;
						}
					} else {
						round++;
					}
				} else {
					round++;
				}
			} else {
				round++;
			}	//	End of game won check
		}	//	End of do loop

//		Win/lose conditions
		while (round < 11);
		if (round == 11) {
			System.out.println(loseStatement + "\n");
			System.out.println("The code was:\n" + codeVakjes[0] + "\n" + codeVakjes[1] + "\n" + codeVakjes[2] + "\n" + codeVakjes[3]);
		} else {
			System.out.println(winStatement);
		}
//		----------------------------------------------------------------------------------------------------------------------------
		
		mastermind.close(); //End scanner
	}
}	//End program
