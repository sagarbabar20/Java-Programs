package numberprograms;

public class GcdNumberProgram 
{
	public static void main(String[] args) 
	{
//		Ex.4 Java program to find GCD of two number.
//		It is the highest no that completely divides two or more no,
		int n1=6;
		int n2=8;
		int gcd=1;
//		         1       2            5
		for(int i=1; i<=n1 && i<=n2; i++) //1 2 3 4 5 6 7
		{
//			           3
			if(n1%i==0 && n2%i==0) //6%1=0 6%2=0 6%3=0 6%4=2 6%5=1 6%6=0 
//				   4               //8%1=0 8%2=0 8%3=2 8%4=0 8%5=3 8%6=2
				gcd=i; //1,2
		}
//		                                6
		System.out.println("gcd of n1 and n2 is "+ gcd);

//-----------------------------------------------------------------
//		int n1=12;
//		int n2=42;
//		while (n1!=n2) 
//		{
//			if(n1>n2)  
//				n1=n1-n2; 
//		else
//			
//		n2=n2-n1;  //4
//		}
//		System.out.println("GCD of n1 and n2 is "+n2);  
		
		
		
	}

}
