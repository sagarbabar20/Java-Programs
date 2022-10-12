package interfaceconcept;

public class ImplementClass implements Interface1
{

	@Override
	public void checkBalance() 
	{
		System.out.println("check Balance");
	}

	@Override
	public void withdrawMoney() 
	{
		System.out.println("withdraw Money");
	}
	
	
	//main method
	public static void main(String[] args) 
	{
		ImplementClass x = new ImplementClass()	;
		x.checkBalance();
		
		x.withdrawMoney();
	}

}
