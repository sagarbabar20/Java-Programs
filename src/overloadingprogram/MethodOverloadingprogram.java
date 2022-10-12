package overloadingprogram;

public class MethodOverloadingprogram
{
	
   public static void method1() 
   {
   //1.zero argument
   System.out.println("Static method");	
   }
   
   
   //2.int x argument
   public static void method1(int x) 
   {
   System.out.println("Static method- int x argument");
   }
   
   
   //3.char x argument
   public static void method1(char x)
   {
   System.out.println("Static method- char x argument");
   }
  
   
   //4.String x argument
   public static void method1(String x)
   {
   System.out.println("Static method- String x argument");
   }
   
   
   //5.Boolean x argument
   public static void method1(Boolean x)
   {
   System.out.println("Static method- Boolean x argument");
   }
   
   
   //6.char x, int y  argument
   public static void method1(char x,int y)
   {
   System.out.println("Static method- char x,int y argument");
   }
   

   //7.int x,int y argument
    public static void method1(int x ,int y)
   {
	   System.out.println("Static method-int x,int y  argument");
   }
    
   
   //8.char x,int y,String z argument 
   public static void method1(char x,int y,String z)
   {
	   System.out.println("Static method-char x,int y,String z argument");
   }
   
   
   //9.multi combo argument
   public static void method1(int a,int b,int c,int d,int e)
   {
	   System.out.println("Static method- multi combo argument ");
   }

   
   //10.non static
   public void method1(int x,int y,int z)
   {
	System.out.println("non static method-3 int argument");
   }
   
 //-----------------------------------------------------------

 
  //main method
  public static void main(String[] args) 
  {
	  method1();
	  
	  method1(50);
	  
	  method1('S');
	  
	  method1("Sagar");
	  
	  method1(false);
	  
	  method1('S', 10);
	  
	  method1(10,20);
	  
	  method1('S' , 100, "Sagar");
	  
	  method1(2,4,6,8,10);
	  
	  MethodOverloadingprogram x = new MethodOverloadingprogram();
	  x.method1(2,4,6);
	  
	  
	  
	  
	
	  }
}
