package interfaceconcept;

public interface NormalInterface 
{
//ex.1 complete method-->not possible 
//	public void method1()
//	{
//		System.out.println("method1-hello");
//	}
	
	
	//ex.2 incomplete methods
	//abstract keyword
	public abstract void method1();
	
	//public-->Access modifier
	//incomplete-->abstract
	//not necessary
	
	
	//by nature-->public,abstract
	void method2();
	
	//main method
	public static void main(String[] args) 
	{
	//call method1 and method2 like static 
//		method1();    //not possible
//		method2();    //not possible
		
		//call like non static 
		//not possible
//		NormalInterface x = new NormalInterface();
		
	}
}
