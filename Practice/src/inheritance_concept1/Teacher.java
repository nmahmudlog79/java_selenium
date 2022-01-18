package inheritance_concept1;

public class Teacher extends Person{
	
	//getName(), setName(), getAge(), setAge() automatically comes due to extends
	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public void displayInfo() {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getDeptName());
	}

}
