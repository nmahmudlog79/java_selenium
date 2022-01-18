package methodoverriding;

public class Test {

	public static void main(String[] args) {
		
		//create the object of BMW class inside the Test Car because BMW is publicly defined
		
				//static polymorphism--compile time
				BMW b = new BMW();
				b.start();
				b.stop();
				b.refuel();
				b.theftSafety();
				
				System.out.println("*************");
				
				Car c = new Car();
				c.start();
				c.stop();
				c.refuel();
				
				System.out.println("*************");
				
				//Top casting
				Car c1=new BMW();//Child class object can be referred by parent class reference variable---dynamic polymorphism—run time polymorphism. 
				c1.start();
				c1.stop();
				c1.refuel();
				//c1.theftSafety(); is not possible...its properties of BMW class. it is only possible by method overriding
				//How can you access just creating the reference. you can refer my object but you can't take my properties
				//Method overriding is one of the way by which java achieve Run Time Polymorphism.
				
				//down casting is not allowed
				//BMW b1= new Car();

	}

}
