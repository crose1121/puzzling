package puzzling;
import java.util.Random;

public class PuzzleJava {
	Random randMachine = new Random();
	
	public int[] getTenRolls() {
		int[] tenRolls = new int[10];
		for (int i=0;i<10;i++) {
			int randomNum = randMachine.nextInt(0,21);
			tenRolls[i] = randomNum;
		}
		return tenRolls;
	}	
	
	public String getRandomLetter() {
		String[] randomLetter = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		int randomNum = randMachine.nextInt(0,26);
		return randomLetter[randomNum];
	}
	
	public String generatePassword() {
		String password = "";
		for (int i=0;i<9;i++) {
			String randomLetter = getRandomLetter();
			password+=randomLetter;
		}
		return password;
	}
	
	public String[] getPasswordSet(int length) {
		String[] passwords = new String[length];
		for (int i=0;i<length;i++) {
			String newPassword = generatePassword();
			passwords[i] = newPassword;
		}
		return passwords;
	}
	
	public String[] shuffleArray(String[] values) {
		
		for (int i=0;i<values.length;i++) {
			int randomNum = randMachine.nextInt(values.length);
			String temp = values[randomNum];
			values[randomNum] = values[i];
			values[i] = temp;

		}
		return values;
	}
}