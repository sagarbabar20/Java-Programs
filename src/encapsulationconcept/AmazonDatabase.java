package encapsulationconcept;

public class AmazonDatabase 
{
	 String firstname;
	String lastname;
	long mobileno;
	String DOB;
	char gender;
	 
	public void getfirstname(String a)
	{
		firstname=a;
		System.out.println("first name is-"+ firstname);
	}

	public void getlastname(String b)
	{
		lastname=b;
		System.out.println("last name is-"+lastname);
	}
	
	public void getmobileno(long c)
	{
		mobileno=c;
		System.out.println("mobile no is-"+mobileno);
	}
	
	public void getDOB(String d)
	{
		DOB=d;
		System.out.println("DOB is-"+DOB);
	}
	
	public void getgender(char e)
	{
		gender=e;
		System.out.println("gender-"+gender);
	}
}
