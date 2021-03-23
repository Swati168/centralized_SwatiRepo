package Inheritance;

public class Parent extends GrandParent
{
	public void Second()
	{
		System.out.println("This is Parent Class");
	}
	public static void main(String[] args) 
	{
		Parent p = new Parent();
		p.First();
		p.Second();
		}

}
