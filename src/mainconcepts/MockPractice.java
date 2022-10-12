package mainconcepts;

public class MockPractice 
{
// argument use
//	public static void additionMethod(int x,int y)
//	{
//		int a=x;
//		int b=y;
//		int c=x+y;
//		System.out.println(c);
//	}
	
	//return type with argument use
//	public static int additionMethod1(int x,int y)
//	{
//		int a=x;
//		int b=y;
//		int c=x+y;
//		System.out.println(c);
//		return c;
//	}
	
	//non static with argument use
	public void additionmethod2(int x,int y)
	{
		int a=x;
		int b=y;
		int c=a+b;
		System.out.println(c);
	}
	
	//main method
	public static void main(String[] args) 
	{
		//1.calling argument use
//		additionMethod(10,20);
//		additionMethod(200,300);
		
		
		//2.calling return type with argument use
//        additionMethod1(20,40);
//		  int x=additionMethod1(20,40);
//		  System.out.println(100 + x);
		
		
		//3.calling non static with argument use
		//create object
		MockPractice x = new MockPractice();
		x.additionmethod2(50,100);
		


	}
	
	
}
	