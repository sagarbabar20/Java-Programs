package mainconcepts;

public class MethodProgram3 
{
	//Static
     public static void method1()
	{
		System.out.println("Static");
	}
     
     //Non Static
     public void method2()
     {
 		System.out.println("Non Static");
  }
//----------------------------------------------------
     //Without argument
     public static void method3()
     {
    	 System.out.println("Without argument");
  }
     
     //With argument
     public static void method4(int x)
     {
    	 System.out.println("With argument");
  }
//----------------------------------------------------
     //Non Return type
     public static void method5()
     {
    	 System.out.println("Non Return type");
     }
     
     //Return Type
     public static int method6()
     {
    	 int x=100;
    	 System.out.println(x);
    	 return x;
     }
     
     //Main Method
     public static void main(String[] args)
     {
    	 method1();
    	 
//    	 method2();
    	 
    	 method3();
    	 
    	 method4(1000);
    	 
    	 method5();
    	 
    	 method6();
    	 int z=method6();

  	}

     
}
