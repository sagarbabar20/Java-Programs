package StringConcept;

public class StringMethods 
{
	public static void main(String[] args) 
	{
	//String Methods
	// 1-Equals method-->Value check
//	String a = "Sagar";
//	System.out.println(a);
//	
//	String b = "Manoj";
//	System.out.println(b);
//	
//	boolean result =a.equals(b);
//	System.out.println(result);
//	      //OR
//	System.out.println(a.equals(b));
		
//*******************************************************	
	// 2->== operator method-->Address check
//		String a = "Sagar";
//		System.out.println(a);
//		
//		String b = "Manoj";
//		System.out.println(b);
//		
//		boolean result=a==b;
//		System.out.println(result);
//********************************************************		
   // 3-> String length method
//		String a = "Sagar";
//		System.out.println(a);
//		
//	 int result = a.length();
//	 System.out.println("Length is-"+result);
		  
//	String b = " Sagar ";
//	System.out.println(b.length());
//********************************************************		
	  // 4-> String Charcat method
//		String a = "Sagar";
//	    System.out.println(a);
	    
//	    char result=a.charAt(4);
//	    System.out.println(result);
	    
//	    for(int i=0; i<a.length(); i++)
//	    {
//	    	System.out.println(a.charAt(i));
//	    }
//*******************************************************
		// 5-> String Concat Method
//		String a = "Sagar";
//		String b = "Babar";
//		String result=a.concat(b);
//		System.out.println(result);
//		      //OR
//		System.out.println(a+b);  //+ Operator Concatenation operator
		
//		String a = "Sagar";
//		   int b = 50;
//		   int c = 100;
//		   System.out.println(b+c);
//		   System.out.println(a+b);
//		   System.out.println(a+b+c);
//		   System.out.println(a+(b+c));  //BODMOS Rule
//*************************************************************
		// 6->String lower and upper case method
//		String a = "SagAR";
//		System.out.println(a);
//		
//		String result = a.toLowerCase();
//		System.out.println(result);  
//		         //OR
//		System.out.println(a.toLowerCase());
//		
//		String result1=a.toUpperCase();
//		System.out.println(result1);
//		        //OR
//		System.out.println(a.toUpperCase());
//************************************************************
		//ex.7 starts with and end with method
//		String a = "Sagarbabar";
//		
//		boolean result=a.startsWith("S");
//		System.out.println(result);
//		
//		System.out.println(a.startsWith("a"));
//		
//		System.out.println(a.endsWith("bar"));
//		System.out.println(a.endsWith("rb"));
//**********************************************************
		//ex.8 equal and ignore case 
//		String a = "Sagar";
//		String b = "sagar";
		
//		boolean result=a.equals(b);
//		System.out.println(result);
		
//		boolean s=a.equalsIgnoreCase(b);
//		System.out.println(s);
		
//if ignore uppercase and lowercase.		
//**********************************************************
		//ex.9 substring
//		String a="SAGARBABAR";
//		String result=a.substring(5);
//		System.out.println(result);
		
//		String b="SAGARBABAR";
//		System.out.println(b.substring(0, 10));
//		System.out.println(b.substring(2, 5));
		
		//start index and end index pass
		//always pass one extra ending index 4+1
//********************************************************
		//10-->trim
		String a="Sagar";
		System.out.println(a.length());
		
		String b=" Sagar";
		System.out.println(b);
		System.out.println(b.length());
	    System.out.println(b.trim());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
