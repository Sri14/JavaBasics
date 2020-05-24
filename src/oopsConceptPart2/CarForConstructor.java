package oopsConceptPart2;

public class CarForConstructor {

	String name;
	int price;
	String model;

	public CarForConstructor(String name, int price, String model) {
		this.name = name;
		this.price = price;
		this.model = model;
//		
//		name = name1;
//		price = price1; this way of passing the values to global is not good use this key word
//		model = model1;
	}

	public static void main(String[] args) {

		CarForConstructor cc = new CarForConstructor("Audi", 35, "A8");
		
		System.out.println(cc.model);
		System.out.println(cc.name);
		System.out.println(cc.price);
	}

}
