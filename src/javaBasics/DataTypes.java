package javaBasics;

public class DataTypes {

	public static void main(String[] args) {
		
		/* data types - 
			1. int,
			2. double
			3. char
			4. String
			5. boolean
					*/
	//int is the data type
	// i is the reference
	// -10 is the value
		
		
		int i = -10; 
		System.out.println(i);
		i = 20;
		System.out.println(i);
		i = 30;	
		System.out.println(i);
		
		double x = 10.3;
		System.out.println(x);
		x = 3.9;
		System.out.println(x);

		char y = 'a';
		System.out.println(y);
		y = 'b';
		System.out.println(y);
		
		String a = "ajksadsjfdasfjhga67868686dsf";
		System.out.println(a);
		a = "akshkdjshfhakhsk";
		System.out.println(a);

		boolean t = false;
		System.out.println(t);

		int r = 10;
		int f = 20;
		int c = r+f;
		System.out.println(c);	
		i = 30;
		System.out.println(r); 
		
		String firstName = "Seshi";
		String lastName = "Nuthikattu";
		String fullName = firstName +" "+ lastName;
		System.out.println(fullName);	
		
	}
}