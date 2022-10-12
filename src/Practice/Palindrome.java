package Practice;

public class Palindrome
{
public static void main(String[] args)
{
	int a=151;
	int pal=a;
	int rev=0;
	int rem=0;
	
	while(pal!=0)
	{
		rem=pal%10;  
		rev=rev*10+rem;
		pal=pal/10;

	}
	if(rev==a)
	{
		System.out.println("the no is palindrome is-"+a);
	}
	else
	{
		System.out.println("the no is not palindrome is-"+a);

	}
	
}
}
