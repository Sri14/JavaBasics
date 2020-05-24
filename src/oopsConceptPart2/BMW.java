package oopsConceptPart2;

public class BMW extends Car{ // this is also called as has - a relationship
	
	//extends is the key word where all the methods from car are passed to BMW class

	// Method Overriding - when we have a same method in Parent class and child class the code is executed from child class.
	
	
	public void start() {
		System.out.println("BMW ... Starting");
	}
	
	public void stop() {
		System.out.println("BMW...Stopping");
	}
	
	public void thefSaftey() {
		System.out.println("BMW Theft saftey");
	}
	
}
