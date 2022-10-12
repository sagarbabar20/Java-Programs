package overloadingprogram;

public class AllConcept3 
{
	 String name;
	 int rollno;
	 int mobileno;
	 String emailid;
	 String dateofbirth;
	 
	//common data declare n initialize at a time only.
	static String batchno="4thJune";

	//non static elements provides better memory utilization.
	 
	 //1.Constructor
	 public AllConcept3()
	 {
	  name="Sagar";
	  rollno=82;
	  mobileno=777606787;
	  emailid="sagar123@gmail.com";
	  dateofbirth="20/05/1997";
	 }
	 
		 
	 //2.
	 public AllConcept3(int x)
	 {
		  name="Akshay";
		  rollno=120;
		  mobileno=860088888;
		  emailid="akshay123@gmail.com";
		  dateofbirth="15/11/1995";
    }

	 //method for data print purpose.
	 public void PrintStudentData()
	 {
	System.out.println("name is-"+name 
		            +  "  roll no is- "+rollno
		            + "   mobile no is- "+mobileno
		            + "   email id is- "+emailid
		            + "   batch no is - "+batchno
		            + "   date of birth is- "+dateofbirth);

		 
	 }
	 //main method
	 public static void main(String[] args) 
	 {
	 AllConcept3 x = new AllConcept3();
	 x.PrintStudentData();
	 
	 AllConcept3 y = new AllConcept3(2);
	 y.PrintStudentData();

	}

}
