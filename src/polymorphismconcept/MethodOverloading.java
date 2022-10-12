package polymorphismconcept;

public class MethodOverloading 
{
	//1.method
	public void method1()
	{
		System.out.println("method1-zero argument");
	}
	
	//2.method
	public void method1(int x)
	{
		System.out.println("method-int argument");
	}
	
	//main method
	public static void main(String[] args) 
	{
		MethodOverloading x=new MethodOverloading();
		x.method1();
		
		x.method1(20);
		
	}

}
