package constructor_chaining;

public class Employee {
	
	int id, age;
	String name, address;
	
	public Employee(int age) {
		this.age =age;
	}
	
	public Employee(int id, int age) {
		this(age);
		this.id =id;
	}
	
	public Employee(int id, int age, String name, String address) {
		this(id, age);
		this.name =name;
		this.address =address;
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee(100, 23, "Nurul", "Lodi");
		System.out.println("ID=> "+employee.id+" Name=> "+employee.name+" age=> "+employee.age+" address=> "+employee.address);
	}

}
