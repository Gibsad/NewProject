public class assignment1 {
	//variables
	int a=10;
	int b=2;
	public int add1(int a,int b) //method to add the above variables
	{
		int sum1=a+b;
		System.out.println("Result of sum1 is:"+sum1);
		return sum1;
		
	}
	public int add2(int sum1, int b) //method to add the result of above and variable b
	{
		int sum2=sum1+b;
		System.out.println("Result of sum2 is:"+sum2);
		return sum2;
	}
	public int sub(int sum2, int b) //method to subtract variable b from the result of sum2
	{
		int subtract=sum2-b;
		System.out.println("Result of subtraction is:"+subtract);
		return subtract;
	}
	public int mul(int subtract, int b) //method to multiply the variable subtract with variable b
	{
		int mul=subtract*b;
		System.out.println("Result of multiplication is:"+mul);
		return mul;
	}
	public int div(int mul,int b) //method to divide the above result by variable b to get the final result
	{
		int div=mul/b;
		System.out.println("Result of division is:"+div);
		return div;
	}
	public static void main(String[] args)   //main method 
	{
	assignment1 assign = new assignment1();    //creating a new object 'assign' to perform operations
	int sum1 = assign.add1(assign.a,assign.b); //adding instance variables a and b
	int sum2 = assign.add2(sum1,assign.b);     //adding above result with instance variable b
	int subtract = assign.sub(sum2,assign.b);  //subtracting above result from instance variable b
	int mul = assign.mul(subtract,assign.b);   //multiplying above result with variable b
	int div = assign.div(mul,assign.b);        //dividing above result with variable b to get the final result
	
	System.out.println("The final result is:"+div);
	}
}