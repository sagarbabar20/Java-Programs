package starpatternprograms;

public class Leftsidestarpattren
{
     public static void main(String[] args) 
    {
    	       //1    2     12
		for(int i=1; i<=5; i++)  //Rows
			{
			// Space Print
			        //   3    4     6
				for(int j=4; j>=i; j--)  
				{
					              //  5
					System.out.print("  ");
			}          
//				        7     8    10
				for(int h=1; h<=i; h++)
				{
//					                 9
					System.out.print("* ");
				}
//				              11
			System.out.println();
			}
//-------------------------------------------------------------------------
	       //1    2     12
//		for(int i=5; i>=1; i--)  //Rows
//			{
//			// Space Print
//			        //   3    4     6
//				for(int j=4; j>=i; j--)  
//				{
//					              //  5
//					System.out.print("  ");
//			}          
////				        7     8    10
//				for(int h=1; h<=i; h++)
//				{
////					                 9
//					System.out.print("* ");
//				}
////				              11
//			System.out.println();
//			}

}
}
