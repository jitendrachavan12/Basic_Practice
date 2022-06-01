package task;

import java.util.Scanner;

public class StringCount
{
	static int  count;
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String=>");
		String task=s.nextLine();
		
		if(task.contains("aa"))
		{			
			count=count+1;
			if(task.contains("aa"))
			{
				count=count+1;
			}
			if(task.contains("bb"))
			{
				count=count+1;
				if(task.contains("cc"))
				{
					count=count+1;
				}
			}
			System.out.println(count);
		}
		else
		{
			System.out.println(0);
		}

	}
}
