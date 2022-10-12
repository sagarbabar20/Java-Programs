package castingconcept;

public class ImpClass implements Interface1
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
	
	
	public void method3()
	{
		System.out.println("method3-imp class");
	}
	
	public void method4()
	{
		System.out.println("method4-imp class");
	}
	
	
	//main method
	public static void main(String[] args) 
	{
		Interface1 x = new ImpClass();
		x.method1();
		x.method2();
		
//		x.method3();  //not possible
//		x.method4();  //not possible
		
		
		
		
		
		
	}

}
