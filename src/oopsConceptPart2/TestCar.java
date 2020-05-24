package oopsConceptPart2;

public class TestCar {

	public static void main(String[] args) {

		// creating an object of the BMW class with b as reference 
		
		BMW b = new BMW();
		Ford f = new Ford();
		
		// b can call all methods from BMW and Car class.
		 
		//The below way of calling methods from parent and child class is called static polymorphism / compile time polymorphism 
	
		b.thefSaftey(); // BMW class
		b.start(); // BMW Class
		b.stop(); // Car class
		b.refuel(); // Car class
		b.engine();// Vechile class
		
		f.start(); //Ford class
		f.stop(); // Car class
		f.engine(); // vechile class
	
		Car c = new Car();
		
		c.start();
		c.stop();
		c.refuel();
		//c.theftSaftey();// this is an error
		
		Car c1 = new BMW(); // when a child class object is referred by parent class reference variable - this is called dynamic polymorphism / runtime polymorphism
		c1.start(); // BMW class
		c1.stop(); // BMW class
		c1.refuel(); // Car class
		c1.engine(); // vechile 
		
		//In dynamic polymorphism child class methods are not accessible 
		
		Car c2 = new Ford();
		c2.start(); // ford class
		c2.engine(); // vechile class
	}

}
