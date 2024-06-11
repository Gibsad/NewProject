
class student {
	int age=10;
	int roll=20;
	public void message1()
	{
		System.out.println("Automation is easy");
	}
	public void message2()
	{
		System.out.println("welcome to everyone");
	}
	public void age()
	{
		System.out.println("age:"+age);
	}
	public void roll()
	{
		System.out.println("rollno"+roll);
	}
	

public static void main(String[] args)
{
	student std=new student();
	std.message1();
	std.message2();
	std.age();
	std.roll();
}
	

}
