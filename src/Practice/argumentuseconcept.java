package Practice;

public class argumentuseconcept
{
	//1.in method argument use
	public static void additon(int x,int y) 
	{
		int a=x;
		int b=y;
		int c=a+b;
		System.out.println(c);
		}
	
	//2.in method double argument use
	public static void addition1(double x,double y)
	{
		double a=x;
		double b=y;
		double c=a+b;
		System.out.println(c);

	}
	
	
	
//----------------------------------------------------------	
	//3.in constructor String argument use
	public argumentuseconcept(String x)
	{
		String a=x;
		System.out.println(a);
	}
	
	//4.in constructor char argument use
	public argumentuseconcept(char x)
	{
		char a=x;
		System.out.println(a);
	}
	
	//5.
	public static int method(int x,int y)
	{
		int a=x;
		int b=y;
		int c=a+b;
		System.out.println(c);
		return c;

	}


	
	
	//main method
	public static void main(String[] args) 
	{
		//1.
		additon(500,1000);
		
		//2.
		addition1(20,40);
		
		//3.
		argumentuseconcept x = new argumentuseconcept("Sagar");
		
		//4.
		argumentuseconcept y = new argumentuseconcept('S');

		//5.
		method(20,40);
		
		

		
	}

}
