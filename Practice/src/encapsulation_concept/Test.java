package encapsulation_concept;

public class Test {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setEmpName("Nurul Mahmud");
		employee.setEmpAge(20);
		employee.setEmpSSN(1111113);
		
		System.out.println("Employee Name is :"+employee.getEmpName());
		System.out.println("Employee Age is :"+employee.getEmpAge());
		System.out.println("Employee SSN is :"+employee.getEmpSSN());

	}

}
