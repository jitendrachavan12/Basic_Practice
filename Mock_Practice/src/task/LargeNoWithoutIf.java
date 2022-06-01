package task;

public class LargeNoWithoutIf 
{
	public static void main(String[] args)
	{
	int a=20;
	int b=50;
	int large=a>b?a:b;
	int small=a>b?b:a;
	System.out.println("Large No is=>"+large);
	System.out.println("small No is=>"+small);
	}
}
