package firstMock;
import java.util.*;
public class Test1 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter Number=>");
		int range=s.nextInt();
		int num1=0,num2=1,num3;
		System.out.print(num1+" "+num2+" ");
		for(int i=2;i<=range-2;i++)
		{
			num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
		}
		s.close();
	}
}
