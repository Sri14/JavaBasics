package oopsConceptPart2;

import java.util.ArrayList;

public class ArrayListConcept {

	
	// Array list does not have a size restriction.
	// add any data type into it.
	// key word is add
	
	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		
		ar.add(100); //position 0 //index 0
		ar.add("Hello"); //position 1 // index 1
		ar.add('D'); //2
		ar.add(10.5); //3
		
		System.out.println(ar.size()); // prints 4
		ar.add(50);//4
		
		System.out.println(ar.size()); // prints 5
		
		System.out.println(ar.get(1));
		
		System.out.println("**************");
		for(int i =0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		ArrayList<String> ar1 = new  ArrayList<String>();
		ar1.add("Name");
		ar1.add("akjhdsa");
		
		for(int p=0; p<ar1.size(); p++) {
			System.out.println(ar1.get(p));
		}
	}

}
