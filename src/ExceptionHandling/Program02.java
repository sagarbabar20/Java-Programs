package ExceptionHandling;

public class Program02
{
public static void main(String[] args) 
{
	//run time exception
	//unchecked expection

	int a[]= {1,2,3,4};
//	          0 1  2 3
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	
	try
	{
		System.out.println(a[4]);   //Problem line
	}
	catch(Exception e)
	{
		//solution
		System.out.println("index 3 element is absent in the array");
		System.out.println("simply change the value of index");

	}
	System.out.println("Hello");
	System.out.println("Hii");
	System.out.println("End of Program");

	//hadling-> I will simply fill the 
	//gap between the code
	//will bring the program in normal flow


}
}
