package mainconcepts;

public class SagarClass 
{
	int a;
	//constructor without argument
	public SagarClass()
	{
		a=20;
		System.out.println("value of a is-" + a);
	}
	
	//constructor with argument
	public SagarClass(int x)
	{
	a=40;
	System.out.println("value of a is-" + a);
	}
	
	//3.constructor with argument
	public SagarClass(int x,int y) 
	{
		a=60;
		System.out.println("value of a is-"+ a);
	}
	
	
	//main method
	public static void main(String[] args) 
	{
		//1.object create with first constructor
		SagarClass x = new SagarClass();
		x.method1();
		
		//2.object create with second constructor

		SagarClass y = new SagarClass(500);
		y.method1();
		
		//3.object create with third constructor

		SagarClass z = new SagarClass(500,1000);
		z.method1();
		}
	
	//non static method creation
	public void method1()
	{
	System.out.println("This is non static method-method1");	
	}


}
