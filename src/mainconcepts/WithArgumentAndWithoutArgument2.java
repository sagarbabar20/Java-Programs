package mainconcepts;

public class WithArgumentAndWithoutArgument2 
{
	//1.without Argument
//	public static void method1()
//	{
//		System.out.println("method1 without argument");
//	}
	
	// 2.with argument method
//	public static void method2(int x)
//	{
//		System.out.println("method1 with argument");
//    }
	
	
	// 3.
//	public static void method3(String x)
//	{
//		System.out.println("method3-argment type-String");
//	}
	
	
	//4.
//	public static void method4(int x,int y)
//	{
//		System.out.println("method4-int type-2 argument");
//	}
	
	
	//5.multiple argument any data type
//	public static void method5(String x,int y,char z)
//	{
//		System.out.println("method5-String-int-char arg");
//	}
	
	
	//6.you can have any return type-no concren with argument
	//return type-->argument no relation
	public static int method6(String x)
	{
		int a=100;
		System.out.println(a);
		return 200;
	}
	
	

//----------------------------------------------------------
	public static void main(String[] args)
	{
		// 1
//		method1();
		
		// 2
//		method2(10);
		
		//3.
//		method3("Sagar");
		
		//4.
//		method4(10,20);
		
		//5.
//		method5("Sagar" ,10 ,'S');
		
		//6.
		method6("Sagar");            //100
		int x=method6("Call");       //100
		System.out.println(x);       //200
		System.out.println(x+100);   //300
	}
}
