package Practice;

public class MethodConcept
{
	public static void method1()
	{
	//1.method
	for (int i=1; i<=5; i++)
	{
		System.out.println("SAGAR");
	}
	}
	
	//static method
	public static void method2() 
	{
		System.out.println("static method");
	}
	
	//non static
	public void method3()
	{
		System.out.println("non static method");
	}
	
	//return type method
	public static int method4()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	//non return method
	public static void method5()
	{
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println(c);
}
	
	//without argument method
	public static void method6()
	{
		System.out.println("without argument method");
		
		int a=500;
		int b=200;
		int c=a+b;
		System.out.println(c);
}
	//with argument & return type method
	public static int method7(int x)
	{
		int a=2000;
		int b=2000;
		int c=a+b;
		System.out.println(c);
		return c;

	}


	
    //Main method
	public static void main(String[] args) 
	{
		//method
		method1();
		method1();
		method1();
		
		//static method
		method2();
		
		//non static method
		MethodConcept x = new MethodConcept();
         x. method3();
         
     	//return type method
         method4();
         int y=method4();
         System.out.println(100+y);
         
         
     	//non return method
         method5();
         
         //without argument method
         method6();
         
         //with argument and return type method
         method7(50);
         int z = method7(50);
         System.out.println(10000+z);




	}
}
	
	

