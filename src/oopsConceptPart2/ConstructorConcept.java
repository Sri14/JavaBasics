package oopsConceptPart2;

public class ConstructorConcept {
	
	//all classes have a hidden default constructor.
	
	String name;
	int age;
	
	public ConstructorConcept() { // no parameters in this constructor
		System.out.println("Default constructor");
	}
	
	public ConstructorConcept(int a) { // constructor overloading and single parameter constructor
		System.out.println("Single parameter constructor");
		System.out.println();
	}
	
	public ConstructorConcept(String name , int age) { // double parameter constructor
		this.name = name;
		this.age = age; // this keyword assigns local name to global name
	}
	
	public static void main(String[] args) {
		
		ConstructorConcept cc = new ConstructorConcept(); //prints Default constructor
		ConstructorConcept cc1 = new ConstructorConcept(10); // print Single parameter constructor
		ConstructorConcept cc2 = new ConstructorConcept("Tom", 30); //assigns these values to global varaibales
		System.out.println(cc2.age); // prints 30
		System.out.println(cc2.name); // print Tom
		

	}

}
