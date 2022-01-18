package array_Concept;
		//Reverse First Half of Array
public class FirstHalfOfArray {

	public static void main(String[] args) {
		int [] arr = {10, 3, 4, 5, 6, 7, 8, 12};
		int len = arr.length;
		
		for(int i =0; i<len/4; i++) {
			int t = arr[i];
			arr[i] = arr[len/2-i-1];
			arr[len/2-i-1] =t;
		}
		for (int j = 0; j<len; j++) {
			System.out.println(arr[j]);
		}
	}
}
