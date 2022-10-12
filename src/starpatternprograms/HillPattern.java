package starpatternprograms;

public class HillPattern 
{
	public static void main(String[] args)
	{	
////		Ex.1
//		         1     2    12
		for(int i=1; i<=5; i++)
		{
//			         3    4    6
			for(int j=5; j>i; j--)
			{
//				             5
			System.out.print(" ");
			}
//			         7        8        10
			for(int k=1; k<=(2*i-1); k++)
			{
//				                  9
				System.out.print("*");
			
		}
//			                  11
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
//---------------------------------------------------------------------	
//	    Ex.13
//		for(int i=5; i>=1; i--)
//		{
//			for(int j=5; j>i; j--)
//			{
//			System.out.print(" ");
//			}
//			for(int k=1; k<=(2*i-1); k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//---------------------------------------------------------------------		
//	    Ex.14
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=5; j>i; j--)
//			{
//			System.out.print(" ");
//			}
//			for(int h=1; h<=(2*i-1); h++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=4; i>=1; i--)
//		{
//			for(int j=5; j>i; j--)
//			{
//			System.out.print(" ");
//			}
//			for(int h=1; h<=(2*i-1); h++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}


}


		
			
	}



