package arrayconceptprogram;

public class ArrayProgram2ndType
{
	// First Type
	public static void main(String[] args) 
	{
//		int a[]= {20,40,60,80,100,};
//		
//		System.out.println("length is-"+a.length);
//		
//			for(int i=0; i<=a.length-1; i++)
//			{
//				System.out.println(a[i]);
//				}
//------------------------------------------------------------------------
			// Second Type--->Syntax-2

		int x[]=new int[5];  //size=5-->5 elements
		
		x[0]=20;
		x[1]=40;
		x[2]=60;
		x[3]=80;
		x[4]=100;
		
		System.out.println("length is-"+x.length);
		
		for(int i=0; i<=(x.length-1);i++)
		{
			System.out.println(x[i]);
		}
		
	
	}
		
		
	}


