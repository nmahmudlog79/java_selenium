package array_Concept;

public class CheckArraysEquals {

	public static void main(String[] args) {
		int [] a1 = {1,2,3,4};
		int [] a2 = {1,2,3,4};
		boolean status = true;
		if (a1.length == a2.length) {
			for (int i = 0; i < a2.length; i++) {
				if (a1[i] != a2[i]) {
					status = false;
				}
			}
		} else {
			status = false;
		} if (status == true) {
			System.out.println("Arrays are Equal");
		} else {
			
		}
	}
}
