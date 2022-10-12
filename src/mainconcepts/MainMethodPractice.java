package mainconcepts;

public class MainMethodPractice 
{
	//main method use
//	public static void method()
//	{
//		for (int i=1; i<=5; i++) 
//		System.out.println("Sagar");
//	}
//	//Main method
//	public static void main(String[] args)
//	{
//		method();
//		method();
//		method();
// }
//---------------------------------------------------------
	//Types of main method
	//1.Static method
//	public static void method1()
//	{
//		int a=100;
//		System.out.println(a);
//	}
//	//main method 
//	public static void main(String[] args) 
//	{
//		//Calling directly
//		method1();
//		//Calling with class name 
//		MainMethodPractice.method1();
//		}
//----------------------------------------------------------
	//2.non static method
//	public void method2()
//	{
//		int a=500;
//		System.out.println(a);
//	}
//	//main method
//	public static void main(String[] args)
//	{
//		//create object
//   MainMethodPractice x = new MainMethodPractice();
//                      x.method2();
//  }
//
//-----------------------------------------------------------
	//3.Return type
//	public static int method3()
//	{
//	int a=20;
//	int b=40;
//	int c=a+b;
//	System.out.println(c);
//		return c;
//	}
//		//main method
//		public static void main(String[] args)
//		{
//			method3();
//			int x=method3();
//           System.out.println(300 + x);
//}
//------------------------------------------------------------
	//4.Non return type
//	public static void method4()
//	{
//		int a=50;
//		int b=110;
//		int c=a+b;
//		System.out.println(c);
//	}
//	//main method 
//	public static void main(String[] args) 
//	{
//		method4();
//	}
//-------------------------------------------------------------
	//with argument
	public static void method5(int x, int y)
	{
		int a=100;
		System.out.println(a);
	}
	//main method
	public static void main(String[] args) 
	{
		method5(1,2);
	}
	
}

		
	
		

