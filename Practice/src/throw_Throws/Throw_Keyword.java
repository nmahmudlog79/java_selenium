package throw_Throws;
	
	//throw an exception deliveredly or I want to create my own exception and I want to throw it.
	//Sometimes what happens, some exceptions are not occurred in Java.
	//Java can't create each and every exception. That time I can create my own exception by throw keyword
	//it created by "add throws declaration" or "surround with try-catch block".
public class Throw_Keyword {
	
	public static void main(String[] args) {
		
		System.out.println("ABC");
		
		try {
			throw new Exception("Nurul Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("PQR");
	}

}
