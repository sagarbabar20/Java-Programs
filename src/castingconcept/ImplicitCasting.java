package castingconcept;

public class ImplicitCasting 
{
	public static void main(String[] args) 
	{
		//ex.1 byte--> 1 byte--> int-->4 byte
//		byte a = 100;
//		System.out.println(a);
		
//		int b = (int) a;
//		System.out.println(b);
		
		//ex.2 int-->double
//		int a = 200;          // 4 byte
//		System.out.println(a);
//		
//		double b = (double) a;  //or  double b = a;
		
//   	System.out.println(b);
		
		//ex.3 
//		int a = 20;
//		int b = 50;
//		int c = a+b;
//		System.out.println(c);
		
		//ex.4 
		byte x = 50;
		byte y = 80;
//		byte z = x+y;    //not possible
		int z = x+y;     //automatic Implicit Casting
		System.out.println(z);
		
		//ex.5
		short a = 10;
		short b = 20;
//		short c = a+b;   //not possible
		int c = a+b;     // automatic Implicit Casting
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
