package firstMock;

class AD extends AE implements W1,W2,W3
{
public void name()
	{	
	System.out.println("Welcome jitendra");
	}
	public void w1()
	{
		System.out.println("w1 method from interface W1");
	}
	public void w2()
	{
		System.out.println("w2 method from interface W2");
	}
	public void w3()
	{
		System.out.println("w3 method from interface W3");
	}
public static void main(String[] args) 
	{
		AD a=new AD();
		a.name();
		a.m1();
		a.w1();
		a.w2();
		a.w3();
		a.a3();
	
	}
}
