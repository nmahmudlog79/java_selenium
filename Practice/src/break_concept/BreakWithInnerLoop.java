package break_concept;

public class BreakWithInnerLoop {

	// Java Break Statement with Inner Loop
	// It breaks inner loop only if you use break statement inside the inner loop.
	// Need to understand clearly
	public static void main(String[] args) {
		
		//outer loop
		for(int i =1; i<=3; i++) {
			//inner loop
			for(int j =1; j<=3; j++) {
				if(i == 2 && j ==2) {
					break;//using the break statement inside the inner loop
				}
				System.out.println(i+" "+j);
			}
		}

	}

}
