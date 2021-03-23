package Abstraction;

public class Class1 implements Interface1
{
	int a;
	public void f1()
	{
		System.out.println("Body1 Given");
	}
	public void f2()
	{
		System.out.println("Body2 Given");
	}
	
	public static void main(String[] args) 
	{
		Class1 obj = new Class1();
		obj.f1();
		obj.f2();
		//obj.a = 126;
		System.out.println(obj.a);
	}

}
