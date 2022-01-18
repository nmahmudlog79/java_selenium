package finalize_concept;

public class Finalize_Concept {
	
	public void finlize() {
		System.out.println("finalize method");
	}

	public static void main(String[] args) {
		
		Finalize_Concept fc1 = new Finalize_Concept();
		Finalize_Concept fc2 = new Finalize_Concept();
		
		fc1 = null;
		fc2 = null;
		
		System.gc();

	}

}
