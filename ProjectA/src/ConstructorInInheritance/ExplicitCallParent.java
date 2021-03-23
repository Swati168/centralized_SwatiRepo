package ConstructorInInheritance;

public class ExplicitCallParent 
{
	public ExplicitCallParent()
	{
		System.out.println("Parent Default Constructor");
	}
	public ExplicitCallParent(int a)
	{
		System.out.println("Parent One Parameterized Constructor");
	}
	public ExplicitCallParent(int a,int b)
	{
		System.out.println("Parent Two Parameterized Constructor");
	}
	public ExplicitCallParent(int a,int b,int c)
	{
		System.out.println("Parent Three Parameterized Constructor");
	}

}
