package arrayconceptprogram;

public class SecondLargestNumber 
{
public static void main(String[] args)
{
	int a[] = {6,8,2,4,9};
//	           0 1 2 3 4
	int x;  
	for (int i = 0; i < a.length; i++)  //0 1 2 3 4 5
	  {  
	 for (int j = i + 1; j < a.length; j++) //1 2 3 4 5
		                                    //2 3 4 5
		                                    //3 4 5
		                                    //4 5
		                                    //5
	 {  
	       if (a[i] < a[j])   //6<8  8<2 8<4 8<9
	    	                  //6<2  6<4 6<8
	    	                  //2<4  2<6
	    	                  //4<6
    {  
	      x = a[i];  //6 8 //6 //2 //2 //4
	   a[i] = a[j];  //8 9 //8 //4 //6 //6
	   a[j] = x;     //6 8 //6 //2 //2 //4
	   
//	   8,6,2,4,9   9,6,2,4,8  
//	   9,8,2,4,6    
//     9,8,4,2,6    9,8,4,6,2
//	   9,8,6,4,2         
	                    
	                }  
	                
	            }
	        }
	System.out.println("Second largest number is-"+ a[1]);
}
}

