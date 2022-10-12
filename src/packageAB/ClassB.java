package packageAB;

public class ClassB 
{
	public static void main(String[] args) 
	{
		//call static variable from classA
		System.out.println(ClassA.a);
		
		//call static method from classA
        ClassA.method1();
        
        //call non static variable from classA
        //create object with ClassA name
        ClassA x = new ClassA();
        System.out.println(x.b);
        
        //call non static method from classA
        x.method2();
      

		
	}

}
