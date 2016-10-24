import java.util.Scanner;

public class Bananas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String word; 

		System.out.println("Hello, this is monkey language!");
		System.out.println("Input a letter or word and see if it's monkey language!");
		word = input.nextLine(); 
		monkeyLanguage(word); 
		
		

	}
	public static boolean monkeyLanguage(String monkWord) {
		
		int index = monkWord.length();
		char ltr = monkWord.charAt(index);
		
		if (monkWord.equalsIgnoreCase("A")){
			
			System.out.println("YES!");
			System.out.println("That is a monkey language word!");
			return true; 
		} 
		
		//else if (){ 
			
		//}
		return false; 

	}

}
