package mainconcepts;

public class ConstructorProgram6 
{
	//non static method
	public void method1()
	{
		System.out.println("this is the non static method");
	}
	
	// Constructor method--->user defined method
//	public ConstructorProgram6()
//	{
//		System.out.println("Hi this is constructor and i am present here");
//	}
	
	
	//main method
	public static void main(String[] args) 
	{
		//create object
		//call constructor-->create object
		ConstructorProgram6 x = new ConstructorProgram6();
        
		//call non static method
		x.method1();
		
		
		// Case-1
		// if-user defined constructor-present
		// then-system defined constructor-absent
		
		
		//Case-2
		//if-user defined constructor-absent
		//then-system defined constructor-present
	}
		

}
