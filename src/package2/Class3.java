package package2;

import package1.Class1;

public class Class3
{
	//main method
	public static void main(String[] args) 
	{
		//static method
		System.out.println(Class1.a);
		
		Class1.method1();
		
		
		//non static
		Class1 x = new Class1();
		System.out.println(x.b);
		
		x.method2();
		
	}

}
