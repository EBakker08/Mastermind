
package mastermind;

public class Mastermind {

	public static void main(String[] args) {
		Helper helper = new Helper();	//Start of functions	(Helper.java)
		
//		Code generation
		helper.codeMaking();
		
//		Introduction/welcome statement
		System.out.println("Welcome to Mastermind!\nIn this game you have to guess the right code.\n(The code can include multiple of the same colors.)");
		
//		User input and game won check
		helper.userInput();
		
	}
}	//	End program
