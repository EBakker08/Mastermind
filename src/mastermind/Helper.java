
package mastermind;

import java.util.Scanner;
import java.util.Random;

public class Helper {
	
	Scanner sc = new Scanner(System.in);
	Random randomCode = new Random();
	
	String[] colors =
		{"red", "blue", "green", "yellow", "orange", "purple"};
	
	String[] codeVakjes =
		{"codeVakje1", "codeVakje2", "codeVakje3", "codeVakje4"};
	
	String[] checkColors =
		{"black", "white", "x"};
	
	String winStatement = "Congratulations, you won!";
	String loseStatement = "10 rounds are over. You lose.";
	
//	Begin functions
//	Code generation
	public String[] codeMaking() {
		for (int length = 0; length < codeVakjes.length; length++) {
		    codeVakjes[length] = colors[randomCode.nextInt(colors.length)];
		}
		return codeVakjes;
	}
	
//	--------------------------------------------------------------------------------------------------------------------------------------------
	
	public int userInput() {
		
		int round = 1;
		
		do {
			System.out.println("Round: " + round + "/10.\nYou can choose between Red, Blue, Yellow, Green, Orange and Purple.");
			
			String[] userInput =
				{"1", "2", "3", "4"};
			
			for (int i = 0; i < userInput.length; i++) {
				userInput[i] = sc.next();
			}
			
			boolean check = true;
			
			for (int i = 0; i < userInput.length; i++) {
				if (userInput[i].equalsIgnoreCase(codeVakjes[i])) {
					System.out.println(checkColors[0]);
					check = false;
				} else {
					for (int y = 0; y < codeVakjes.length; y++) {
						if (userInput[i].equalsIgnoreCase(codeVakjes[y])) {
							System.out.println(checkColors[1]);
							check = false;
						} 
					}if (check) {
						System.out.println(checkColors[2]);
						}
				}
			}
			
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
			}
			
			if (round == 11) {
				System.out.println(loseStatement + "\n");
				System.out.println("The code was:\n" + codeVakjes[0] + "\n" + codeVakjes[1] + "\n" + codeVakjes[2] + "\n" + codeVakjes[3]);
			} else {
				if (round == 12) {
					System.out.println(winStatement);
				}
			}
		} while (round < 11);
		return round;
	}
}
