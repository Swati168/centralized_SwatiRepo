package Pkg1;

public class thiskeyword 
{
 public thiskeyword()
 {
	 this(11,14);
	 System.out.println("Default Constructor");
 }
 public thiskeyword(int a)
 {
		 System.out.println("One parameterized constructor");
 }
 public thiskeyword(int a, int b)
 {
	 this(34);
	 System.out.println("Two Parameterized Constructor");
 }
 public static void main(String[] args)
 {
	thiskeyword t = new thiskeyword();
	//thiskeyword u = new thiskeyword(12);
	//thiskeyword v = new thiskeyword(11,17);
}
}
