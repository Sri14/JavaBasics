package package1;

public class Class1 {

	public int x =10;
	public String y ="name";
	int r =10;
	protected int t=10;
}

//Access modifiers       class      inside package        outside/subclass    outerworld
//1. defualt       			y			y						n					n
//2. public					y			y						y                 	y
//3. protected				y			y						y					n
//4. private				y          n						n					n