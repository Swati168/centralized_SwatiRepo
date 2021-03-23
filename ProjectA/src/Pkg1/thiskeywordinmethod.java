package Pkg1;

public class thiskeywordinmethod 
{
 public void m1()
 {
	 this.m2();
	// this.m3();
	 System.out.println("First Method");
	 this.m3();
 }
 public void m2()
 {
		 System.out.println("Second Method");
 }
 public void m3()
 {
	 System.out.println("Third Method");
 }
 public static void main(String[] args) 
 {
	 thiskeywordinmethod k = new thiskeywordinmethod();
	 k.m1();
}
}
