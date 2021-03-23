package Inheritance;

public class Child extends Parent
{
	public void Third()
	{
		System.out.println("This is Child Class");
	}
	
public static void main(String[] args)
{
	Child c = new Child();
	c.First();
	c.Second();
	c.Third();
	
}
}
