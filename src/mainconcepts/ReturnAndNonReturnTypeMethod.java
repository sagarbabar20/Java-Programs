package mainconcepts;

public class ReturnAndNonReturnTypeMethod 
{
	//Depend-data type
	//void-->it will not return anything
	//int,String,char etc-->Return Something
   //byte,long,short,int,char,double,float,string
	
       //Return Type Method
		public static int method1()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return c;
	}
		
		//Non return method
//		public static void method2()
//		{
//      int a=100;
//		int b=200;
//		int c=a+b;
//		System.out.println(c);
			
		//Return type-char
//			public static char method3()
//			{
//				int a=200;
//				char b='S';
////				return a;    //not possible
//				System.out.println(b);
//				return b;		
//			}
		
	
	public static void main(String[] args)
	{
//		calling return type method
//		int-int value return
//		that int u can store anywhere
//		you can return any value from method
		
		int x=method1();
		System.out.println("value of x-"+x);
		System.out.println(20+x);
	
//------------------------------------------	
//		Calling non return method
//		will simply excute the code
//		method1();
//		int y=method1();  //not possible
		
//-----------------------------------------------
//		char x= method3();
//		System.out.println(x);
//	}
	
	//return type method
//		method3();
	
		
	}
	
	
}


