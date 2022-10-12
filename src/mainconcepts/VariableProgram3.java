package mainconcepts;

public class VariableProgram3
{
	//Global variable always declare in class body 
	int a = 100;  // global variable--> non static
	
	// Variables-->global variable--> with static
	static int b=500;
//----------------------------------------------------------	
	// Constructor
//local variable always declare in Constructor,method 
	public VariableProgram3()
	{
	// local variable declare in constructor 
		int c =200;
	//local variable declare in method 
		int d=300;

	}
//------------------------------------------------------------	
	
	//main 
	public static void main(String[] args) 
	{
		int e=1000;
		
		// Calling--> Non static variable
		//Create object
		VariableProgram3 x = new VariableProgram3();
		System.out.println(x.a);
		
		// Calling-->  static variable
         System.out.println(b);
         
         System.out.println(e);
		
	}		
}
