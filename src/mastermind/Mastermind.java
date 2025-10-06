package mastermind;

import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		
		Scanner mastermind = new Scanner(System.in);
			
			// codekraker
			String red = "red";
			String blue = "blue";
			String green = "green";
			String yellow = "yellow";
			String orange = "orange";
			String purple = "purple";
			
			// codemaker/controlles
			String white = "white";
			String black = "black";
			String x = "x";
	
			// input vakjes/ code vakjes
			String codeVakje1 = blue;
			String codeVakje2 = orange;
			String codeVakje3 = purple;
			String codeVakje4 = yellow;
			String x1 = red;
			String x2 = green;
			
			//win/lose statements
			String win = "Congratulations, you won!";
			String lose = "10 rounds are over. You lose.";
			
			System.out.println("Welcome to Mastermind!\nIn this game you have to guess the right code."); //intro van de game

			//game
			int round = 1;
			
			//loop
			do {
				System.out.println("Round: " + round + "/10.\nYou can choose between Red, Blue, Yellow, Green, Purple and Orange.");
				
				//user input
				String input1_1 = mastermind.next();
				String input1_2 = mastermind.next();
				String input1_3 = mastermind.next();
				String input1_4 = mastermind.next();
				
				//input 1
				if (input1_1.equalsIgnoreCase(codeVakje1)) {
					System.out.println(black);
				} else {
					if (input1_1.equalsIgnoreCase(codeVakje2)) {
						System.out.println(white);
					}
					if (input1_1.equalsIgnoreCase(codeVakje3)) {
						System.out.println(white);
					}
					if (input1_1.equalsIgnoreCase(codeVakje4)) {
						System.out.println(white);
					} else {
						if (input1_1.equalsIgnoreCase(x1)) {
							System.out.println(x);
						}
						if (input1_1.equalsIgnoreCase(x2)) {
							System.out.println(x);
						}
					}

				}
				
				//Input 2
				if (input1_2.equalsIgnoreCase(codeVakje2)) {
					System.out.println(black);
				} else {
					if (input1_2.equalsIgnoreCase(codeVakje1)) {
						System.out.println(white);
					}
					if (input1_2.equalsIgnoreCase(codeVakje3)) {
						System.out.println(white);
					}
					if (input1_2.equalsIgnoreCase(codeVakje4)) {
						System.out.println(white);
					} else {
						if (input1_2.equalsIgnoreCase(x1)) {
							System.out.println(x);
						}
						if (input1_2.equalsIgnoreCase(x2)) {
							System.out.println(x);
						}
					}

				}
				
				//Input 3
				if (input1_3.equalsIgnoreCase(codeVakje3)) {
					System.out.println(black);
				} else {
					if (input1_3.equalsIgnoreCase(codeVakje1)) {
						System.out.println(white);
					}
					if (input1_3.equalsIgnoreCase(codeVakje2)) {
						System.out.println(white);
					}
					if (input1_3.equalsIgnoreCase(codeVakje4)) {
						System.out.println(white);
					} else {
						if (input1_3.equalsIgnoreCase(x1)) {
							System.out.println(x);
						}
						if (input1_3.equalsIgnoreCase(x2)) {
							System.out.println(x);
						}
					}

				}

				//Input 4
				if (input1_4.equalsIgnoreCase(codeVakje4)) {
					System.out.println(black);
				} else {
					if (input1_4.equalsIgnoreCase(codeVakje1)) {
						System.out.println(white);
					}
					if (input1_4.equalsIgnoreCase(codeVakje2)) {
						System.out.println(white);
					}
					if (input1_4.equalsIgnoreCase(codeVakje3)) {
						System.out.println(white);
					} else {
						if (input1_4.equalsIgnoreCase(x1)) {
							System.out.println(x);
						}
						if (input1_4.equalsIgnoreCase(x2)) {
							System.out.println(x);
						}
					}

				}
				
				//controlle gebied
				if (input1_1.equalsIgnoreCase(codeVakje1)) {
					if (input1_2.equalsIgnoreCase(codeVakje2)) {
						if (input1_3.equalsIgnoreCase(codeVakje3)) {
							if (input1_4.equalsIgnoreCase(codeVakje4)) {
								round = 12;
							} else {						//else = next round
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
			}
			
			//win/lose conditions
			while (round < 11);
			if (round == 11) {
				System.out.println(lose);
			} else {
				System.out.println(win);
			}
			
			
		mastermind.close();
	}

}
