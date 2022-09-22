package labOOPs01;

import java.util.Random;

public class RandomPassword {
	String RandomPassword="";
	String ranpas = RandomPassword;
	public RandomPassword() {	
		Random r = new Random();
		char c = (char) (r.nextInt(26)+'A'); //For generating random characters
		System.out.print(c);
		String capitalLetters = "A-Z";
		String lowerLetters = "a-z";
		String specialLetter = "!@#$%^&*()";
		String number = "0-9";
		String addCharacters = capitalLetters+lowerLetters+specialLetter+number;
		char[] password = new char[8];
		
		password[0] = capitalLetters.charAt(r.nextInt(capitalLetters.length()));
		password[1] = lowerLetters.charAt(r.nextInt(lowerLetters.length()));
		password[2] = specialLetter.charAt(r.nextInt(specialLetter.length()));
		password[3] = number.charAt(r.nextInt(number.length()));

		for(int i=4; i<password.length; i++)
			password[i]=addCharacters.charAt(r.nextInt(addCharacters.length()));
		
		 
		for(char element:password)
			System.out.print(element);
		}
		
}

