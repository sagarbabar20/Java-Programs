package inheritancepractice;

public class ParentClass1 extends Grandparentclass1
{
public static void main(String[] args) 
{
	//multi level inheritance
	ParentClass1 x = new ParentClass1();
	System.out.println(x.b);
	
	x.method2();
}
}
