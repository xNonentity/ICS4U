import java.util.Scanner;
/*
 * Jennifer Nguyen
 * Sept 19 2016
 * This program uses recursive method to check if a word is a palindrome. 
 */

public class Palindrome {
	
	public static boolean Palindrome(String num) {
		
		int numberLength= num.length()-1;
		// only 1 or no letters =  will be true
        if(num.length() == 0 || num.length() == 1)
        	
            return true; 
        // checks if the last and first number are the same
        if(num.charAt(0) == num.charAt(numberLength))
        	
        return Palindrome(num.substring(1,numberLength));
        
        return false;
        // returns when not a palindrome
	}

	public static void main(String[] args) {
		
		String str, another = "y";
		
		int left, right;
		
		Scanner scan = new Scanner(System.in);

		while (another.equalsIgnoreCase("y")) {
			
			boolean again = true;

			while (again == true) {

				Scanner myScanner = new Scanner(System.in);
				System.out.println("Enter a potential palidrome:");
				String ans = myScanner.nextLine();

				if (Palindrome(ans)) {
					// prints out that it is a palindrome
					System.out.println("That IS a palindrome");
					
				} else {
					
					System.out.println("That is NOT a palindrome");
					// prints out that it is not a palindrome
				}
				
				System.out.println("Would you like to play again? Y/N");
				String AnsTwo = myScanner.nextLine();
				
				if (AnsTwo.equalsIgnoreCase("n")) {

					again = false;
				} else if (AnsTwo.equalsIgnoreCase("y")) {

					again = true;
				}

			}

		}
	}
	}

