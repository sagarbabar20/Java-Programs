package oopsconcept;

public class ParentClass 
{
	int a=100;
	
	//method
	public void method1()
	{
		System.out.println("Parent Class-method1-non static");
	}
	
	
	//main
	public static void main(String[] args)
	{
		//normal way element calling
        ParentClass x = new ParentClass();
		System.out.println(x.a);
		
		x.method1();
	}

}
