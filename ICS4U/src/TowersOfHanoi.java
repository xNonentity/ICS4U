import java.util.Scanner;
/*
 * Jennifer Nguyen 
 * Sept 19 2016
 * Translating the recursive algoirthm given on the web page into java. 
 */

public class TowersOfHanoi {

	public static void Solve(int num, String Src, String Aux, String Dst) {

		if (num == 0)

		{
			System.out.println("");
			// if the value of N = 0 do nothing
			
		} else {
			
			Solve(num - 1, Src, Dst, Aux);
			
			System.out.print("Move from " + Src + " to " + Dst);
			// tells the user where they should move
			
			Solve(num - 1, Aux, Src, Dst);
			// switches the order of blocks
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int F = Integer.parseInt(input.nextLine());
		
		String A = "Src";
		String B = "Aux";
		String C = "Dst";
		Solve(F, A, B, C);
	}
}
