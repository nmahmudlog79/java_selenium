package array_Concept;

//Array:to store similar data type values in array variable;
//Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
//lowest bound/index=0;
//highest bound/index=(n-1) (n is size of array)
//Advantage: One variable can store multiple value
//disadvantage: size is fixed---static array--to overcome this we use collections--Arraylist, Hash Table
//store similar data types value---to overcome this we use object array.
//No, need to declare a lot of variable of same type data
//Random access: We can retrieve any data from array with the help of the index value.
//add elements with the help of assignment operator
//does not support generic i.e. not type safe

public class Array_Concept {
		
	public static void main(String[] args) {
		//declaring an array
		String [] cars = {"BMW", "AUDI", "HONDA", "NISSAN"};
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		cars[1] = "TOYOTA"; //changing the car name at 2nd position
		System.out.println("\n cars name after changing :");
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		int [] num = {10, 20, 30, 40, 50, 60};
		System.out.println(num[1]);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}
}
