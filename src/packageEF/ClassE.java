package packageEF;

import packageAB.ClassA;

public class ClassE 
  //Use private access modifier
{
	   //Static Variable
	private static int a =100;
		
		
		//Static method
	private static void method1()
		{
			System.out.println("Static method-method1");
		}
		
		
		//Non static variable
	private int b = 200;
		
		
		//Non static method
	private void method2()
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
	         ClassE x = new ClassE();
	         System.out.println(x.b);
	         
	         // Call Non static method
	         x.method2();

	    }
}
