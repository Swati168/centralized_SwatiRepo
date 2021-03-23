package LoopsAndConditions;

public class DoubleLoop 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++) //loop for row
		{
			for(int j=1;j<=i;j++) //loop for column
			{
				System.out.print("*");
			}
			System.out.println(); //It will move cursor to the next line
		}
		
	}

}
