package constructor_concept1;

public class Constructor_Demo {
	
	String name;
	int age;
	
	public Constructor_Demo() {
		System.out.println("Default Parameter Constructor");
	}
	
	public Constructor_Demo(int i) {
		System.out.println("One Parameter Constructor");
	}
	
	public Constructor_Demo(int i, int j) {
		System.out.println("Two Parameter Constructor");
		System.out.println(i +" "+j);
	}
	
	public Constructor_Demo(String name, int age) {
		this.name = name;
		this.age =age;
		System.out.println(name+ " is ==> " +age);
	}

}
