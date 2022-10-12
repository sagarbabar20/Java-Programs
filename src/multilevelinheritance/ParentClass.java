package multilevelinheritance;

public class ParentClass extends GrandParent
{
	public static void main(String[] args) 
	{
		//object create with parent class
		
		ParentClass x = new ParentClass();
		System.out.println(x.a);
		x.method1();
		
	}

}
