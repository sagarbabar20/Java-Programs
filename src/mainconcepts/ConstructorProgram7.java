package mainconcepts;

public class ConstructorProgram7 
{
	// non static method
	public void method1()
	{
		System.out.println("non static method");
	}
	
	//Constructor method
	public ConstructorProgram7()
	{
		System.out.println("This Constructor method");
	}

	
	//main method
	public static void main(String[] args) 
	{
		// Case-1
		//object create
ConstructorProgram7 x = new ConstructorProgram7();
          //method call-->multiple time
                    x.method1();
                    x.method1();
                    x.method1();
                    x.method1();
                    x.method1();
                    x.method1();
                    x.method1();
		
//--------------------------------------------------
		// Case-2
		//multiple constructor-multiple object
		// multiple time calling method
//  ConstructorProgram7 x = new ConstructorProgram7();
//                      x.method1();
//                      
//  ConstructorProgram7 y = new ConstructorProgram7();
//                      y.method1();
//                      
//  ConstructorProgram7 z = new ConstructorProgram7();
//                      y.method1();
//    
//  ConstructorProgram7 Sagar = new ConstructorProgram7();
//                      Sagar.method1();
		                	
	}
}
