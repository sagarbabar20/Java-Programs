package mainconcepts;

public class MethodConcept
{
//	public static void printpattern()
//	{
//		for(int i=1; i<=5; i++)
//		{
//			System.out.println(i);
//		}
//	}
//	
//	//main method
//	public static void main(String[] args) 
//	{
//		printpattern();
//		System.out.println("Hello Sagar");
//		
//		printpattern();
//		System.out.println("ABC");
//	}
//----------------------------------------------------------	
	// Types of method 
	
	//1.Static method 
//	public static void additionMethod1()
//	{
//		int a = 20;
//		int b = 60;
//	    int c = 20+60;
//		System.out.println(c);
//	}
//	
//	//2.non static method
//	public void additionMethod2()
//	{
//		int a = 20;
//		int b = 60;
//	    int c = 20+60;
//		System.out.println(c);
//	
//	}
//
//	//main method
//	public static void main(String[] args)
//	{
//		//calling static method with method name
//		additionMethod1();
//		
//		//calling static method with class name
//		MethodConcept.additionMethod1();

		
		//calling non static method
//		additionMethod2();   //not possible
//		MethodConcept.additionMethod2();  //not possible
		
//we always need to create the object to call the non static method.		

 //----------------------------------------------------------
		
		//Return type method
//	public static int method1()
//	{
//		int a=50;
//		int b=100;
//		int c=a+b;
//		System.out.println(c);
//		return c;
//	}
//	
//	//non return type method
//	public static void method2()
//	{
//		int a=100;
//		int b=200;
//		int c=a+b;
//		System.out.println(c);
//	}
//	
//	//return type-->char 
//	public static char method3()
//	{
//		int a=500;
//		char b='x';
////		return a;   //not possible
//		System.out.println(b);
//		return b;
//	}
	
	
	//without argument method
	public static void method1()
	{
		System.out.println("without argument method");
	}
	
	//with argument method
	public static void method2(int x)
	{
		System.out.println("with argument method");
	}
	
	//return type method with argument
	public static int method3(int x,int y)
	{
		int a=50;
		int b=100;
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	

	
	
	//main method
	public static void main(String[] args)
	{
		//calling return method
//		method1();  //we can not use this value in further program.
		
		//we can use this value in further program.
//		int x=method1();
//		System.out.println("value of x " + x);
//		System.out.println(100 + x);
//		System.out.println(500 + x);
		
		
		//calling non return type method
//		method2();
		
//		int y=method2();  //not possible 
//		System.out.println("value of y " + y);  //not possible
	
	
		//char type method calling
//		method3();
//		
//		char y = method3();
//		System.out.println(y);
		
		//calling without argument
//		method1();
		
		//calling with argument
//		method2(50);
		
		//calling return type with argument
		method3(5,10);
		
		int x=method3(5,10);
		System.out.println("value of x " + x);
		System.out.println(500 + x);

		
		
		
	
	}
		
		
	}


