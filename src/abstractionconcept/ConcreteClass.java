package abstractionconcept;

public class ConcreteClass extends AbstractClass
{
public void method2()
{
	System.out.println("compeleted method");
}

//main 
public static void main(String[] args) 
{
	ConcreteClass x = new ConcreteClass();
	//complete method calling 
	x.method1();
	
	//incomplete method calling
	x.method2();
}
}
