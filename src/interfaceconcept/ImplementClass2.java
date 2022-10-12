package interfaceconcept;

public class ImplementClass2 implements Interface2
{

	@Override
	public void method1() 
	{
	System.out.println("method1-incomplete-complete in imp class");
	}

	//main method
	public static void main(String[] args) 
	{
	ImplementClass2 x=new ImplementClass2();
	x.method1();
	
	//interface-static-complete
	Interface2.method2();
	}
}
