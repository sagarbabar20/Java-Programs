package overloadingprogram;

public class MethodoverloadingReturntype
{
	public static int method1()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return c;
		
	}	
		
		public static int method1(int x)
		{
		int	d=20;
		int	e=40;
		int	f=d+e;
			System.out.println(f);
			return f;
		}
	
		
		public static int method1(int x,int y)
		{
			int g=50;
			int h=100;
			int j=g+h;
			System.out.println(j);
			return j;
		}
		
		
		
		public static int method1(int x,char y)
		{
			int g=500;
			int h=1000;
			int j=g+h;
			System.out.println(j);
			return j;
		}
		
		
		
		
		

		
		//main method
		public static void main(String[] args)
		{
			method1();
			int x=method1();
			System.out.println(100+x);

			
			method1(2);
			int y=method1(2);
			System.out.println(200+y);
			
			
			method1(10,20);
			int z=method1(10,20);
			System.out.println(100+z);

			method1(10,'A');
			int s=method1(10,'A');
			System.out.println(1000+s);


		}

}
