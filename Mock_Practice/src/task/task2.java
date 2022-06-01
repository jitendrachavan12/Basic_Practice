package task;

import java.util.Scanner;

public class task2
{
//	public static void main(String[] args) 
//	{
//		Scanner s=new Scanner(System.in);
//		String actualString="29AACCC6016B1Z4";
//		String checkString="AACCC6016B";
//		boolean result=actualString.contains(checkString);
//		System.out.println(result);
//	}
	static String t[]=new String[2];
	public static boolean validate(String pan,String gstn)
	{
		pan=t[0];
		gstn=t[1];
		if(pan.contains(gstn))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Input String=>");
		t[0]=input.nextLine();
		String a=t[0];
		System.out.println(a);
		
		System.out.println(t[0].split(","));
		while(input.hasNextLine())
		{
			//String t[]=input.nextLine().split(",");
			System.out.println(validate(t[0],t[1]));
		}
	}
}
