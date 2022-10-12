package overloadingprogram;

public class ConstructorOverloading
{
	int a;
	int b;
	
	//1.Constructor
	public ConstructorOverloading()
	{
		a=10;
		b=20;
		System.out.println(a+b);
		}
	
	//2.Constructor--> int argument
	public ConstructorOverloading(int x) 
	{
	    a=100;
	    b=200;
	    System.out.println(a+b);
	}

	
	//3.Constructor--> int int argument
	public ConstructorOverloading(int x, int y)
	{
		a=1000;
		b=2000;
		System.out.println(a+b);
	}
	
	//4.Constructor--> int char string argument
	public ConstructorOverloading(char x,char y)
	{
	    a=x;
	    b=y;
	    System.out.println(a+b);
	}
	
	
	
	//main method
	public static void main(String[] args)
	{
	//1.
	ConstructorOverloading x = new ConstructorOverloading();
	
	//2.
	ConstructorOverloading y = new ConstructorOverloading(1);
	
	//3.
	ConstructorOverloading z = new ConstructorOverloading(1,2);
	
	//4.
	ConstructorOverloading b = new ConstructorOverloading('A','S');

    

	}


}
