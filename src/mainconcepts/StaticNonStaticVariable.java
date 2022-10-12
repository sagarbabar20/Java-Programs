package mainconcepts;

public class StaticNonStaticVariable 
{
//	int a=100;  //variable declare and initialized
//	static int b;
//------------------------------------------------------	
	
	// Non Static method
	int a=500;
//------------------------------------------------------
	//Static method
	static int b = 2000;
	

	//main method
	public static void main(String[] args) 
	{
//		b=500;     //global 
//		int b=300; //local
//------------------------------------------------------		
		//Case-1
		//Calling static method
		//create object
StaticNonStaticVariable x = new StaticNonStaticVariable();
		System.out.println(x.a);
		
		x.a=200;
		System.out.println(x.a + 100);
		
		//case-2
StaticNonStaticVariable y = new StaticNonStaticVariable();
       System.out.println(y.a);
       
       y.a=1000;
       System.out.println(y.a + 500);
//-------------------------------------------------------
       //calling Static method 
       System.out.println(b);
       
       b=500;
       System.out.println(b + 200);
       
		
		
		
		
			
	
	}
}
