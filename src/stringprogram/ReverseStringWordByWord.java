package stringprogram;

public class ReverseStringWordByWord 
{
	public static void main(String[] args) 
	{
		String str = "SAGAR BABAR";
		String strl="";
		String a[]= str.split(" ");
		for(int i=a.length-1; i>=0; i--)
		{
			strl=strl+a[i]+" ";
		}
		System.out.println(strl);
	}
}
