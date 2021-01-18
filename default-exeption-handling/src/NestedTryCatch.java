
public class NestedTryCatch {

	public static void main(String[] args)
	{
		try
		{
			System.out.println("outer try");
			try
			{
				System.out.println("inner try");
				System.out.println(10/0);
			}
			catch(NullPointerException e)
			{
				System.out.println("inner catch");
			}
			System.out.println("outer inner try catch");
		}
		catch(NullPointerException e )
		{
			System.out.println("outer catch");
		}
		finally
		{
			System.out.println("outer finally");
		}

	}

}
