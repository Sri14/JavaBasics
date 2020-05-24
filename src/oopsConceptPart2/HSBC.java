package oopsConceptPart2;

public class HSBC implements USBank , UKBank { //This is also called is-a relationship
	
	//we have to implement all the methods which are in the interface
	//Method body needs to be given 

	
	public void credit() {
		System.out.println("HSBC...credit");
	}
	
	public void debit() {
		System.out.println("HSBC..debit");
	}
	
	public void transferMoney() {
		System.out.println("HSBC..transferMoney");
	}
	
	public void mortgages() {
		System.out.println("HSBC...Mortgages");
	}

	public void carloan() {
		System.out.println("HSBC...carLoan");
	}

	public void mutualFund() {
		System.out.println("HSBC ...MutualFund");
		
	}
}
