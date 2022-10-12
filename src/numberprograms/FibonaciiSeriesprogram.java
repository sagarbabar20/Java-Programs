package numberprograms;

public class FibonaciiSeriesprogram 
{
	public static void main(String[] args)
	{
//		Ex.1 Java program for Fibonacci series upto 10 level.
		//0,1,1,2,3,5,8,13,21  1st value + latest value
		
//		int n1=0;
//		int n2=1;
//		int n3=0;     //sum 
////		                       1
//		System.out.print(n1+" "+n2);   //printing 0 and 1
///		         4   5     8
//		for(int i=2;i<10; i++)          // loop starts from 2
//		{
////			   2
//             n3=n1+n2;	   //0+1, 1+1, 1+2, 2+3, 3+5, 5+8, 8+13, 13+21
////                              3
//            System.out.print(" "+n3); //1,2,3,5,8,13,21,34
//			// 6
//            n1=n2; //1 1 2 3 5 8  13
//            // 7
//			n2=n3; //1 2 3 5 8 13 21
//		}

		
		int a=0;
		int b=1;
		int c;
		
		for(int i=1; i<=10; i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
