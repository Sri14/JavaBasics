package oopsConceptPart2;

public class SuperKeyword extends ConstructorConcept {

	public SuperKeyword() {
		super(10); // super key word calls the constructor in parent class which has the parameter requirement
		System.out.println("Super keyword constructor");
	}
	
	
	public static void main(String[] args) {
		
		
		SuperKeyword sk = new SuperKeyword();

	}

}
