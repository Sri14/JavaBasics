package oopsConcepts;

public class CallByValueAndCallByreference {

	int p; // global variables
	int q; // global variables
	
	
	public static void main(String[] args) {
		
		CallByValueAndCallByreference obj = new CallByValueAndCallByreference();
		
		int x = 20;
		int y = 20;
		
		obj.testSum(y, x);
		
		int j = obj.testSum(x, y); // this is called call by value or pass by value
		System.out.println(j);
	
		obj.p = 30;
		obj.q = 40;
		
		// before swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		obj.swap(obj);
		
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	public int testSum(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public void swap(CallByValueAndCallByreference t) { // this is called call by reference or pass by refernce
		int temp ; //local variable
		
		temp = t.p; // temp will have 10
	 // temp assigned the value of t.p
		t.p = t.q; // t.p will have 20
		
	// t.p is assigned the value of t.q
		t.q = temp; //t.q willhave 10
		
	// t.q is assigned the value of temp	
		//t.p =10;
		//t.q =20
		
	}

}
