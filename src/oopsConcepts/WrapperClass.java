package oopsConcepts;

public class WrapperClass {

	public static void main(String[] args) {
		
		//Converting String in to int
		
		String s = "100";
		System.out.println(s + 10); // prints 10010
		//we will use a Warapper class called Integer
		int x = Integer.parseInt(s);
		System.out.println(x +10); // prints 110
		
		String f = "100A"; // can not use Interger to convert - it should only be numeric value
		 
		//convert String in to double
		String a = "10.5";
		System.out.println(a + 10); // prints 10.510
		
		double d = Double.parseDouble(a); 
		System.out.println(d+10); // 20.5
		
		// convert String to boolean
		String b = "true";
		
		boolean e = Boolean.parseBoolean(b);
			System.out.println(e);
			
		// convert int into a String
			
		int j = 100;	
		System.out.println(j+10); // prints 110
			
		String k = String.valueOf(j);
		System.out.println(k+10); // prints 10010
	
		
	
	}
	
	
	

}
