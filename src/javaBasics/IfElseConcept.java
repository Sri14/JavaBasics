package javaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
	
	//String concatenation 	
		
		int a = 10;
		int b = 20;
		
		String c = "Hello";
		String d = "mate";
		
		System.out.println(a+b);
		System.out.println(c+d);
		
		System.out.println(a+b+c+d);
		
		System.out.println(c+d+a+b);
		
		System.out.println(c+d+" "+(a+b));
		
		System.out.println(c+a+d+b+(a+b));
		
	//difference between System.out.println and System.out.print	
	// ln - line new
		
		System.out.print("nice sunny");
		System.out.println("day");
		System.out.println("hello");

		
		// Comparison operators > < >= <= == =!
		//if else concept
		int i = 10;
		int x = 20;
	
		if(i>x) {
			System.out.println("i is equal to x");
		}else
		{
			System.out.println("i is not equal to x");
		}
		
		int o = 400;
		int p = 500;
		int q = 600;
		
		if(o>p & o>q) {
			
			System.out.println("o is the greatest");
		}
		else if(p>q) {
			System.out.println("p is the greatest");
		} 
		else 
		{
			System.out.println("q is the greatest");
		}
		
		int n = 99;
		
		if(n<=99) {
			System.out.println("Balance is less than required minimum  Rs.100 and your balance  is "+ (n));
		}else
		{
			System.out.println("Your Balance is "+ n );
		}
		
		
		//Switch statements 
		
		int r =2;
		
		switch(r) {
		case 0:
			System.out.println("Number entered is Zero");
			break;
		case 1:
			System.out.println("Number entered is One");
			break;
		case 2:
			System.out.println("Number entered is two");
			break;
		case 3:
			System.out.println("Number entered is Three");	
			break;
		}
		
		
		String m = "Something";
			
		switch (m){
			case "Hello":
				System.out.println("Hello there");
				break;
			case "Hi":
				System.out.println("Hi");
				break;
			default:
				System.out.println("Enter a correct Message");
				break;
		}
		
		
	}
}
