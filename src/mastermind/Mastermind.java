package mastermind;

import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {

		Scanner mastermind = new Scanner(System.in);

//		kleur keuzes
		String red = "red";
		String blue = "blue";
		String green = "green";
		String yellow = "yellow";
		String orange = "orange";
		String purple = "purple";

//		controlle kleuren
		String white = "white";
		String black = "black";
		String x = "x";

//		code vakjes
		String codeVakje1 = red;
		String codeVakje2 = blue;
		String codeVakje3 = green;
		String codeVakje4 = yellow;

//		win/lose statements
		String winStatement = "Congratulations, you won!";
		String loseStatement = "10 rounds are over. You lose.";

//		intro/welcome statement
		System.out.println("Welcome to Mastermind!\nIn this game you have to guess the right code.");

//		ronde variab]e
		int round = 1;

//		de loop
		do {
//			uitleg
			System.out.println("Round: " + round + "/10.\nYou can choose between Red, Blue, Yellow, Green, Purple and Orange.");

//			user input variablen
			String input1 = mastermind.next();
			String input2 = mastermind.next();
			String input3 = mastermind.next();
			String input4 = mastermind.next();

//			input 1 check
			if (input1.equalsIgnoreCase(codeVakje1)) {
				System.out.println(black);
			} else {
				if (input1.equalsIgnoreCase(codeVakje2)) {
					System.out.println(white);
				} else {
					if (input1.equalsIgnoreCase(codeVakje3)) {
						System.out.println(white);
					} else {
						if (input1.equalsIgnoreCase(codeVakje4)) {
							System.out.println(white);
						} else {
							System.out.println(x);
						}
					}
				}
			}

//			input 2 check
			if (input2.equalsIgnoreCase(codeVakje2)) {
				System.out.println(black);
			} else {
				if (input2.equalsIgnoreCase(codeVakje1)) {
					System.out.println(white);
				} else {
					if (input2.equalsIgnoreCase(codeVakje3)) {
						System.out.println(white);
					} else {
						if (input2.equalsIgnoreCase(codeVakje4)) {
							System.out.println(white);
						} else {
							System.out.println(x);
						}
					}
				}
			}

//			input 3 check
			if (input3.equalsIgnoreCase(codeVakje3)) {
				System.out.println(black);
			} else {
				if (input3.equalsIgnoreCase(codeVakje1)) {
					System.out.println(white);
				} else {
					if (input3.equalsIgnoreCase(codeVakje2)) {
						System.out.println(white);
					} else {
						if (input3.equalsIgnoreCase(codeVakje4)) {
							System.out.println(white);
						} else {
							System.out.println(x);
						}
					}
				}
			}

//			input 4
			if (input4.equalsIgnoreCase(codeVakje4)) {
				System.out.println(black);
			} else {
				if (input4.equalsIgnoreCase(codeVakje1)) {
					System.out.println(white);
				} else {
					if (input4.equalsIgnoreCase(codeVakje2)) {
						System.out.println(white);
					} else {
						if (input4.equalsIgnoreCase(codeVakje3)) {
							System.out.println(white);
						} else {
							System.out.println(x);
						}
					}
				}
			}

//			
			if (input1.equalsIgnoreCase(codeVakje1)) {
				if (input2.equalsIgnoreCase(codeVakje2)) {
					if (input3.equalsIgnoreCase(codeVakje3)) {
						if (input4.equalsIgnoreCase(codeVakje4)) {
							round = 12;
						} else { // else = volgende ronde
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
			}
		} // einde Do loop

//		win/lose condities
		while (round < 11);

		if (round == 11) {
			System.out.println(loseStatement);
		} else {
			System.out.println(winStatement);
		}

		mastermind.close();
	}

}
