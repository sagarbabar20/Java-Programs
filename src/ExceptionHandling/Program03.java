package ExceptionHandling;

public class Program03 
{
	public static void main(String[] args) 
	{
		//run time
		//unchecked expection
		
		int a = 10;
		int b = 0;
		
		try
		{
			int c = a/b;		 //infinity
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("dont divide 10 by zero");
			System.out.println("change the value of b var");
		}
		
		finally
		{
			//independent code
			System.out.println("hello");
			System.out.println("hello");
			System.out.println("hello");
		}
		
		//the finally block code should run
		//irrespctive of the exception come or not
		
	}

}


