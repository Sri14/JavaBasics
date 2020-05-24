package oopsConcepts;

public class StaticAndNonStatic {

	String name = "Tom"; // global variable and it is non Static
	static int age = 25; // global variable and it is static
	
	public static void main(String[] args) {
		
		StaticAndNonStatic obj = new StaticAndNonStatic();
		
		obj.sendmail(); // non static method - create an object of the class and call it with reference  
		System.out.println(obj.name);
		
		
		sum(); // static method - call directly 
		System.out.println(age); // static global variable - access directly
		StaticAndNonStatic.sum(); // static method - calling with classname
		System.out.println(StaticAndNonStatic.age); // static global variable - calling with classname
		
		obj.sum(); // calling a static method with an object reference of the class throws a warning 
	}
	
	public void sendmail() { // non static method
		System.out.println("non static send mail method");
	}
	
	public static void sum() { // static sum method
		System.out.println("static sum method");
	}

}
