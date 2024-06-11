
public class construct {
	public construct()
	{
		this(20,30,40);
		System.out.println("default");
	}
	public construct(int a)
	{
		System.out.println("one parameterized constructor");
	}
	public construct(int a, int b)
	{
		System.out.println("two parameterized constructor");
		
	}
	public construct(int a, int b, int c)
	{
		System.out.println("three parameterized constructor");
	}
	
	public static void main(String args[]) 
	{
		
		construct obj1 = new construct();
		construct obj2 = new construct(40);
		construct obj3 = new construct(90,60);
		
		
	}
	
}
