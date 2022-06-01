package task;

import java.util.Scanner;

public class PallindromeNumber
{
	private PallindromeNumber()
	{
		int b=9;
	}
	int num=123;
	int temp=num;
	int rev;
	int rem;
	public void palindrome()
	{
		
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			
		}
		if(temp==rev)
		{
			System.out.println(temp+" is Palindrome");
		}
		else
		{
			System.out.println(temp+" is not Palindrome");
		}
	}
	public static void main(String[] args) 
	{
		PallindromeNumber p=new PallindromeNumber();
		p.palindrome();
	}
}
