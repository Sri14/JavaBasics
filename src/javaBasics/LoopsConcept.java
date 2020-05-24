package javaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
		
		
		// while loop
		int y =7;
		int i = 1; // Initialisation 		
		while(i<=100) { // Conditional part 
			System.out.println(y + " x " + i +" = " + y*i);	
			i = i+1; // Incremental part 
			
		}
		
		// for loop
		
		int e =5;
		for(int x=1 ; x<=10; x++) {
			System.out.println(e+ " x " + x +" = "+ e*x);
		}
		
		for(int a=0; a<10; a++) {
			System.out.println(a);
		}
		
		
		for(int x=0; x<=10; x++) {
			System.out.println(x);
		}
		
	}

}
