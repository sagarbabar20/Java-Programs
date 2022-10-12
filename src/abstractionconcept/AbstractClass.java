
package abstractionconcept;

public abstract class AbstractClass 
{
//	ex.1 normal method-->we can write
	public void method1()
	{
		System.out.println("normal method1");
	}
	
	//ex.2 incomplete method-->we can write
	public abstract void method2();
	
	//abstract method-->in abstract class only
	//not in normal class
	
	
	//main method
	public static void main(String[] args) 
	{
		//not possible 
//		AbstractClass x = new AbstractClass();
		//we can create the object of abstract class.
		
	}

}
