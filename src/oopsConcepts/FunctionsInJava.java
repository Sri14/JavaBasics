package oopsConcepts;

public class FunctionsInJava {

	//non static methods
	
	//3 types 
	// 1. no input and no output
	// 2. no input but still output
	// 3. some input and some output
	
	public static void main(String[] args) {
		
		FunctionsInJava j = new FunctionsInJava(); // creating an object of the FunctionsInJava class
		
	
		j.test();
		int i = j.abc();
		System.out.println(i);
		String s = j.qa();
		System.out.println(s);
		int x = j.divsion(20, 10);
		System.out.println(x);
	}
	 //no input and no output
	public void test() {
		System.out.println("test method");
	}
	
	//no input but some output
	public int abc() {
		System.out.println("abc method");
		int a = 10; // local variables
		int b = 20; // local variables
		int c = a+b; // local variables
		
		return c;
	}
	//no input but some output
	public String qa() {
		System.out.println("qa method");
		String s  = "Selenium";
		
		return s;
	}
	//some input and some output
	public int divsion(int a, int b) { // int a and int b - these are called parameters or arguments
		System.out.println("division method");
		int c = a/b;
		return c;
	}

}
