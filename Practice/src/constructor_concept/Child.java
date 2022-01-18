package constructor_concept;

public class Child extends Super {

	public Child() {
		this(50);
	}
	
	public Child(int i) {
		super(i);
	}
}
