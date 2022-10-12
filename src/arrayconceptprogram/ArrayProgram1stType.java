package arrayconceptprogram;

public class ArrayProgram1stType 
{
	public static void main(String[] args) 
	{
//		Array Concept
		
//		
//		int a[]= {20,40,60,80,100}; 
//		  System.out.println(a[0]);
//		  System.out.println(a[1]); 
//		  System.out.println(a[2]);
//		  System.out.println(a[3]);
//		  System.out.println(a[4]);
//				
//		System.out.println(a[5]);    //no element
		
//-----------------------------------------------------------		
		//for Loop
		//we are printing the array value on the basis of index
		
//		for(int i=0; i<=4; i++)
//		{
//			System.out.println(a[i]);  //0,1,2,3,4
//		}

//------------------------------------------------------------		
		//lentgh of array
		
//		int a[]= {20,40,60,80,100};
//		       //  0  1  2  3  4
//		
//		//length=total elements=5
//		System.out.println("length of array is-"+a.length);
//---------------------------------------------------------------		
		//end index=4--> total elements - 1
//		             -->   length-1
//		             -->  a.length-1
//		int a[]= {20,40,60,80,100};
//		 
//		for(int i=0; i<=(a.length-1); i++)
//		{
//			System.out.println(a[i]);
//		}
//----------------------------------------------------------		
		int a[]= {20,40,60,80,100};
//		
		int x=a.length;
		System.out.println("Value of x- "+a.length);
		
		for(int i=0; i<=x-1; i++)
		{
			System.out.println(a[i]);
		}
		



		
	}

}
