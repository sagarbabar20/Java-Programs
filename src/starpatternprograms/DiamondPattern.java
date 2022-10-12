package starpatternprograms;

public class DiamondPattern
{
public static void main(String[] args)
{
////Ex.Diamond Pattern

   for(int i=1; i<=5; i++)    //Rows
{
	for(int j=i; j<=5; j++)  //Spaces
	{
	System.out.print(" ");
	}
	for(int k=1; k<=i; k++)
	{
		System.out.print("* ");   //Star print
	}
	System.out.println();
}
//--------------------------------------------------------
//Ex.
//for(int i=1; i<=5; i++)    //Rows
//{
//	for(int j=1; j<=i; j++)  //Spaces
//	{
//	System.out.print(" ");
//	}
//	for(int k=i; k<=5; k++)
//	{
//		System.out.print("* ");   //Star print
//	}
//	System.out.println();
//}
//-----------------------------------------------------------------		
//Ex.
//for(int i=1; i<=5; i++)    //Rows
//	{
//		for(int j=i; j<=5; j++)  //Spaces
//		{
//		System.out.print(" ");
//		}
//		for(int h=1; h<=i; h++)
//		{
//			System.out.print("* ");   //Star print
//		}
//		System.out.println();
//	}
//	for(int i=2; i<=5; i++)    //Rows
//	{
//		for(int j=1; j<=i; j++)  //Spaces
//		{
//		System.out.print(" ");
//		}
//		for(int h=i; h<=5; h++)
//		{
//			System.out.print("* ");   //Star print
//		}
//		System.out.println();
//	}
   
//--------------------------------------------------------
//	Ex.11
	for(int i=1; i<=5; i++)    //Rows
	{
		for(int j=1; j<=i; j++)  //Spaces
		{
		System.out.print(" ");
		}
		for(int h=i; h<=5; h++)
		{
			System.out.print("* ");   //Star print
		}
		System.out.println();
	}
	for(int i=1; i<=5; i++)    //Rows
		{
			for(int j=i; j<=5; j++)  //Spaces
			{
			System.out.print(" ");
			}
			for(int h=1; h<=i; h++)
			{
				System.out.print("* ");   //Star print
			}
			System.out.println();
		}


}
}
