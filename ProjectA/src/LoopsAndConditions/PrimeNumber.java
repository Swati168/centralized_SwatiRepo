package LoopsAndConditions;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = s.nextInt();
		int half = n/2;
		int a = 0;
		for(int i=2;i<=half;i++)
		{
			if(n%i==0)
			{
			System.out.println("Its not a Prime Number");
				a=1;
				break;
			}
		}
		if(a==0)
		{
			System.out.println("Number is Prime");
		}
		
	}

}
