
public class DefaultExceptionHandling3 {
	
	public static void main(String[] args)
	{
		doStuff();
		System.out.println(10/0);
	}
	public static void doStuff()
	{
		doMoreStuff();
		//System.out.println(10/0);
		System.out.println("Hello");
	}
	public static void doMoreStuff()
	{
		System.out.println("Hello");
		//System.out.println(10/0);
	}

}
