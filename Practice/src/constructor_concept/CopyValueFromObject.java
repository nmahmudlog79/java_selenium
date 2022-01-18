package constructor_concept;

public class CopyValueFromObject {
	
	int id;
	String name;
	
	public CopyValueFromObject(int id, String name) {
		System.out.println("Constructor Called");
		this.id =id;
		this.name =name;
	}
	
	 //Copy value of one object into another.
	public CopyValueFromObject(CopyValueFromObject obj) {
		this.id = obj.id;
		this.name = obj.name;
	}

}
