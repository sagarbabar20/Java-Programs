package packageCD;

import packageAB.ClassA;

public class ClassC 
{
	public static void main(String[] args)
	{
		//call static method from packageAB and classA
         System.out.println(ClassA.a);
		
		//call static method from packageAB and classA
	     ClassA.method1();
	        
	    //call non static variable from packageAB and classA
	    //create object with ClassA name
	     ClassA x = new ClassA();
	     System.out.println(x.b);
	        
	    //call non static method from packageAB and classA
	     x.method2();
	    
	}
}
