package polymorphism2;

public class Methodoverloading 
{
	public void method1()
	{
		System.out.println("method1-without argument");
	}
	
	public void method1(int x)
	{
		System.out.println("method2-int argument");
	}
	
	public void method1(char y)
	{
		System.out.println("method3-char argument");
	}

	
	public static void main(String[] args) 
	{
		Methodoverloading x = new Methodoverloading();
		x.method1();
		x.method1(20);
		x.method1('S');
		
		
	}
}
