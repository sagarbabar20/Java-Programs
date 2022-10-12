package abstractionconcept;

public class ConcreteClass1 extends AbstractClass1
{
	public void method1()
	{
System.out.println("incomplete to complete-non static method");
	}
	
//	main method
	public static void main(String[] args) 
	{
   ConcreteClass1 x = new ConcreteClass1();
   // override concept-->parent method ignore
   // child method-->calling 
   x.method1();
   
   
   //complete non static method from abstract class
   x.method2();
   
   
   //static complete
   AbstractClass1.method4();
	}

}
