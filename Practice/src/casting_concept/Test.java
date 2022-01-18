package casting_concept;

public class Test {

	public static void main(String[] args) {
		Person p = new Teacher();//create sub class object and put it in super class, it is called up-casting and its automatically done 
		p.display();//by up-casting we can put sub class object in super class
		
		Teacher t = (Teacher) new Person();//we can't put super class object in sub class. here we want to put large things in small things 
		t.display();//down-casting is not possible, it will give ClassCastException
	}
}
