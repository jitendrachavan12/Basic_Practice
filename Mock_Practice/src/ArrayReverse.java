
public class ArrayReverse
{
	public static void main(String[] args) 
	{
		int arr[]= {50,63,84,12,96,25,145};
		System.out.println("Array Before reverse=>");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println("Array After Reverse=>");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(" "+arr[i]);
		}
	}
}
