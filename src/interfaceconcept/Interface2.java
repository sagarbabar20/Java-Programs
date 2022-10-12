package interfaceconcept;

public interface Interface2 
{
  //ex.1 incomplete possible 
	void method1();
	
	
  //ex.2 complete static method
	public static void method2()
	{
		System.out.println("complete static method");
	}
	
	
	//main method
	public static void main(String[] args) 
	{
   //ex.1 calling incomplete possible 
//   Interface2 x=new Interface2();  //not possible
//		      x.method1();
		      
   //ex.2 calling complete static method
		      method2();
		      Interface2.method2();

		
		
		
	}
}
