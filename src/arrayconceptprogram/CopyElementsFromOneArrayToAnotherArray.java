package arrayconceptprogram;

public class CopyElementsFromOneArrayToAnotherArray 
{
public static void main(String[] args) 
{
	 int a[] = {10,11,12,13,14}; 
	 int b[] = new int [5];
	    
	    b[0] = a[0];
	    b[1] = a[1];
	    b[2] = a[2];
	    b[3] = a[3];
	    b[4] = a[4];
	    
	    for(int i=0; i<=b.length-1; i++)
	    {
	    System.out.print(b[i] + " ");
	    }
}		
	}


