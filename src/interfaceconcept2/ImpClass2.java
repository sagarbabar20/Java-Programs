package interfaceconcept2;

public class ImpClass2 implements Interface1
 {

	@Override
	public void method1()
	{
		System.out.println("method1-interface1");
	}

	@Override
	public void method2() 
	{
		System.out.println("method2-interface1");
	}
	
	
	
	public static void main(String[] args) 
	{
		ImpClass2 x=new ImpClass2();
		x.method1();
		x.method2();
	}

}
