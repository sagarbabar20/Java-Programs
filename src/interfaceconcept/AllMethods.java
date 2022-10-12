package interfaceconcept;

public interface AllMethods
{
	//ex.1 complete method 
	
//	public void method1()      //not possible
//	{
//		System.out.println("complete method");
//	}
	
	
	//ex.2 incomplete method
	void method2();               //possible
	
	
	//ex.3 non static complete
//	public void method3()        //not possible
//	{
//		System.out.println("non static complete");
//	}

	
	//ex.4 complete static method
	public static void method4()    //possible
	{
		System.out.println("complete static method");
	}
	
	//ex.5 incomplete static method
//	public static void method5();    ////not possible


//main method
public static void main(String[] args)
{
//	ex.1 calling
//	method1();      //not possible 
	
	//ex.2 calling
//	AllMethods x = new AllMethods();
//	x.method2();                     //not possible
	
	//ex.3 not possible
	
	//ex.4
	method4();
//	or
	AllMethods.method4();
	
	//ex.5 not possible
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}