package encapsulationconcept;

public class AmazonSignUpPage extends AmazonDatabase
{
public static void main(String[] args)
{
	AmazonSignUpPage x=new AmazonSignUpPage();
	x.getfirstname("Sagar");
	
	x.getlastname("Babar");
	
	x.getmobileno(7776067870l);
	
	x.getDOB("20/may/1997");
	
	x.getgender('M');
}
}
