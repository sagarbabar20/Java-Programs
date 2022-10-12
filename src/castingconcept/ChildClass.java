package castingconcept;

public class ChildClass extends ParentClass
{
	public void method3()
	{
		System.out.println("method3-child class");
	}
	
	public void method4()
	{
		System.out.println("method4-child class");
	}
	
	
	//main method
	public static void main(String[] args)
	{
		//Normal way calling
		//parent-->method1,method2
//		ParentClass x = new ParentClass();
//		x.method1();
//		x.method2();
		
		//child-->method3,method4
//		ChildClass y = new ChildClass();
//		y.method3();
//		y.method4();
		
		//Inheritance way
//		ChildClass z = new ChildClass();
//		z.method1();  //parent
//		z.method2();  //parent
		
//		z.method3();  //child
//		z.method4();  //child
		
		//Upcasting way
		ParentClass a = new ChildClass();
		a.method1();   //possible
		a.method2();   //possible
		
//		a.method3();   //not possible
//		a.method4();   //not possible
		
		
		
		
		
	}

}
