 
public class ArrayAscending
{
	public static void main(String[] args) 
	{	int i,j,temp=0;
		int arr[]= {25,12,96,41,30,45};
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
				}		
					
			}
			
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		
	}
}
