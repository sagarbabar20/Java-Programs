package Practice;

public class PattrenProgram 
{
	public static void main(String[] args) 
	{
//		for(int i=1; i<=5; i++)
//		{
//			for (int j=2; j<=i; j++)
//			{
//				System.out.print("  ");
//			}
//			for(int k=5; k>=i; k--)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//	------------------------------------------------------
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int l=2; l<=i; l++)
			{
			System.out.print("*");
		}
			System.out.println();
			}
		
//-----------------------------------------------------------
		for(int a=1; a<=5; a++)
		{
			for(int b=2; b<=a; b++)
			{
				System.out.print(" ");
			}
			for(int c=5; c>=a; c--)
			{
				System.out.print("*");
			}
			for(int d=4; d>=a; d--)
			{
			System.out.print("*");
		}
			System.out.println();
	}
	}
}
		


