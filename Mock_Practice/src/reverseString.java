
public class reverseString
{
	public static void main(String[] args)
	{
		String abc="Jitendra";
		for(int i=abc.length()-1;i>=0;i--)
		{
			char temp=abc.charAt(i);
			System.out.print(temp);
		}
	}


}
