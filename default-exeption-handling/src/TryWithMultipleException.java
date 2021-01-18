
public class TryWithMultipleException {

	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		//not a good practice
//		catch(Exception e)
//		{
//			System.out.println("Exception");
//		}
		catch(ArithmeticException e1)
		{
			System.out.println("Arithmetic Exception");
		}
//		catch(ArithmeticException e1)
//		{
//			System.out.println("Arithmetic Exception");
//		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}

	}

}
