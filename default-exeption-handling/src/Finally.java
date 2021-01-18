
public class Finally {

	public static void main(String[] args) {

//case 1: No exception raised
		try
		{
			System.out.println("try");
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("finally");
		}
System.out.println("-------------------------------------------");
//case 2:  exception raised and handled
				try
				{
					System.out.println("try");
					System.out.println(10/0);
				}
				catch(ArithmeticException e)
				{
					System.out.println("catch");
				}
				finally
				{
					System.out.println("finally");
				}
				System.out.println("-------------------------------------------");
//case 3: exception raised but not handled
				try
				{
					System.out.println("try");
					//System.out.println(10/0);
				}
				catch(NullPointerException e)
				{
					System.out.println("catch");
				}
				finally
				{
					System.out.println("finally");
				}
				System.out.println("-------------------------------------------");
//case 4: exception raised but not handled
				try
				{
					System.out.println("try");
					System.exit(0);
				}
				catch(NullPointerException e)
				{
					System.out.println("catch");
				}
				finally
				{
					System.out.println("finally");
				}

	}

}
