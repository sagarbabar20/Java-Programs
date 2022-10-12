package Practice;

public class Factorial 
{
	public static void main(String[] args) 
	{
//		int a=7;
//		int fact=1;
//		for(int i=1; i<=a; i++)
//		{
//			fact=fact*i;
//		}
//		System.out.println("factorial is-"+fact);
//------------------------------------------------------------
//	int	n=153;
//	int i=n;
//	int arm=0;
//	int rem;
//	while(n!=0)
//	{
//		rem=i%10;
//		arm=arm+(rem*rem*rem);
//				i=i/10;
//	}
//	if(arm==n)
//	{
//		System.out.println("no is armstrong is-"+arm);
//	}
//	else
//	{
//		System.out.println("no is not armstrong is-"+arm);
//	}
//	
//----------------------------------------------------
	int a=1002;
	int i=a;
	int rev=0;
	int rem=0;
	
	while(i!=0)
	{
		rem=i%10;
		rev=rev*10+rem;
		i=i/10;
		
	}
	System.out.println(rev);
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
