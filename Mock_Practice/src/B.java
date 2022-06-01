
public class B extends A
{
	public void charcount()
	{
		int a=0;
		String str="Amol Ballal";
		for(char ch:str.toCharArray())
		{
			if(ch=='l')
			{
				a++;
			}
		}
		System.out.println("String Contains l "+a+" times");
	}
	public void charandspec()
	{	int sp=0,up=0,lo=0,num=0;
		String str="Jitendra Sudhakar Chavan @11 $#@";
		for(char ch:str.toCharArray())
		{
			if((ch>=33 &&ch<=47)||(ch>=58 &&ch<=64)||(ch>=91 &&ch<=96)||(ch>=123 &&ch<=126))
			{
				sp++;
			}
			if(ch>=48 &&ch<=57)
			{
				num++;
			}
			if(ch>=65 &&ch<=90)
			{
				up++;
			}
			if(ch>=97 &&ch<=122)
			{
				lo++;
			}
			
		}
		System.out.println("Special=>" +sp);
		System.out.println("Number=>" +num);
		System.out.println("Upper=>" +up);
		System.out.println("Lower=>" +lo);
	}
	public static void main(String[] args) 
	{
		B b=new B();
		//b.charcount();
		b.charandspec();
	}
}
