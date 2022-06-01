import java.util.Scanner;

public class A 
{
	public A()
	{
		System.out.println("Constructor Of A");
	}
	public void pallindrome()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Any Number=>");
		int num =s.nextInt();
		int temp=num;
		int rev=0,rem;
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println(rev+" Number is Pallindrome");
		}
		else
		{
			System.out.println(rev+" Number Is Not Pallindrome");
		}
	}
	public void prime()
	{
		int num=11;
		int rem=0;
		for(int i=2;i<num;i++)
		{
			rem=num%i;
		}
		if(rem==0)
		{
			System.out.println("Number is Not Prime");
		}
		else
		{
			System.out.println("Number is Prime");
		}
	}
	public static void main(String[] args) 
	{
		A a=new A();
		//a.pallindrome();
		a.prime();
	}
}
