package interfaceconcept;

public class impClass1 implements InterfaceClass0,InterfaceClass1
{

	
	public void method1() 
	{
		System.out.println("method1-interface class0");
	}

	
	public void method2() 
	{
		System.out.println("method2-interface class1");
	}

	//main
	public static void main(String[] args) 
	{
		impClass1 x=new impClass1();
		x.method1();
		x.method2();
	}
}
