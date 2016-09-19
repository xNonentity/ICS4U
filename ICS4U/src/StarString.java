import java.util.Scanner;
/*
 * Jennifer Nguyen
 * Sept 14 2016 
 * This programs takes the user's input and makes it the exponent of the base of 2. The result of 2 
 * to the power of what the user inputed will be outputed as stars. It will also output 2 to the power 
 * of what the user inputed but subtract 2. 
 */

public class StarString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a number.");
		double num = Double.parseDouble(input.nextLine());
		StarString(num);
	}

	public static void StarString(double star) {
		if (star > 0) {
			int pow = (int)Math.pow(2, star); // equation to make the base to the power of what the user inputed
			StarString(star-1); //subtract one so it will show previous power's 
			while (pow > 0) {
				System.out.print("*"); 
				pow = pow - 1; 
			}
			System.out.println(); //creates space
		}
		else if (star == 0){
			System.out.println("*"); //if user only inputs 0 
		}
	}
}
