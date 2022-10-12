package Practice;

public class ConstructorConcept
{
	int a;
	int b;
	int c;
	
	public ConstructorConcept()
	{
//		System.out.println("Sagar");
		
		a=500;
		b=1000;
		c=a+b;
		System.out.println(c);
	}
	
	//with argument constructor
	public ConstructorConcept(int x)
	{
		System.out.println("with argument constructor");
	}

	
	//main method
	public static void main(String[] args)
	{
		ConstructorConcept x = new ConstructorConcept();
		
		ConstructorConcept y = new ConstructorConcept(5);

		
	}
}
