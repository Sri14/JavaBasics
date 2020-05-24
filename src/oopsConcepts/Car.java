package oopsConcepts;

public class Car {

	int model; //global variables
	int wheel; //global variables
	
	public static void main(String[] args) {
		// new Car() is the Object of the Car class
		// a is the Object reference variable
		// new keyword that creates the object
		
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model = 2000;
		a.wheel = 4;
	
		b.model = 2010;
		b.wheel = 4;

		c.model = 2020;
		c.wheel = 4;
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		System.out.println(b.model);
		System.out.println(c.model);
		
		a=b;
		
		System.out.println("*************after change********");
		System.out.println(a.model);
		
		b=c;
		c=a;
		
		System.out.println(b.model);
		System.out.println(c.model);
		
		c.model = 2021;
		
		System.out.println("**********after updating c*********");
		System.out.println(c.model);
		System.out.println(a.model);
	}

}
