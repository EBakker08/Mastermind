
package mastermind;

public class Mastermind {

	public static void main(String[] args) {
		Helper helper = new Helper();	//Start of functions	(Helper.java)
		
		int round = helper.round;
		
		System.out.println("Welcome to Mastermind!\nIn this game you have to guess the right code. (The code can include multiple of the same colors.)\nYou can choose between Red, Blue, Yellow, Green, Orange and Purple.");
		
		helper.codeMaking();
		
		do {
			
			System.out.println("round: " + round + "/10");
			
			helper.userInputValidator();
			
			round = helper.userInputCheck();
			
			round = helper.gameWonCheck();
			
		} while (round < 11);
	}
}
