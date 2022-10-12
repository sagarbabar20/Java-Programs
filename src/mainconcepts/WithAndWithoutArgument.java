package mainconcepts;

public class WithAndWithoutArgument
{
	//without argument method
	//static-->non return-->without argument
//  public static void method1()
//  {
//	  System.out.println("method without argument");
//  }
  
    //--------------------------------------------
   
	public static void method2(int x)
	{
		System.out.println("method2 with argument");
	}
    
//-------------------------------------------  
  //Main method
  public static void main(String[] args) 
  {
	  //without argument method-->calling
//	  method1();
//-------------------------------------------------
	  
  // method with argument-->calling
  // int type argument
  //int type any value method signature pass
	  method2(100);
}
}
