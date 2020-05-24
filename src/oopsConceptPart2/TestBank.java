package oopsConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		HSBC hs = new HSBC();
		
		hs.carloan();
		hs.credit();
		hs.debit();
		hs.mortgages();
		hs.transferMoney();
		hs.mutualFund();
		System.out.println(hs.mim_bal);
		
		
		//dynamic polymorphism 
		
		USBank ub = new HSBC();
		
		
	//	USBank ud = new USBank(); This is not allowed - can not create an object of the interface
		
		ub.credit();
		ub.debit();
		ub.transferMoney();
	

	}

}
