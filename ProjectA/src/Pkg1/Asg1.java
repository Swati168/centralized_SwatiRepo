package Pkg1;

public class Asg1 
{
	public int sum(int a, int b)
	{
		int c;
		c = a+b;
		System.out.println("Sum result is  "+c);
		return c;
	}
	public int sub(int x1,int x2)
	{
		int x3;
		x3=x1-x2;
		System.out.println("Sub result is "+x3);
		return x3;
	}
	public void  div(int y1,int y2)
	{
		int y3;
		y3=y1/y2;
		System.out.println("Div result is "+y3);
		}
	public int mul(int z1,int z2)
	{
		int z3;
		z3=z1*z2;
		System.out.println("Mul result is "+z3);
		return z3;
	}
	public static void main(String[] args) 
	{
		Asg1 a=new Asg1();
		int sum_result =  a.sum(10,2);
		int sub_result = a.sub(sum_result,2);
		int sum_result2 = a.sum(sub_result, 2);
		int mul_result = a.mul(sum_result2, 2);
		a.div(mul_result, 2);	
	}

}
