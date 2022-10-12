package keywords;

public class ThisKeyword
{
	int studentmarks=100;
	
	public ThisKeyword(int studentmarks )
	{
		this.studentmarks=studentmarks;
		
		System.out.println("student marks is-"+studentmarks);
		
	}
	public static void main(String[] args)
	{
		ThisKeyword x = new ThisKeyword(100);
		
	}
	
	
	
	

}
