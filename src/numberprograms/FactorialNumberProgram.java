package numberprograms;

public class FactorialNumberProgram 
{
	public static void main(String[] args)
	{
//		Ex.13 Java program for factorial of any number

		int a=5;              //5!=5*4*3*2*1
		int fact=1;
//		        1      2    4
		for(int i=1; i<=5; i++)    //fact=1,2,6,24,120
		{
//		          3
			fact=fact*i;  //1*1, 1*2, 2*3, 6*4, 24*5
		}
//		                          5
		System.out.println("factorial is-"+fact); 	


		
	}
}


