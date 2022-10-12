package abstractionconcept;

//incomplete class-can't create object of it.
public abstract class AbstractClass1 
{
	//ex.1 incomplete non-static method-possible
		public abstract void method1();
		
		
	//ex.2 complete non static method-possible 
		public void method2()
		{
		System.out.println("complete-non static");
		}
		
	//ex.3 incomplete static method-not possible
//		public abstract static void method3()
		
	//ex.4 complete static method-possible 
	    public static void method4()
	    {
	    	System.out.println("complete static");
	    }
	    
	    //main method
	    public static void main(String[] args) 
	    {
	//ex.1 non static incomplete method-->not possible
//	 AbstractClass1	x = new AbstractClass1();  -->not possible
	    	
	    	
	    	//method1 calling -->not possible
	    	
	 //ex.2 calling
//	 complete non static method-->not possible
	    	
	 //ex.3 calling
//	   	incomplete static method-->not possible
	    	
	 //ex.4 calling
//		complete static method--> possible
	    	method4();

	 
		}
		
		
	

}
