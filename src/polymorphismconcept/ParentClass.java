package polymorphismconcept;

public class ParentClass 
{
   //Method overloading
   //possible -static and non static
	//non static
	public void method1()
	{
		System.out.println("method1-zero argument");
	}
	
	public void method1(int x)
	{
		System.out.println("method1-int argument");
	}
	
	public void method1(char y)
	{
		System.out.println("method1-char argument");
	}
	
	
	//main
	public static void main(String[] args)
	{
		ParentClass x = new ParentClass();
		x.method1();
		
		x.method1(10);
		
		x.method1('9');
		
		
	}
}
