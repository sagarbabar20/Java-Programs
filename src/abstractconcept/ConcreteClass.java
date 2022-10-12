package abstractconcept;

public class ConcreteClass extends AbstractClass
{

	@Override
	public void method1() 
	{
		System.out.println("method1-complete ");
	}

	//main method
	public static void main(String[] args) 
	{
		ConcreteClass x= new ConcreteClass();
		x.method1();
		
//		AbstractClass.method2();
		method2();
		
		
	}
	

}
