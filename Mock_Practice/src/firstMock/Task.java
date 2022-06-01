package firstMock;

import java.util.Scanner;

public class Task
{
	//36 96 125 336 11 199 211 444 777
	

	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter 10 Number to get Average =>");
		for(int a=0;a<10;a++)
		{
		arr[a]=s.nextInt();
		}
		//float number[]= {36,96,125,336,11,199,211,444,777};
		float num=0;
		for(int i=0;i<arr.length;i++)
		{
			num=num+arr[i];
		}
		float avg=num/arr.length;
		System.out.println("Average of 10 Number is =>"+avg);
	}
	
}
