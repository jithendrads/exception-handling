
public class TryCatch {

	public static void main(String[] args) {
		System.out.println("Statement-1");
		try {
			System.out.println(10/0);
			System.out.println("Statemet aftee excetion");
		}
		catch(ArithmeticException e)
		{
			try {
			System.out.println(5/0);
			}
			catch(ArithmeticException e1)
			{
				System.out.println(4/2);
			}
		}
		
		System.out.println("Statement-3");

	}

}
