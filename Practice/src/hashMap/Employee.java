package hashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Employee {
	
	String name, dept;
	int age;
	
	public Employee(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

	public static void main(String[] args) {
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("A", 1, "QE");
		Employee e2 = new Employee("B", 2, "Dev");
		Employee e3 = new Employee("C", 3, "Tester");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//traverse the HashMap
		for(Entry<Integer, Employee> m: emp.entrySet()) {
		int key = m.getKey();
		Employee e =m.getValue();
		
		System.out.println("Employee "+ key + "info");
		System.out.println(e.name+" "+e.age+" "+e.dept);
		}

	}

}
