package mainconcepts;

public class ConstructorProgram4 
{
	int a;
	// Constructor without Argument
	public ConstructorProgram4()
	{
		a = 10;
	}
//------------------------------------------------------------		
	 	// Constructor with Argument
	public ConstructorProgram4(int b)
	{
// its not always necessary to initialize the variable here.
	}
//------------------------------------------------------------	
       //Non Static 
		public void method1()
		{
			System.out.println("Non static method");
		}
//------------------------------------------------------------		
      //main method 
  public static void main(String[] args)
  {
      // object create
	  ConstructorProgram4 x = new ConstructorProgram4();
	  x.method1();

	
	  ConstructorProgram4 y = new ConstructorProgram4();
         x.method1();
  }
}

