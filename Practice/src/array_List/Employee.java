package array_List;

import java.util.ArrayList;
import java.util.Iterator;

//create user defined class object ArrayList
public class Employee {
	
	String name, dept;
	int age;
	
	public Employee(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
		
	}
	
	public static void main(String[] args) {
		
		//create employee class object
		Employee e1 = new Employee("A", 1, "QA");
		Employee e2 = new Employee("B", 2, "Dev");
		Employee e3 = new Employee("C", 3, "Tester");
		
		//create ArrayList 
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(e3);
		emp.add(e2);
		emp.add(e3);
		
		//iterate to traverse the values
		Iterator<Employee> itr = emp.iterator();
		while (itr.hasNext()) {
			Employee employee = (Employee) itr.next();
			System.out.println(employee.name+" "+employee.age+" "+employee.dept);
		}
	}
}
