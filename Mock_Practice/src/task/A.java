package task;

public class A
{
	static
	{
		System.out.println("hiii");
	}
	{
		System.out.println("hello");
	}
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m2");
	}
	public static void main(String[] args)
	{
		System.out.println("welcome");
		A a=new A();
		a.m1();
		A aa=new A();
		aa.m2();
		
	}
	
}
