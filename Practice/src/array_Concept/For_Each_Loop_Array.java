package array_Concept;

public class For_Each_Loop_Array {
	
	public static void main(String[] args) {
		
		String [] name = {"alpha", "beta", "omega", "solar"};
		
		System.out.println("looping over array using for each loop :\n");
		for (String string : name) {
			System.out.println(string);
		}
		
		System.out.println("\nlooping over array using classical for loop :\n");
		for (int i = 0; i < name.length/2; i++) {
			System.out.println(name[i]);
		}
	}

}
