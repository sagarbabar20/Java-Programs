package mainconcepts;

public class ClassProgram
{
	//static 
	static int a=500;
	//static-->life-->class start-->class end
	//Ex. train-->already ticket booked 
	//nagpur-->mumbai
	//start-->end
	
	
	//non static
	int b=1000;
	//non static-->life-->no memory allocated
	
	
	//main method
	public static void main(String[] args) 
	{
		ClassProgram x = new ClassProgram();
		//non static--> memory allocate
		//train waiting ticket 
		
		//memory allocate
		System.out.println(x.b);
		//memory remove
	}
	
//program write /check-->program compilation
//program execute/run-->program execution	
	

}
