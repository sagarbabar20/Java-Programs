package arrayconceptprogram;
public class AscendingOrder 
{
	public static void main(String[] args)
	{
	 int a[]=new int []{6, 8, 4, 2, 5};  
//	                    0  1  2  3  4
		 int x = 0;  
		 //step  1  step 2
 for (int i = 0; i < a.length; i++)  //0 1 2 3 4 5
 {      
	     //step 3    4            6
 for (int j = i+1; j < a.length; j++) //1 2 3 4 5
	                                  //2 3 4 5
	                                  //3 4 5
	                                  //4 5
	                                  //5
 {     
	 //step 5
    if(a[i] > a[j]) //6>8 6>4 4>2 2>5 
    	            //8>4 4>8 2>5
    	            //6>8 6>5
    	            //8>6
    	            
	{    
    	//step 7
		  x = a[i];  //6 4  //8  //6  //8
		  //step 8
       a[i] = a[j];  //4 2  //4  //5  //6
       //step 9
	   a[j] = x;     //6 4  //8  //6  //8
//swap no--> 4,8,6,2,5  2,8,6,4,5 
//	         2,4,6,8,5  2,4,5,8,6   2,4,5,6,8  Latest array swap
		           }     
		        }     
		    }    
 System.out.println("Elements of array ascending order is-");    
		    for (int i = 0; i < a.length; i++)
		    {     
		        System.out.print(a[i] + " ");    
		    }    

	}

}
