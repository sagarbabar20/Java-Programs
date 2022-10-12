package mainconcepts;

public class ConstructorProgram3 
{
	int x;
	int y;
	public ConstructorProgram3()
	{
		//Constructor
		x=500;
		System.out.println(x);
		y=1000;
		System.out.println(y);
	}
//-------------------------------------------------------	
	//2.static Method
	public static void method1()
	{
		System.out.println("method1-static");
	}
	
	//3.Non Static method
	public void method2()
	{
		System.out.println("method2-non static");
	}
	 
	
	//main method
	public static void main(String[] args)
	{
		//1.Constructor method calling
//		ConstructorProgram3();
//		constructor call-->object-->object syntax
		ConstructorProgram3 Sagar = new ConstructorProgram3();
		
		//2.static method calling
		method1();
		
		//3.Non static method calling with object
		//object name-->method name
		
		Sagar.method2();
		
		
	}
	
	

}
