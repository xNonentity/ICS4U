public class SearchingClass {
	
	static int [] x = {1, 2, 4, 7, 9, 10, 14, 20, 29, 42};
	
	//the int structures 
	//binary
	public static int binarySearch(int[]a, int target){
		return binarySearch (a, target, 0,  a.length -1);
	}
	
	private static int binarySearch (int[]a, int target, int start, int end){
		
		 int mid = (start+end)/2;
		if (mid == target){ //if the number is the middle
			return binarySearch (a, target, start, end);
		}
		else if (mid > target){ //if the number is greater than the middle index
			binarySearch(a, start, target, end = mid-1);
		}
		else if (mid < target){
			binarySearch(a, start = mid + 1, end, target); //if the number is less than the middle index
		}
		else{
			return -1; //If the number does not exist
		}
		return binarySearch (a, target, start, end);
	}
	//linear
	public static int linearSearch(int[]a, int target){
		return linearSearch(a, target, 0, a.length -1);
	}
	private static int linearSearch(int[]a, int target, int start, int end){
		for (int i = 0; i < x.length; i++){ //goes through the entire array
			if (x[i] == target){
				System.out.println("Found at spot" + i);
			}
			break;
		}
		return linearSearch(a, target, start, end);
		}
	//Double structures
	//binary
	public static int binary(double[]a, double target){
		return binary(a, target, 0, a.length -1);
	}
	private static int binary(double[]a, double target, double start, double end){
		 double mid = (start+end)/2;
		if (mid == target){ 
			return binary (a, target, start, end);
		}
		else if (mid > target){
			binary(a, start, target, end = mid-1);
		}
		else if (mid < target){
			binary(a, start = mid + 1, end, target);
		}
		else{
			return -1;
		}
		return binary(a, target, start, end);
	}
	//linear
	public static int linear(double[]a, double target){
		return linear(a, target, 0, a.length -1);
	}
	private static int linear(double[]a, double target, double start, double end){
			for (int i = 0; i < x.length; i++){
				if (x[i] == target){
					System.out.println("Found at spot" + i);
				}
				break;
			}
			return linear(a, target, start, end);
			}
	
	//String structures
	//Binary
	public static int binaryAni(String[]a, int target, int i){
		return binaryAni(a, 0, a.length -1);
	}
	private static int binaryAni(String[]a, String target, int start, int end){
		 int mid = (start+end)/2;
		if (a[mid].compareToIgnoreCase(target) == 0){ 
			return binaryAni (a, target, mid +1, start);
		}
		else if (a[mid].compareToIgnoreCase(target)> 0){
			binaryAni(a, end = mid-1, target, end);
		}
		else if (a[mid].compareToIgnoreCase(target) < 0){
			binaryAni(a, start = mid + 1, target, end);
		}
		else{
			return -1;
		}
		return binaryAni (a, target, start, end);
	}
	//Linear 
	public static int linearAni(String[]a, String target){
		return linearAni(a, target, 0, a.length -1);
	}
	private static int linearAni(String[]a, String target, int start, int end){
		for (int i = 0; i < x.length; i++){
			if (a[i].equalsIgnoreCase(target)){
				System.out.println("Found at spot" + i);
			}
			break;
		}
		return linearAni(a, target, start, end);
		}
	}
	
	
