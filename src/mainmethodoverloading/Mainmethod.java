package mainmethodoverloading;

public class Mainmethod 
{
//Q.Can we overload the main method in Java?

//yes,we can overload the main method 
//but remember that the JVM always calls the original main() method.
//it does not call the overloaded main () method.

public static void main(int args) 
{
System.out.println("Main method1-int argument");	
}
public static void main(char args) 
{
	System.out.println("Main method2-char argument");
}
public static void main(String[] args)
{
	System.out.println("original main method");
}
}


//------------------------------------

//original main method
//  public static void main(String[] args) 
//{
//	Mainmethod x = new Mainmethod();
//	
//	x.main();
//}
////overloaded main method
//  public static void main()
//{
//  System.out.println("overloaded main method");
//}
//}
