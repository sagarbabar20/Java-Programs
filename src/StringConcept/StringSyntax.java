package StringConcept;

public class StringSyntax 
{
	public static void main(String []args)
	{
		// Syntax 1--> String with literal
//		String a = "Sagar";
//		System.out.println(a);
		
		
		// Syntax 2--> String with new keyword
//		String b = new String ("SAGAR BABAR");
//		System.out.println(b);
		
		
//		String a ="Apple";
//		String b ="Mango";
//		String c ="Apple";
//		String d ="apple";
//		
		//Value checking
//		System.out.println(a==b);
//		System.out.println(a==c);
//		System.out.println(a==d);
//		
		//Address checking
//		System.out.println(a.equals(b));
//		System.out.println(a.equals(c));
//		System.out.println(a.equals(d));
		
		
		//String with new keyword
		
		String a=new String("Apple");
		String b=new String("Mango");
		String c=new String("Apple");
		String d=new String("apple");
		
		//value checking 
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		
		//Address checking
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		
		//OR
//		boolean result=a.equals(c);
//		System.out.println(result);

		


	
		
	}

}
