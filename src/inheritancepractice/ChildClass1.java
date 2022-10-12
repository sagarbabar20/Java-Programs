package inheritancepractice;

public class ChildClass1 extends ParentClass1
{
	public static void main(String[] args)
	{
	//multi level inheritance
		ChildClass1 x = new ChildClass1();
		System.out.println(x.b);
		
		x.method2();
		
	}

}
