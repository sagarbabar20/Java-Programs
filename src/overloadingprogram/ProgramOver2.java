package overloadingprogram;

public class ProgramOver2 
{
	public static void addition()
	{
		//addition of 2 numbers
		int a=500;
		int b=1000;
		int c=a+b;
		System.out.println(c);
	}
//----------------------------------------------	
	//addition of 3 number
	public static void addition(int x)
	{
	int a=100;
	int b=200;
	int c=300;
	int d=a+b+c;
	System.out.println(d);
	}
//---------------------------------------------------	
	//addition of 3 numbers-->argument use
	public static void addition(int x,int y)
	{
		int a=x;
		int b=y;
		int c=a+b;
		System.out.println(c);
	}
//------------------------------------------------------	
//	Non static
	public void addition(int x, int y,int z)
	{
		int a=x;
		int b=y;
		int c=z;
		int d=a+b+c;
		System.out.println(d);
	}
//------------------------------------------------------
	public void addition(int x, char y)
	{
		int a=x;
		int b=y;
		int c=a+b;
		System.out.println(c);
	}
//--------------------------------------------------	
	//Return type
		public static int addition(char x,int y)
		{
			int a=20;
			int b=40;
			int c=a+b;
			System.out.println(c);
			return c;
		}
//----------------------------------------------------
	
		
	//main method 
	public static void main(String[] args) 
	{
		addition();
		
		
		addition(20);
		
		
		addition(20,40);
		
	
		//create object
		ProgramOver2 y = new ProgramOver2();
		y.addition(1,2,3);
		
		
		y.addition(30,'A');
		
	
		addition('S',60);
		int x=addition('S',60);
		System.out.println(100 + x);
		
	}
}
