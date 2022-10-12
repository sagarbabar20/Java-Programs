package inheritancepractice;

public class Childclass extends Parentclass
{
	public static void main(String[] args) 
	{
		//normal way
		Parentclass x= new Parentclass();
		System.out.println(x.a);
		x.method1();
		
		//single level inheritance
		Childclass y = new Childclass();
		System.out.println(y.a);
		y.method1();
		
	}

}
