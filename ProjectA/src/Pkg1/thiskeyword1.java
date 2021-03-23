package Pkg1;

public class thiskeyword1
{
 public thiskeyword1()
 {
	 System.out.println("Default Constructor");
 }
 public thiskeyword1(int a)
 {
	 this();
	 System.out.println("One parameterized constructor");
 }
 public thiskeyword1(int a, int b)
 {
	 this(11);
	 System.out.println("Two parameterized constructor");
 }
 public static void main(String[] args) 
 {
	 thiskeyword1 t = new thiskeyword1(1,87);
	 
	
}
}
