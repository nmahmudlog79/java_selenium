package encapsulation_concept;

public class Employee {
	
	private String empName;
	private int empAge;
	private int empSSN;
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public int getEmpSSN() {
		return empSSN;
	}
	public void setEmpSSN(int empSSN) {
		this.empSSN = empSSN;
	}

}
