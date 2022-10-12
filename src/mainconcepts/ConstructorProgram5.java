package mainconcepts;

public class ConstructorProgram5 
{
    //non static 
	public void method1()
	{
		System.out.println("non static method");
	}


       //main method
	public static void main(String[] args)
	{
		//create object        //system defined constructor
 ConstructorProgram5 x = new ConstructorProgram5();
                     x.method1();
		
	}


}
