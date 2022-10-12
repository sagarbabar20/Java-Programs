package polymorphismconcept;

public class Childclass1 extends Parentclass1
{
 public void method1()
{
	 //method1() from parent class-->extends keywords
	 //method1()-->self method
	System.out.println("method1-childClass1");
}

 //main
 public static void main(String[] args) 
{
	Childclass1 x = new Childclass1();
	x.method1();
}

// parent class-->method1
// child class-->method1
// extends from parent to child
// 1.both classes have method1()-->child class will be called
// 2.child class method1()-->absent-->parent class method1 called
}
