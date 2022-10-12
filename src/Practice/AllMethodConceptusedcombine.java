package Practice;

public class AllMethodConceptusedcombine 
{
	//variable declare
	String StudentName;
	int RollNo;
	int AdhaarNo;
	int ContactNo;
	String dateofbirth;
	String Emailid;
    String BloodGroup;
	static String BatchNo="4thjune";
	
	//constructor
	public AllMethodConceptusedcombine()
	{
	StudentName="Sagar Babar";
	RollNo=105;
	AdhaarNo=48854414;	
	ContactNo=777606787;
	dateofbirth="20/05/1997";
	Emailid="er.sagardbabar@gmail.com";
	BloodGroup="+B";
	}
	
	public AllMethodConceptusedcombine(int x)
	{
	StudentName="Akshay Babar";
	RollNo=100;
	AdhaarNo=48854414;	
	ContactNo=777606787;
	dateofbirth="20/05/1997";
	Emailid="er.akshaydbabar@gmail.com";
	BloodGroup="+A";
	}
	
	
	//method
	public void studentData()
	{
		System.out.println("Student Name is - " + StudentName
				            + " Roll No is- " + RollNo
				            + " Adhaar No is- "+ AdhaarNo
				            + " Contact No is- "+ ContactNo
				            + " dateof birth is- " + dateofbirth
				           + " Email id is- "  + Emailid
				           + " Blood Group is- "+ BloodGroup
				           + " Batch No is-" + BatchNo);
		
	}
		//main method
		public static void main(String[] args)
		{
	AllMethodConceptusedcombine x = new AllMethodConceptusedcombine();
			x.studentData();
			
			
	AllMethodConceptusedcombine y = new AllMethodConceptusedcombine(20);
              y.studentData();
			
		}
	}
	
