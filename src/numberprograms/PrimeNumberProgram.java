package numberprograms;

public class PrimeNumberProgram 
{
	public static void main(String[] args)
	{
//		Ex.15 Java program to display prime numbers 
//		Prime Number is a number that is greater than 1 and
//		divided by 1 or itself only.
//		ex.2,3,5,7,11,13,17...
		int num=5;
		int a=0;
//		         1      2       4
		for(int i=2; i<=num-1; i++)     //
		{
//			      3
			if(num%i==0)  // 7%2=1 7%3=1 7%4=3 7%5=2 7%6=1  7%7=0
			{
//				  
				a++;     //Increment--> 1st if condition is true only
			}
		}
//		         5
             if(a==0)
        {
//            	                         6
            System.out.println(num + " number is prime");
         }
        else
        {
       	    System.out.println(num + " number is not prime");
        }
//----------------------------------------------------------------
//    Ex. Java program to display prime numbers 1 to 100

//    	for(int i=1; i<=10; i++)   //this condition use for Number 
//    {
//    		int a=0;
//
//    for(int j=2; j<=i-1; j++) //this condition use for no is prime or not
//     {
//    		
//    		if(i%j==0)
//    		{
//    	    	a++;
//    					}
//    				}
//    				if(a==0)
//    				{
//    					System.out.print(" "+i);
//    				}	
//    			}
           }
       }


