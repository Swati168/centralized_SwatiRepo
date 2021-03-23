package LoopsAndConditions;

import java.util.Scanner;

public class SwappingwithoutThird 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Numbers: ");
		Scanner s = new Scanner(System.in);
		int a1 = s.nextInt();
		int a2 = s.nextInt();
		System.out.println("Before Swapping: ");
		System.out.println("Value of First Number is: "+a1);
		System.out.println("Value of Second Number is: "+a2);
		
		a1 = a1+a2;
		a2 = a1-a2;
		a1 = a1-a2;
		System.out.println("After Swapping: ");
		System.out.println("Value of First Number is : "+a1);
		System.out.println("Value of Second Number is : "+a2);
		
	}

}
