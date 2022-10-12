package packageEF;

public class ClassF 
{
	public static void main(String[] args) 
	{
		//call static variable from classE
		System.out.println(ClassE.a);
		
		//call static method from classE
        ClassE.method1();
        
        //call non static variable from classE
        //create object with ClassE name
        ClassE x = new ClassE();
        System.out.println(x.b);
        
        //call non static method from classE
        x.method2();
	}

}
