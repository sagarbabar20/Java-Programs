package arrayconceptprogram;

public class ReverseArray
{
	public static void main(String[] args) 
	{
//		EX.
		int a[]= {1,2,3,4,5};  // Element
//                0 1 2 3 4    // Index
		
	   System.out.println("the reverse array is-");
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+ " ");
		}
	}
}

	


