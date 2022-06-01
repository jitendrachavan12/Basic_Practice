package firstMock;

public interface W3 
	{
		static void w3()
		{
			System.out.println("We can declare and define complete method in interface ");
			System.out.println("but it should be static in nature");
			
		}
		 default void a3()
		{
			System.out.println("It is also possible to declare complete default method in interface");
			System.out.println("But the method must be Default");
			b3();
		}
		private void b3()
		{
			System.out.println("Its private method of Interface");
		}
		public static void main(String[] args) 
		{
			System.out.println("Its is possible to declare main method in Interface");
			w3();
			
		}
	}
