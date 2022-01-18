package interface_concept;

public class Test {
	
	public static void main(String[] args) {
	
		System.out.println(US_BANK.min_balance);
		//US_BANK.min_balance = 1000;
		//not possible because variable of interface is static and final, which is not allowed to change. 
		
		HSBC_Bank hs = new HSBC_Bank();
		hs.credit();
		hs.debit();
		hs.edu_loan();
		hs.fundTransfer();
		hs.home_loan();
		hs.mutualFund();
		
		System.out.println("**************************************");
		//dynamic polymhorphism
		//child class object can be referred by parent Interface reference variables 
		
		US_BANK us = new HSBC_Bank();
		us.credit();
		us.debit();
		us.fundTransfer();
		
	}

}
