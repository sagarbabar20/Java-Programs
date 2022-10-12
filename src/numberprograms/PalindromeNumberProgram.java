package numberprograms;

public class PalindromeNumberProgram 
{
	public static void main(String[] args)
	{
//		Ex.2 Palindrome number
		
		int num=151;
		int i=num;
		int rev=0;
		
		while(i!=0)
		{
		    rev=(rev*10)+i%10;
			i=i/10;
		}
		if(num==rev)
		{
			System.out.println(num +"-is palindrome number");
		}
		else
		{
		System.out.println(num +"-is not a palindrome number");

		}

		
	}

}
