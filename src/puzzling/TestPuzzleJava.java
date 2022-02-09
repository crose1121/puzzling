package puzzling;

public class TestPuzzleJava {
	public static void main(String[] args) {
		PuzzleJava diceRoller = new PuzzleJava();
		
		int[] result = diceRoller.getTenRolls();
		
		System.out.println("These are the values in the array: ");
		for (int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		System.out.println("-------Testing random letter generator--------");
		System.out.println(diceRoller.getRandomLetter());
		
		System.out.println("-------Testing password generator-----------");
		System.out.println(diceRoller.generatePassword());
		
		System.out.println("-------Below is your set of random passwords:-----------");
		String[] passwords = diceRoller.getPasswordSet(10);
		for (int i=0;i<10;i++) {
			System.out.println(passwords[i]);
		}
		
		System.out.println("------Testing shuffle array method----------");		
		
		System.out.println("Passwords: ");
		
		for (int i=0;i<passwords.length;i++) {
			System.out.println(passwords[i]);
		}
		
		String[] shuffledArray = diceRoller.shuffleArray(passwords);
		
		System.out.println("Shuffled Passwords: ");
		for (int i=0;i<shuffledArray.length;i++) {
			System.out.println(shuffledArray[i]);
		}
	}
}
