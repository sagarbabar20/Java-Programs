package arrayconceptprogram;

public class Negativesizepassinarray 
{
	public static void main(String[] args) 
	{
		int a [] = new int [-5];
		
		for (int i = 0; i < a.length; ++i) 
		{

		System.out.println(a[i]);
	}
	}
}

//Q.Can we declare array size as a negative number?

//-->No,can’t pass the negative integer as an array size. 
//If you pass array size as negative,
//there will be no compile time error. 
//But there will be run time NegativeArraySizeException.

