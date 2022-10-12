package keywords;

public class SuperClass2 extends SuperClass1
{
	String name="swapnil";
	int a = 100;

   public void supermethod()	
    {
		System.out.println(super.name);
		System.out.println(name);
		System.out.println(super.a);
		System.out.println(a);
	}
   
   
   public static void main(String[] args) 
   {
	 SuperClass2 x = new SuperClass2();
	 x.supermethod();
	 
}

}
