package oopsConcepts;

public class LocalVariablesVsGlobalVariables {

	//global Variables
	String name = "Seshi";
	int age  = 20;
	
	public static void main(String[] args) {

		int i = 10; //local variable
		System.out.println(i);
		
		LocalVariablesVsGlobalVariables vb = new LocalVariablesVsGlobalVariables();
		
		int y = vb.abc();
		System.out.println(y);
		
		System.out.println(vb.name);
		System.out.println(vb.age);
	}
	
	public int abc() {
		int i = 20; //local variable
		return i;
	}
	
}
