package packageAB;

public class ClassA 
{
    //Static Variable
	public static int a = 500;
	
	
	//Static method
	public static void method1()
	{
		System.out.println("Static method-method1");
	}
	
	
	//Non static variable
	public int b = 1000;
	
	
	//Non static method
	public void method2()
	{
		System.out.println("Non Static method-method2");
	}

	
	//Mian method

    public static void main(String[] args) 
    {
    	// Call Static Variable
         System.out.println(a);
         
     	// Call Static method
         method1();
         
     	// Call Non Static Variable
        // create object
         ClassA x = new ClassA();
         System.out.println(x.b);
         
         // Call Non static method
         x.method2();
        		 
         

       

    	
	
}
}
