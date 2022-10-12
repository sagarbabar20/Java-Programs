package interfaceconcept;

public interface DefaultInterface 
{
	//ex.1 complete method-not possible
//	public void method1()
//	{
//		System.out.println("method1-default interface");
//	}
	
	
//	default method-complete methods in interface
//	possible now 
//	with default keyword
	public default void method2()
	{
		System.out.println("complete-method-interface");
	}
	
	//main 
	public static void main(String[] args) 
	{
		//not possible
	
//		method1();
//		DefaultInterface.method1();
		
//		DefaultInterface x = new DefaultInterface();
//		x.method2();
		
	}

}
