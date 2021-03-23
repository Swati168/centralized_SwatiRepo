package ConstructorInInheritance;

public class Asgoneethis extends Asgonethis
{
	public Asgoneethis()
	{
		
		super(11,12,13,14);
		System.out.println("Child Default Constructor");
	}
	public Asgoneethis(int a)
	{
		this(11,12,13);
		System.out.println("Child One Parameterized Constructor");
	}
	public Asgoneethis(int a,int b)
	{
		this(11,12,13,14);
		System.out.println("Child Two Parameterized Constructor");
	}
	public Asgoneethis(int a,int b,int c)
	{
		this(11,12);
		System.out.println("Child Three Parameterized Constructor");
	}
	public Asgoneethis(int a,int b,int c,int d)
	{
		this();
		System.out.println("Child Four Parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
		Asgoneethis a = new Asgoneethis(12);
			
	}
}
