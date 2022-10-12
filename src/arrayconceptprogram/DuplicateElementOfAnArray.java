package arrayconceptprogram;

public class DuplicateElementOfAnArray
{
	public static void main(String[] args) 
	{
      int [] a ={1, 2, 3, 4, 2, 7, 8, 8, 3,};
//               0  1  2  3  4  5  6  7  8
      
     System.out.println("Duplicate elements are -"); 
     
         for(int i = 0; i < a.length; i++)
   {  
         for(int j = i + 1; j < a.length; j++) 
{  
          if((a[i] == a[j]) && (i!=j))
        	  
           System.out.print(a[j] + " ");  
     }  

		
	}

}
}
