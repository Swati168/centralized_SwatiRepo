package Pkg1;

public class Studentt
{
 int a; 
 public void display()
 {
	 System.out.println("Welcome to all of you");
 }
 
 public static void main(String[] args)
 {
	Studentt s = new Studentt();
	s.display();
	s.a=561;
	System.out.println("Value of a "+s.a);
}
 
}
