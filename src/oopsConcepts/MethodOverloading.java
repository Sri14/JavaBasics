package oopsConcepts;

public class MethodOverloading {
	
	public static void main(String[] args) {
		
		
		MethodOverloading obj = new MethodOverloading();
		
			obj.sum();
			obj.sum(10);
			obj.sum(20, 30);
			obj.sum("hello");
			

	}
	
	// Method Overloading - when a method name is same with different arguments or different datatypes with in the same class 
	// can not create duplicate methods - this is not allowed in java
	// methods are independent to each other
	// can not create duplicate methods
	// we can use different data types to create similar methods 
	
	public void sum() {
		System.out.println("sum function - no parameters"); 
	}
	
	public void sum(int i) {
		System.out.println("number enerted is "+i);
	}
	
	public void sum(int i, int x) {
		int z = i+x;
		System.out.println("addition of two numbers is "+ z);
	}
	
	public void sum(String s) {
		System.out.println("word entered is "+ s);		
	}
	

}
