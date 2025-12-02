package mastermind;

import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {

		Scanner mastermind = new Scanner(System.in);	//Start scanner

//		User colors
		String[] colors =
			{"red", "blue", "green", "yellow", "orange", "purple" };
		
//		Check colors:
		String[] checkColors =
			{"black", "white", "x"};
		
		String[] codeVakjes =
				{"codeVakje1", "codeVakje2", "codeVakje3", "codeVakje4"};
		
		codeVakjes[0] = colors[0];
		codeVakjes[1] = colors[1];
		codeVakjes[2] = colors[2];
		codeVakjes[3] = colors[3];

//		System.out.println(codeVakje1 + codeVakje2 + codeVakje3 + codeVakje4 + "\n");
		
//		Win/lose statements
		String winStatement = "Congratulations, you won!";
		String loseStatement = "10 rounds are over. You lose.";

//		Introduction/welcome statement
		System.out.println("Welcome to Mastermind!\nIn this game you have to guess the right code.");

//		Round variable
		int round = 1;

//		The game (check) loop
		do {
//			Uitleg
			System.out.println("Round: " + round + "/10.\nYou can choose between Red, Blue, Yellow, Green, Purple and Orange.");

//			uUser input variablen Hier kan een list
			String input1 = mastermind.next();
			String input2 = mastermind.next();
			String input3 = mastermind.next();
			String input4 = mastermind.next();

//			Input 1 check
			if (input1.equalsIgnoreCase(codeVakjes[0])) {
				System.out.println(checkColors[0]);
			} else {
				if (input1.equalsIgnoreCase(codeVakjes[1])) {
					System.out.println(checkColors[1]);
				} else {
					if (input1.equalsIgnoreCase(codeVakjes[2])) {
						System.out.println(checkColors[1]);
					} else {
						if (input1.equalsIgnoreCase(codeVakjes[3])) {
							System.out.println(checkColors[1]);
						} else {
							System.out.println(checkColors[2]);
						}
					}
				}
			}	//End input 1

//			Input 2 check
			if (input2.equalsIgnoreCase(codeVakjes[1])) {
				System.out.println(checkColors[0]);
			} else {
				if (input2.equalsIgnoreCase(codeVakjes[0])) {
					System.out.println(checkColors[1]);
				} else {
					if (input2.equalsIgnoreCase(codeVakjes[2])) {
						System.out.println(checkColors[1]);
					} else {
						if (input2.equalsIgnoreCase(codeVakjes[3])) {
							System.out.println(checkColors[1]);
						} else {
							System.out.println(checkColors[2]);
						}
					}
				}
			}	//end input 2

//			Input 3 check
			if (input3.equalsIgnoreCase(codeVakjes[2])) {
				System.out.println(checkColors[0]);
			} else {
				if (input3.equalsIgnoreCase(codeVakjes[0])) {
					System.out.println(checkColors[1]);
				} else {
					if (input3.equalsIgnoreCase(codeVakjes[1])) {
						System.out.println(checkColors[1]);
					} else {
						if (input3.equalsIgnoreCase(codeVakjes[3])) {
							System.out.println(checkColors[1]);
						} else {
							System.out.println(checkColors[2]);
						}
					}
				}
			}	//End input 3

//			Input 4 check
			if (input4.equalsIgnoreCase(codeVakjes[3])) {
				System.out.println(checkColors[0]);
			} else {
				if (input4.equalsIgnoreCase(codeVakjes[0])) {
					System.out.println(checkColors[1]);
				} else {
					if (input4.equalsIgnoreCase(codeVakjes[1])) {
						System.out.println(checkColors[1]);
					} else {
						if (input4.equalsIgnoreCase(codeVakjes[2])) {
							System.out.println(checkColors[1]);
						} else {
							System.out.println(checkColors[2]);
						}
					}
				}
			}	//End input 4

//			Game won check:
			if (input1.equalsIgnoreCase(codeVakjes[0])) {
				if (input2.equalsIgnoreCase(codeVakjes[1])) {
					if (input3.equalsIgnoreCase(codeVakjes[2])) {
						if (input4.equalsIgnoreCase(codeVakjes[3])) {
							round = 12;
						} else {	// Else = next round
							round = round + 1;
						}
					} else {
						round = round + 1;
					}
				} else {
					round = round + 1;
				}
			} else {
				round = round + 1;
			}	//End of game won check
		}	// End of do loop

//		Win/lose conditions
		while (round < 11);
		if (round == 11) {
			System.out.println(loseStatement);
		} else {
			System.out.println(winStatement);
		}

		mastermind.close(); //End scanner
	}
}	//End program
