package finalize_concept;

public class Try_Catch {

	public static void main(String[] args) {
		
		try {
			int x = 10;
			int y = 0;
			int res = x/y;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception :"+e);
		} catch (ArithmeticException e1) {
			System.out.println("Arithmatic Exception :"+e1);
		}finally {
			System.out.println("Last line of the code");
		}

	}

}
