
public class ArrayRev 
{
	public static void main(String[] args) 
	{
		int i,j,a;
		int data[]= {20,90,40,80,30,10,70};
		for(i=0;i<data.length;i++)
		{
			System.out.print(" "+data[i]);
		}
		System.out.println("\nArray Element After Reverse=>");
		a=data.length-1;
		for(i=0;i<data.length;i++)
		{			
			for(j=a;j>data.length-1;)
			{
			data[i]=data[j];
			}
			a--;
			System.out.print(" "+data[j]);
		}
	}
}
