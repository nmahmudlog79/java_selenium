package wrapper_class;

public class Wrapper_Class2 {

	public static void main(String[] args) {
		
		//object into primitive ---unboxing
		Double d  = new Double(12.10);
		System.out.println("d ="+d);
		
		//double d1 = d.doubleValue();
		double d1 = d; 
		System.out.println("d1 ="+d1);
	}

}
