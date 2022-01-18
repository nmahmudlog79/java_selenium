package wrapper_class;

public class Wrapper_Class1 {

	public static void main(String[] args) {
		
		//primitive to object --> auto boxing
		int x = 30;
		Integer y = Integer.valueOf(x);
		System.out.println("y = "+y);
		
		Integer z = x; //auto-boxing, now compiler will write Integer.valueOf(x);
		System.out.println("z = "+x);
	}

}
