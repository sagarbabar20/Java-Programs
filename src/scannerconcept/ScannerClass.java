package scannerconcept;

import java.util.Scanner;

public class ScannerClass 
{
	public static void main(String[] args)
	{
		Scanner x = new Scanner (System.in);
		
		System.out.println("Enter value 1st-");
		int a = x.nextInt();
		
		System.out.println("Enter value 2nd-");
		int b = x.nextInt();
		
		int c = a+b;
		System.out.println("Addition is-"+c);
		
	}

}
