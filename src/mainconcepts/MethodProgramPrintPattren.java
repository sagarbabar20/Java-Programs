package mainconcepts;

public class MethodProgramPrintPattren 
{
	//Method should be written in class body
	//Not in main method
	//Method under method not allowed
	
   public static void printPattren()
   {
   //code -Repeated code
   for(int i=1; i<=3; i++)
   {
	   System.out.println(i);
   }
   }
   //program excute- Main method
   public static void main(String[] args) 
   {
	   //method calling
	   printPattren();
	   System.out.println("AA");
	   
	   printPattren();
	   System.out.println("BB");
	   
	   printPattren();
	   System.out.println("CC");
	   	
}
   

}
