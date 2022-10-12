package loopingstatement;

public class NestedForLoop
{
	public static void main(String[] args)
	{
//		for(int i=1; i<=5; i++)
//		{
//			System.out.println("Soceity-"+ i);
//		    for (int j=1; j<=5; j++)
//		{
//	    	System.out.println("Flat-"+j);
//	}
//	    	
//
//		}
//	}
//------------------------------------------------------------------
//	ex.2
//	for (int i=1; i<=3; i++)    // for 3 weeks
//	{
//		System.out.println("Weeks-"+i);
//		for(int j=1; j<=7; j++)          // for day
//		{
//			System.out.println("Day-"+j);
//		}
	
//--------------------------------------------------------------------
	//	Ex.3
//     for(int i=1; i<=3 ; i++)
//     {
//    	 System.out.println("Team-"+i);
//    	 for(int j=1; j<=11; j++)
//    	 {
//    		 System.out.println("Player-"+j);
//    	 }
//--------------------------------------------------------------------------    	 
		//Ex.4   
		         //1  //2  //8
//		for(int i=1; i<=5; i++)
//		{
		            //3   //4   //6
//			for(int j=1; j<=5; j++)
//			{
		                          //5
//				System.out.print("P ");
//				
//			}
		              //7
//			System.out.println();
//	}
//-------------------------------------------------------------------------------		
//		Ex.5 Star Pattren Program
		
//		for(int i=1; i<=5; i++)   //Row Condition
//		{
//			for(int j=1; j<=5; j++) //Cell Condition
//			{
//		System.out.print(" *");
//       }
//	    System.out.println();
//   }
//---------------------------------------------------------------------------------		
//	Ex.6 Flats as Per Society Condition
		for(int i=1; i<=5; i++)
		{
			System.out.println("Society"+i);
			for(int j=1; j<=i; j++)
			{
				System.out.println("Flat"+j);
			}
		}
	}
}
