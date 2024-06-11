//(((((10*2)-2)+2)-2)/2)
public class assignment2 {
	int a=10;
	int b=2;
	public int mul(int a,int b)
	{
		int mul=a*b;
		System.out.println("Result of Multiplication is:"+mul);
		return mul;
	}
	public int sub1(int mul,int b)
	{
		int sub1=mul-b;
		System.out.println("Result of subtraction is:"+sub1);
		return sub1;
	}
	public int add(int sub1,int b) {
		int add=sub1+b;
		System.out.println("Result of addition is:"+add);
		return add;
	}
	public int sub(int add, int b)
	{
		int sub2=add-b;
		System.out.println("Result of subtraction is:"+sub2);
		return sub2;
	}
	public int div(int sub2,int b)
	{
		int div=sub2/b;
		System.out.println("Final result is:"+div);
		return div;
	}
	
public static void main(String[] args)
{
	assignment2 assign=new assignment2();
	int mul=assign.mul(assign.a,assign.b);
	int sub1=assign.sub1(mul, assign.b);
	int add=assign.add(sub1,assign.b);
	int sub2=assign.sub(add, assign.b);
	int div=assign.div(sub2, assign.b);
}
	
	
	
}
	

