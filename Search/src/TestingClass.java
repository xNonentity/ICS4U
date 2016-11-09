import java.lang.reflect.Array;
import java.util.Scanner;

public class TestingClass {
	
	static int [] x = {1, 2, 4, 7, 9, 10, 14, 20, 29, 42}; 
	static double [] z = {1.0, 2.0, 4.0, 7.0, 9.0, 10.0, 14.0, 20.0, 29.0, 42.0}; 
	static String[]y = {"Bunny", "Cat", "Mouse", "Rat", "Dog","Snake","Spider","Hamster","Turtle","Fish"};
	static int target; 
	static double douTarget;
	static String targetAni; 
	static int startIndex = 0; 
	static int endIndex = x.length - 1; 
	static int midIndex = (startIndex - endIndex) / 2; 

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in); 

		int target;
		String answer; 
		//Ask for a string, double or int 
	System.out.println("String, double or int?");
	answer = input.nextLine();
	
	//For Int
	if (answer.equalsIgnoreCase("Int")){
		System.out.println("Input your target number."); 
		target = input.nextInt(); 

		System.out.println("Would you like to have a BINARY search or LINEAR search?");
		answer = input.nextLine(); 
		if (answer.equalsIgnoreCase("Binary")){
			SearchingClass.binarySearch(x, target);
			
			}
		else{
			SearchingClass.linearSearch(x, target);
		}
		}
	//For String
	else if (answer.equalsIgnoreCase("String")){
		
		System.out.println("Input your target pet animal.");
		targetAni = input.nextLine();
		
		System.out.println("Would you like to have a BINARY search or LINEAR search?");
		answer = input.nextLine(); 
		if (answer.equalsIgnoreCase("Binary")){
			SearchingClass.binaryAni(y, targetAni);
			
			}
		else{
			SearchingClass.linearAni(y, targetAni);
		}
	}
	//For Double
	else if (answer.equalsIgnoreCase("Double")){
		System.out.println("Input your target number."); 
		target = input.nextInt(); 

		System.out.println("Would you like to have a BINARY search or LINEAR search?");
		answer = input.nextLine(); 
		if (answer.equalsIgnoreCase("Binary")){
			SearchingClass.binary(z, target);
			
			}
		else{
			SearchingClass.linear(z, target);
		}
	}
	}

	}
