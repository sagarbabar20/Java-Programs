package overloadingprogram;

public class Allconcept2 
{
 String name;
 int rollno;
 int mobileno;
 String emailid;
 String batchno;
 String dateofbirth;
 
 
 //1.Constructor
 public Allconcept2()
 {
  name="Sagar";
  rollno=82;
  mobileno=777606787;
  emailid="sagar123@gmail.com";
  batchno="4thjune";
  dateofbirth="20/05/1997";
 
 System.out.println("name is-"+name 
		            + " roll no is- "+rollno
		            + " mobile no is-"+mobileno
		            + " email id is-"+emailid
		            + " batch no is -"+batchno
		            + " date of birth is-"+dateofbirth);
 }
 
 
 //2.
 public Allconcept2(int x)
 {
	  name="Akshay";
	  rollno=120;
	  mobileno=860088888;
	  emailid="akshay123@gmail.com";
	  batchno="4thjune";
	  dateofbirth="15/11/1995";
	 
	 System.out.println("name is-"+name 
			            + " roll no is- "+rollno
			            + " mobile no is-"+mobileno
			            + " email id is-"+emailid
			            + " batch no is -"+batchno
			            + " date of birth is-"+dateofbirth);

 }


 //main method
 public static void main(String[] args) 
 {
 Allconcept2 x = new Allconcept2();
 
 Allconcept2 y = new Allconcept2(2);

}
 
}
