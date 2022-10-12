package arrayconceptprogram;

public class MaxAndMinNumberofarray
{
public static void main(String[] args)
{
//	  int [] a ={25, 11, 7, 75, 56}; 
////               0   1   2   3   4
//      int max = a[0]; //25
//
//      for (int i =1; i < a.length; i++) //1 2 3 4 5
//{  
//      if(max < a[i])  //25<11 25<7 25<75 75<56
//  
//       max = a[i];  //75
//}  
//       System.out.println("Maximum element is - " + max);  
//}  

//---------------------------------------------------------------------

    int [] a ={25, 11, 7, 75, 56}; 
              //  0   1  2   3   4
           int min = a[0];  
      for (int i =1; i < a.length; i++) 
{  
      if(min > a[i])  
     min = a[i];  
}  
    System.out.println("Smallest element is-" + min);  
}  

}

