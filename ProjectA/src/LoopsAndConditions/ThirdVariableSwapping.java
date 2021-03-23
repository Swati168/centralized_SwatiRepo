package LoopsAndConditions;

import java.util.Scanner;

public class ThirdVariableSwapping 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Numbers: ");
		int a3;
		Scanner s = new Scanner(System.in);
		int a1 = s.nextInt();
		int a2 = s.nextInt();
		System.out.println("Before Swapping: ");
		System.out.println("First Number "+a1);
		System.out.println("Second Number "+a2);
		
		a3 = a1;
		a1 = a2;
		a2 = a3;
		
		System.out.println("After Swapping: ");
		System.out.println("First Number "+a1);
		System.out.println("Second Number "+a2);
		
	}

}
