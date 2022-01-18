package interface_concept;

	//if a class is implementing any interface, then it is mandatory to define/override all the methods of interface.
public class HSBC_Bank implements US_BANK, Brazil_Bank {// we are achieving multiple inheritance
	// IS-A relationship....relation between class and interface

	@Override // Brazil Bank method
	public void mutualFund() {
		System.out.println("HSBC----Mutual Fund");

	}

	@Override // US Bank method
	public void credit() {
		System.out.println("HSBC---Credit");

	}

	@Override // US Bank method
	public void debit() {
		System.out.println("HSBC---Debit");

	}

	@Override // US Bank method
	public void fundTransfer() {
		System.out.println("HSBC---Fund Transfer");

	}

	// own method of HSBC
	public void edu_loan() {
		System.out.println("HSBC---EDU_LOAN");
	}

	// own method of HSBC
	public void home_loan() {
		System.out.println("HSBC---HOME LOAN");
	}

}
