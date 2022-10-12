package mainconcepts;

public class VariableProgram1 
{
	static int a=10;        //Global variable

	int b=20;               //Global variable--non static
	
    int c;        //Global variable--non static
    double d;     //Global variable--non static
    float e;      //Global variable--non static
    byte f;       //Global variable--non static
    long g;
    short h;
    boolean i;
    char j;
    
    //main method
    public static void main(String[] args)
    {
    	//static calling
		System.out.println(a);
		//or
		System.out.println(VariableProgram1.a);
		
//		System.out.println(b);  /not possible
//		System.out.println(VariableProgram1.b);  //not possible
	
		//create object
		VariableProgram1 x = new VariableProgram1();
		System.out.println(x.b);
		
		System.out.println(x.c);
		System.out.println(x.d);
		System.out.println(x.e);
		System.out.println(x.f);
		System.out.println(x.g);
		System.out.println(x.h);
		System.out.println(x.i);
		System.out.println(x.j);
		
		
    
    }

    
    
}
