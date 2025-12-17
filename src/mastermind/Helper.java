
package mastermind;

import java.util.Random;

public class Helper {
	
	Random randomCode = new Random();
	
	String[] colors =
		{"red", "blue", "green", "yellow", "orange", "purple"};
	
	public String[] codeMaken() {
		String[] codeVakjes =
			{"codeVakje1", "codeVakje2", "codeVakje3", "codeVakje4"};
		
		for (int length = 0; length < codeVakjes.length; length++) {
		    codeVakjes[length] = colors[randomCode.nextInt(colors.length)];
		}
		
		return codeVakjes;
	}
	
}
