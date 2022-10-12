package arrayconceptprogram;

public class DescendingOrder 
{
public static void main(String[] args) 
{
    int [] a = {5, 2, 8, 7, 1};     
  int x = 0;    

for (int i = 0; i < a.length; i++)
{     
for (int j = i+1; j < a.length; j++) 
{     
 if(a[i] < a[j])
 {    
     x = a[i];    
     a[i] = a[j];    
     a[j] = x;    
 }     
}     
}    
      System.out.println("descending order is-");    
      for (int i = 0; i < a.length; i++)
      {     
      System.out.print(a[i] + " ");    
}
}
}
