package mainconcepts;

public class Assignment
{
	int x;
	int y;
	//1.constructor
	public Assignment()
	{
	x =100;
	System.out.println(x);
	
	y=200;
	System.out.println(y);
}
	
	//2.with static method
	public static void method1()
	{
		System.out.println("static method");
	}
	
	//3.without non static method
	public void method2()
	{
		System.out.println("non static");
	}
	
	//4.without argument
	public static void method3()
	{
		System.out.println("without argument");
	}
	
	//5.with argument
	public static void method4(int x)
	{
		System.out.println("with argument");
	}
	
			 
	
	
	//main method
	public static void main(String[] args)
	{
		Assignment Sagar = new Assignment();

		method1();
		
		Sagar.method2();
		
		method3();
		
		method4(800);
		
		
		
	}
	
	
	
	

}
