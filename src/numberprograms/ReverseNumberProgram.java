package numberprograms;

public class ReverseNumberProgram
{
	public static void main(String[] args) 
	{
//		Ex.9 Write the program reverse number
		int num=5432;
		int rem=0;
		int rev=0;    //Assume That
		   //1     
   while(num!=0)    //5432!=0  543!=0  54!=0 5!=0   0!=0  upto run 0!=0
{
	    //2
    rev=(rev*10)+num%10;  //(0*10)+5432%10=2  2*10+(543%10)=23  23*10+(54%10)=234  234*10+(5%10)=2345
	 //      3
		num=num/10;   // 5432/10=543 543/10=54  54/10=5  5/10=0
		}
		              //4    
		System.out.println("Reverse no is -"+rev);

		
	}

}
