package string_problem;
	//https://www.educative.io/edpresso/how-to-check-if-strings-are-rotations-of-each-other-in-java
public class RotationString {

	 static boolean areRotations(String str1, String str2){
	        return (str1.length() == str2.length()) &&
	               ((str1 + str1).indexOf(str2) != -1);
	 }       
		public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "CDAB";
		
		 if (areRotations(s1, s2)) {
	            System.out.println("Strings are rotations of each other");
		 }else
	            System.out.printf("Strings are not rotations of each other");
		}
}

