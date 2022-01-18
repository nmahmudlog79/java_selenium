package method_concept1;

public class Return_Value {
	
	public int square(int value) {
		int square = value*value;
		return square;
	}
	
	public static void main(String[] args) {
		Return_Value rValue = new Return_Value();
		int result = rValue.square(7);
		System.out.println(result);
	}
}
