package ScannerPackage;

import java.util.Scanner;

public class ScannerClassMethodCallinginAnotherClass 
{
public static void main(String[] args)
{
	System.out.println("Please enter value of a: ");
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();  //this method will return int value
	System.out.println("Value of a "+a);
	
	System.out.println("Please enter value of abc: ");
	float abc = s.nextFloat();
	System.out.println("Value of abc "+abc);
}
}
