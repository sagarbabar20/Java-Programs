package stringprogram;

public class NamePalindrome 
{
	public static void main(String[] args)
	{
		String a="nayan";
		String rev=" ";
		for(int i=0; i<a.length(); i++)
		{
			char c=a.charAt(i);
			rev=c+rev;
		}
		if(rev.equals(a))
		{
			System.out.println("palindrome"+rev);
		}
		else
		{
			System.out.println("not palindrome"+rev);

		}
			}
	
	

}
