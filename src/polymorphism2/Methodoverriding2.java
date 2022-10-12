package polymorphism2;

public class Methodoverriding2 extends Methodoverriding
{
//public void method1()
//{
//	System.out.println("method1- ");
//}

public void method1(int x, char y)
{
	System.out.println("method1-");
}





public static void main(String[] args) 
{
	Methodoverriding2 x = new Methodoverriding2();
	x.method1();
	x.method1(10, 'S');
}
}
