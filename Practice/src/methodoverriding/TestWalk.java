package methodoverriding;

public class TestWalk {

	public static void main(String[] args) {
		
		Walk w = new Walk();
		w.walk();
		//Problem is that I have to provide a specific implementation of walk() method in subclass that is why we use method overriding.
	}
}
