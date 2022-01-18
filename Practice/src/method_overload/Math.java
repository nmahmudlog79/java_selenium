package method_overload;

		
public class Math {
	
	public void sum() {
		System.out.println("Sum Method---Zero Parameter");
	}
	
	public void sum(int i) {
		System.out.println("Sum Method---One Parameter");
		System.out.println(i);
	}
	
	public void sum(int i, int j) {
		System.out.println("Sum Method---Two Parameter");
		System.out.println(i+j);
	}
	
	

}
