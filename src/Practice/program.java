package Practice;

public class program 
{
	public static void main(String[] args) 
	{
//		int n=151;
//		int a=n;
//		int arm=0;
//		int rem=0;
//		int rev=0;
//		while(n!=0)
//		{
//			rev=a%10;
//			arm=arm+rem*rem*rem;
//			a=a/10;
//			}
//		if(n==arm)
//		{
//			System.out.println("no is armstong"+arm);
//		}
//		else
//		{
//			System.out.println("no is not armstong"+arm);
//       }
		
//		int a[]= {1,2,3,4,5};
//		int max=a[0];
//		for(int i=0; i<a.length; i++)
//		{
//			if(max<a[i])
//				
//				max=a[i];
//		}
//		System.out.println("Maximum element is - " + max);
//		
		
//		int a[]= {1,2,3,4,5};
//		for(int i=a.length-1; i>=0; i--)
//		{
//			System.out.println(a[i]+" ");
//		}	
		
		int a[]= {2,5,6,1,4};
		int x=0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					x=a[i];
				a[i]=a[j];
				a[j]=x;
				}
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Elements of array ascending order is-"+a[i]+" ");
		}
		
	}

}
