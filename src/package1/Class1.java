package package1;

public class Class1 
{
	//Static variable
		public static int a=100;
		
		//static method
		public static void method1()
		{
			System.out.println("Static-method1");
		}
		
		//non static variable
		public int b=200;
		
		//non static variable
		public void method2()
		{
			System.out.println("Non static-method2");
		}
		

		//main method
		public static void main(String[] args)
		{
			System.out.println(a);
			
			method1();
			
			Class1 x = new Class1();
			System.out.println(x.b);
			
			x.method2();
			
		}


}
