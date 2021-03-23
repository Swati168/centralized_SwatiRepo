package Pkg1;

public class Constructor {
	
	public Constructor()
	{
		System.out.println("Default Constructor");
	}
	public Constructor(int a)
	{
		System.out.println("One Parameterized Constructor");
	}
	public Constructor(int a,int b)
	{
		System.out.println("Two Parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		Constructor c = new Constructor();
		Constructor d = new Constructor(12);
		Constructor e = new Constructor(12,13);
		
	}

}
