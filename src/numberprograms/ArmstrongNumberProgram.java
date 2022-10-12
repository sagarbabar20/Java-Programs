package numberprograms;

public class ArmstrongNumberProgram
{
	public static void main(String[] args)
	{
//		Ex.4 Java program to find Armstrong number.

 int num=153;
 int i=num; 
 int rem;
 int arm=0;
	// 1    
  while(i!=0)  //153!=0   15!=0     1!=0   0!=0
{
	  // 2
 rem = i%10; //153%10=3  15%10=5 1%10=1
            // 3
 arm = arm + rem*rem*rem;  //0+3*3*3=27  27+5*5*5=152  152+1*1*1=153
      // 4
   i = i/10;  //153/10=15  15/10=1  1/10=0  upto divide quotient is zero
 }
  // 5
  if(arm==num)  //27==153  152==153  153==153
{
	                         // 6
 System.out.println(num +"-is a armstrong number");
}
else
{
 System.out.println(num +" is a not armstrong number");
}

}

}
