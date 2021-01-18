import java.util.ArrayList;
import java.util.Iterator;

public class Top10Exceptions {

	/*public static void m1()
	{
		m2();
	}
	
	public static void m2()
	{
		m1();
	}
	*/
	//static int a=10/0;
//	static
//	{
//		String s=null;
//		System.out.println(s.length());
//	}
	
	public static void main(String[] args) {
		/*ArrayIndexOutOfBoundsException
		int[] a=new int[10];
		System.out.println(a[10]);
		*/
		//int x=10/0;
		
		/*NullPointerException
		String name="Jithendra";
		System.out.println(name.length());
		String address=null;
		System.out.println(address.length());
		*/
		
		//StackOverFlowError
		//m1();
		
		/*ClassCastException
		String s=new String("jithendra");
		Object o=(Object)s;
		System.out.println(o);
		
		Object object=new String("jithu");
		String string=(String)object;
		System.out.println(string);
		
		Object o1=new Object();
		String s1=(String)o1;
		*/
		
		//ExceptionInInitializerError
		
		//IllegalArgumentException
		
//		Thread t=new Thread();
//		t.setPriority(10);
		//t.setPriority(100);
		
		//NumberFormatException
//		int i=Integer.parseInt("10");
//		System.out.println(i);
//		int i1=Integer.parseInt("ten");
//		System.out.println(i1);
		
		//IllegalStateException
//		Thread t=new Thread();
//		t.start();
//		t.start();
		
		/*ArrayList<String> l=new ArrayList<>();
		l.add("A");
		l.add("B");
		l.add("C");
		System.out.println(l);
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			//Object obj=i.next();
			i.remove();
		}
		System.out.println(l);
		*/
		
		int x=10;
		
		assert(x>10);
		
		

	}

}
