package numberprograms;

public class LcmNumberProgram
{
	public static void main(String[] args) 
	{
//		Ex.4 Java program to find LCM of two number.
		
		int n1=2;
		int n2=8;
		int gcd=1;
		int Lcm;
		for( int i=1; i<=n1; i++)
		{
			if(n1%i==0 && n2%i==0)
				gcd=i;
		}
		 Lcm=(n1*n2)/gcd;
		System.out.println("LCM is-"+Lcm);

		
	}

}
