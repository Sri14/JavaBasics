package oopsConceptPart2;

public interface USBank {
	
	// only methods are declared  - no body
	// we can declare variables
	// method overriding is allowed
	// variable is static in nature
	// interface variables are final /constant in nature 
	// no static methods are allowed in interface
	// no main method in interface
	// can not create an object of the interface

	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	int mim_bal = 100;
	
}
