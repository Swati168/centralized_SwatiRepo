package ConstructorInInheritance;

public class Asgonethis 
{
	public Asgonethis()
	{
		this(13,14,15);
		System.out.println("Parent Default Constructor");
	}
	public Asgonethis(int a)
	{
		this();
		System.out.println("Parent One Parameterized Constructor");
	}
	public Asgonethis(int a,int b)
	{
		this(564);
		System.out.println("Parent Two Parameterized Constructor");
	}
	public Asgonethis(int a,int b,int c)
	{
		System.out.println("Parent Three Parameterized Constructor");
	}
	public Asgonethis(int a,int b,int c,int d)
	{ 
		this(11,12);
		System.out.println("Parent Four Parameterized Constructor");
	}

}
