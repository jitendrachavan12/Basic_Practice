package task;

import java.util.Arrays;

public class LargeNumber 
{
	int i;
	int num[]= {565,1234,67,0,9,45,165};	
	int gretest[];
	int lowest[];
	public void sort()
	{
		Arrays.sort(num);
		//{0,9,45,67,165,565,1234}
		for(i=0;i<num.length-1;i++)
		{
			//index=0//size=7//0,1,2,3,4,5,6
		}
		System.out.println(num[i]);
	}
	public static void main(String[] args) 
	{
		LargeNumber l=new LargeNumber();
		l.sort();
	//	PallindromeNumber pp=new PallindromeNumber();
	}
}
