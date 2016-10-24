/*Jennifer Nguyen
 * Sept 13 2016 
 * Textbook work, page 313 
 */
public class RecursionOne {

	public static void showRecursion(int num) { 
		
		System.out.println("Enterting method. num = " + num);
		if (num > 1){
			showRecursion(num -1);
		}
		System.out.println("Leaving method. num = " + num);
	}
	
	public static void main (String[] args) {
		showRecursion(2);
	}

}
