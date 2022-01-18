package enumclass;

public class EnumConcept {
		//define enum class outside the main class
		public enum Month{
			JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
		}
		//main method
	public static void main(String[] args) {
		//traversing the enum
		for(Month m:Month.values()) {
			System.out.println(m);
		}
	}
}
