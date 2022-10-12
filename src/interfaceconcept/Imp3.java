package interfaceconcept;

public class Imp3 implements Interface4
{

	@Override
	public void method1() 
	{
		System.out.println("method1");
	}

	@Override
	public void method2() 
	{
		System.out.println("method2");
	}

	//main 
	public static void main(String[] args)
	{
		Imp3 x = new Imp3();
		
		x.method1();
		
		x.method2();
	}
}
