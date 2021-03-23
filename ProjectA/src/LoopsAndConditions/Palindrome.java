package LoopsAndConditions;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter the Number: ");
		int number = s.nextInt();
		int sum=0;
		int old_number = number;
		
		while(number>0)
		{
			int r = number%10;
			sum=sum*10+r;
			number=number/10;
		}
		if(old_number==sum)
		{
			System.out.println("Number is Palindrome "+old_number);
		}
		else
		{
			System.out.println("Number is not Palindrome "+old_number);
		}
	}

}
