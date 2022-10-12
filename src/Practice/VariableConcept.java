package Practice;

public class VariableConcept 
{
	//global variable with static method
	static int a=200;
	
	static byte b=40;
	
	static long c=500;
	
	static String e = "Sagar";
	
	int f=5000;  	//global variable with npn static method

    int i;
    
    boolean j;
    
    double k;
	

	public static void main(String[] args)
	{
		//local variable
		int a=100;
		
		String b="SAGAR";
		
		float c=200;
		
		char d='S';
		
		
		
		
		
		
		//global variable
		System.out.println(a);
		
		System.out.println(b);
		
		System.out.println(c);
		
		System.out.println(e);
		
		VariableConcept x = new VariableConcept();
		System.out.println(x.f);
		
		System.out.println("i-"+ x.i); //default value print
		
		System.out.println("j-" + x.j);
		
		System.out.println("k-"+ x.k);
		
		
		//local variable
		System.out.println(a);
		
		System.out.println(b);
		
		System.out.println(c);
		
		System.out.println(d);
		
		
		
		
	}
}
