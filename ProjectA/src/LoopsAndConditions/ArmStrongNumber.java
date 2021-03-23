package LoopsAndConditions;

import java.util.Scanner;

public class ArmStrongNumber
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = s.nextInt();
		int sum = 0;
		int n_number = number;
		
		while(number>0)
		{
			int r = number%10;
			sum = sum+r*r*r;
			number = number/10;
		}
		if(n_number==sum)
		{
			System.out.println("It is armstrong number");
		}
		else
		{
			System.out.println("It is not armstrong number");
		}
		
	}

}
