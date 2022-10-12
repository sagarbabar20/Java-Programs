package arrayconceptprogram;

public class OddElementPresentInArray 
{
	public static void main(String[] args)
	{
//Ex.1 Java Program to print the odd element of an array present.
	int a[]= {1,2,3,4,5,6,7,8,9,10};
				
	 for(int i=0; i<=(a.length-1); i++)
{
		if(a[i]%2!=0)
	{
		System.out.println(a[i]+"-is odd number");
		}			

	}
	}
}

