package stringprogram;

public class TotalNoOfVowels 
{
//JAVA PROGRAM TO COUNT THE TOTAL NUMBER OF VOWELS(A,E,I,O,U)
//AND CONSONANTS IN A STRING.
	public static void main(String[] args)
	{
		String name ="This is a really simple sentence";
		int vowels =0;
		int conso = 0;
		for(int i=0; i<name.length(); i++)
		{
			char z= name.charAt(i);
		
		if((z=='a')||(z=='e')||(z=='i')||(z=='0')||(z=='u'))
		{
			vowels++;	
		}
			else 
		{
			 conso++;
		}
		}
		System.out.println("no of vowels "+vowels);
		System.out.println("no of conso "+conso);
			}
	}

