package scannerconcept;

import java.util.Scanner;

public class ScannerProgram1
{
public static void main(String[] args)
{
	Scanner a = new Scanner (System.in);
	
	//ex.1
//    double x=a.nextDouble();
//    double y=a.nextDouble();
//    double z=x+y;
//    System.out.println(z);
	
	//ex.2
      short b = a.nextShort();
      short c = a.nextShort();
      int d = b+c;
      System.out.println(d);
    
}
}
