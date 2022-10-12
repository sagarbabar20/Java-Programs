package mainconcepts;

public class VariableProgram 
{
	// variable-->Blue color-->a,b-->Global variable
	// variable-->Brown color-->c,d,e-->Local variable
	
	
	// Non static method in variable 
	int a;   //declare-->class body
	
	// static method in variable
	static int b = 100;  //declare and initialize-->class body

    // constructor
	public VariableProgram()
	{
		a=100;
		b=500;
		int c=300;  //constructor body-->local
	}
	
	//method
	public void method1()
	{
		int d=100;  //method body-->local
//		c=400;      //not possible
	}
	
	
	//main
	public static void main(String[] args) 
	{
		int e=100;     //method body-->local
	}
}
