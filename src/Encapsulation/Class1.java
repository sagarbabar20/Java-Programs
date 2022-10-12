package Encapsulation;

public class Class1
{
	
	String Fname;
	int mobNo;
	
	public void Fname(String a)
	{
		Fname=a;
		
		System.out.println("name is-"+a);
	}
	
	public void mobNo(int b)
	{
  mobNo=b;
System.out.println("mob no is-"+b);
	}
	
	
	
	public static void main(String[] args) 
	{
		Class2 x = new Class2();
		x.Fname("Sagar");
		x.mobNo(777606787);
	}
	}


