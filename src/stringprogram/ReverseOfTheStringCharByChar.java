package stringprogram;

public class ReverseOfTheStringCharByChar 
{
public static void main(String[] args) 
{
	//ex.1
//	String a="SAGAR";
//	String rev="";
//	for(int i=0; i<a.length(); i++)
//	{
//		char x=a.charAt(i);
//		rev = x+rev;
//	}
//	System.out.println(rev);
	
	
	//ex.2
	String b="7776067870";
	String rev="";
	
	for(int i=0; i<b.length(); i++)
	{
		char x=b.charAt(i);
		rev=x+rev;
	}
	System.out.println(rev);	
}
}
