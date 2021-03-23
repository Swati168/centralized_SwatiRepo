package Pkg1;

public class Sumsubmul
{
	public int sum(int x1,int x2)
	{
		int x3;
		x3 = x1+x2;
		System.out.println("Sum Result is  "+x3);
		return x3;
	}
	public int sub(int y1,int y2)
	{
		int y3;
		y3=y1-y2;
		System.out.println("Sub Result is "+y3);
		return y3;
	}
	public void mul(int z1,int z2)
	{
		int z3;
		z3=z1*z2;
		System.out.println("Mul Result is "+z3);
	}
	public static void main(String[] args) 
	{
		Sumsubmul s = new Sumsubmul();
		int sum_result = s.sum(10,2);
		int sub_result = s.sub(10,2);
		s.mul(sum_result,sub_result);
	}

	  

}
