package abstractionconcept;

public class ConcreteClass3 extends ConcreteClass2
{

	@Override
	public void method2() 
	{
		System.out.println("method2-Concrete Class3");
	}

	public static void main(String[] args) 
	{
		ConcreteClass3 x = new ConcreteClass3();
		x.method1();
		x.method2();
	}
	
}
