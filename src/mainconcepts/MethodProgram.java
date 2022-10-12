package mainconcepts;

public class MethodProgram 
{
//program-How to use argument in program
	
	//1.Without argument type
//	public static void additionMethod()
//	{
//		int a=50;
//		int b=100;
//		int c=a+b;
//		System.out.println(c);
//	}
	
	//2.With argument 
//	public static void additionMethod(int x,int y)
//	{
//		int a=200;
//		int b=400;
//		int c=a+b;
//		System.out.println(c);
//	}
	
	//3.Use argument
//	public static void additionmethod(int x,int y)
//	{
//		int a=x;
//		int b=y;
//		int c=a+b;
//		System.out.println(c);
//	}
	
//---------------------------------------------------------
	//non static-->return type-->use argument
//	public int method1(int x ,int y)
//	{
//	 int a=x;
//	 int b=y;
//	 int c=a+b;
//	 System.out.println(c);
//	 return c;
//	}
//-------------------------------------------------	
	//non static-->non return type-->use argument
     public void method2(int x,char y, String z)
     {
    	 int a=x;
    	 char b=y;
    	 String c=z;
    	 System.out.println(a + b + "  "+ c);
    	 }
	
	//Main method
	 static public void main(String[] args) 
	{
    	 // Calling method 
//		additionMethod();
		
//		additionMethod(20,40);
		
//		additionmethod(500,100);
		 
//--------------------------------------------------------		 
	// Calling-->non static-->return type-->use argument
		//object create
// MethodProgram x = new MethodProgram();
//               x.method1(50, 50);
//               int z = x.method1(50, 50);
//               System.out.println(100 + z);
//               System.out.println(300 + z);
//-------------------------------------------------------	
	//Calling-->non static-->non return type-->use argument
	 MethodProgram x = new MethodProgram();
	               x.method2(100, 'S', "Sagar");


	
	
	
	
	
	
	
	}
}
