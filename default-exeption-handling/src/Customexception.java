class TooYoungException extends RuntimeException
{
	TooYoungException(String msg)
	{
		super(msg);
	}
}

class TooOldException extends RuntimeException
{
	TooOldException(String msg)
	{
		//super(msg);
	}
}
public class Customexception {

	public static void main(String[] args) {
		int age=Integer.parseInt(args[0]);
		if(age>60)
		{
			throw new TooOldException("Too old for marriage");
		}
		else if(age<18)
		{
			throw new TooYoungException("Too young for marriage");
		}
		else
		{
			System.out.println("Thanks for the registration");
		}

	}

}
