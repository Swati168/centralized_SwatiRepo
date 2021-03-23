package Pkg1;

public class Asg2 
{
 public int div(int x1,int x2)
 {
	 int x3;
	 x3=x1/x2;
	 System.out.println("Div result is "+x3);
	 return x3;	 
 }
 public int sum(int a,int b)
 {
	 int c;
	 c=a+b;
	 System.out.println("Sum result is "+c);
	 return c;
 }
 public int sub(int y1,int y2)
 {
	 int y3;
	 y3=y1-y2;
	 System.out.println("Sub result is "+y3);
	 return y3;
 }
 public void mul(int z1,int z2)
 {
	 int z3;
	 z3=z1*z2;
	 System.out.println("Mul result is "+z3);
 }
 public static void main(String[] args) 
 {
	 Asg2 b=new Asg2();
	int div_result = b.div(10, 2);
	int sum_result = b.sum(div_result, 2);
	int sub_result = b.sub(sum_result, 2);
	int sum_result2 = b.sum(sub_result, 2);
	b.mul(sum_result2, 2);
}
}
