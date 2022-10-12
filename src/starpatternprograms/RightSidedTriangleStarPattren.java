package starpatternprograms;

public class RightSidedTriangleStarPattren
{
public static void main(String[] args)
{
//	Ex.5 Right sided triangle star pattren
	  for(int i=1; i<=5; i++)
		{
		    // Space Print 
			for(int j=i; j<=5; j++)
			{
				System.out.print("  ");
		}
			//Star Print
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
//-------------------------------------------------------------------------
//	Ex.6
	
//	for(int i=1; i<=5; i++)
//	{
//	// Space Print 
//		for(int j=1; j<=i; j++)
//		{
//			System.out.print("  ");
//	}
//		//Flat Print
//		for(int k=i; k<=5; k++)
//		{
//			System.out.print("* ");
//		}
//	System.out.println();
//	}
//------------------------------------------------------------------------		
//Ex.7	
//	for(int i=1; i<=5; i++)
//		{
//			for(int j=i; j<=5; j++)
//			{
//				System.out.print("  ");
//		}
//			for(int k=1; k<=i; k++)
//			{
//				System.out.print("* ");
//			}
//		System.out.println();
//		}
//	for(int i=2; i<=5; i++)
//	{
//		for(int j=1; j<=i; j++)
//		{
//			System.out.print("  ");
//	}
//		for(int k=i; k<=5; k++)
//		{
//			System.out.print("* ");
//		}
//	System.out.println();
//	}

}
}
