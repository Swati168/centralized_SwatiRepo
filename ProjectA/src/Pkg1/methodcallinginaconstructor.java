package Pkg1;

public class methodcallinginaconstructor 
{
	public methodcallinginaconstructor()
	{
		this.m1(); //able to call
		System.out.println("Default Constructor");
	}
	public void m1()
	{
		System.out.println("Method M1");
	}
	public static void main(String[] args) 
	{
		methodcallinginaconstructor g = new methodcallinginaconstructor();
	}

}
