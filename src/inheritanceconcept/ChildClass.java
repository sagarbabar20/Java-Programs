package inheritanceconcept;

public class ChildClass extends ParentClass
{
	public static void main(String[] args)
	{
		//parents element called by parent object only
		//normal way element calling 
//		ParentClass x = new ParentClass();
//		System.out.println(x.a);
//		
//		x.method1();
		
		
		
		//Inheritance way 
		//child class object 
		//child is going to use those parent properties 
		
		ChildClass y = new ChildClass();
		System.out.println(y.a);
		
		y.method1();
			
				
	}
	

}
