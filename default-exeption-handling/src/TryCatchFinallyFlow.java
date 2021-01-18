
public class TryCatchFinallyFlow {

	public static void main(String[] args) {
		try
		{
			System.out.println("statement-1");
			System.out.println("statement-2");
			///System.out.println(10/0);
			System.out.println("statement-3");
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println(1/0);
		}
		System.out.println("statement-6	");

	}

}
