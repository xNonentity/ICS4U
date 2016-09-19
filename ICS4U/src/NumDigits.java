import java.util.Scanner;
/*
 * Jennifer Nguyen
 * Sept 13 2016 
 * Entering a number and Java will output how many digits are within that number
 */

public class NumDigits {
	static int num = 1;
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); //Scanner 
		System.out.println("Please enter a number.");
		int n = Integer.parseInt(input.nextLine());
		System.out.print(numDigits(n)); 
	}
	
	public static int numDigits (int dig){

	if (dig >= -9 && dig <= 9){
		return 1; 
		//one digit (including negative) 
	}
	else{
		while (dig >= 10 || dig <= -10){
			num++; 
			dig = dig/10; //If more than one digit 
		}
		dig = num; 
		if (dig < 0){
			dig = dig * -1; //If a negative, number must be a positive 
		}
		return dig; 
	}
	}

}