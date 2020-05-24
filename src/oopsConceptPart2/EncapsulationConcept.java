package oopsConceptPart2;

public class EncapsulationConcept {

	// getter and setter method are used for this and always public 
	// Encapsulation is also called as data hidding and data binding 
	// private data variables so that these variables can not accessed directly from outside
	// PIE  - Polymorphism , Inheritance and Encapsulation
	
	private int age;
	private String name;
	
	
	
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		
		
		EncapsulationConcept ec = new EncapsulationConcept();
		
		ec.setAge(10);
		ec.setName("Tom");
		
		System.out.println(ec.getAge());
		System.out.println(ec.getName());
	}

}
