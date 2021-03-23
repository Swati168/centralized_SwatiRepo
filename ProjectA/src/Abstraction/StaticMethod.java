package Abstraction;

public class StaticMethod
{
	static int a =16;
	public static void abc()
	{
		System.out.println("I am a static method");
	}
	
	public static void main(String[] args) 
	{
		StaticMethod.abc();
		StaticMethod.a = 176;
		System.out.println(StaticMethod.a);
		
	}

}
