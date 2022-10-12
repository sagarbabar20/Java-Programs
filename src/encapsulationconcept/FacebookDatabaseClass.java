package encapsulationconcept;

public class FacebookDatabaseClass 
{
private String firstname;
private int contactNum;

public  void getFirstName(String a)
{
	firstname =a;
	System.out.println("first name is-"+firstname);
}

public void getcontactNo(int b)
{
	contactNum=b;
	System.out.println("contact No is-"+contactNum);
}
}
