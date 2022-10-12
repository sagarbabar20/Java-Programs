package interfaceconcept;

public class ImpClass implements NormalInterface

{

	@Override
	public void method1()
	{
System.out.println("method1-interface-completeness provide");
	}

	@Override
	public void method2() 
	{
System.out.println("method2-interface-completeness provide");
}
	
	
	//main method
	public static void main(String[] args) 
	{
		ImpClass x = new ImpClass()	;
		x.method1();
		
		x.method2();
	}

}
