
public class Testing {

	public static void main(String[] args) {
	transform("this_is_a_variable");

	}
	
	public static void transform(String str)
	{
		char[] c=str.toCharArray();
		System.out.println(c);
		//char[] c1=[];
		for(int i=0;i<c.length;i++)
		{
			//System.out.println(c[i]);
			if(c[i]=='_')
			{
				
				System.out.println(Character.toUpperCase(c[i+1]));	
				
			}
			
			//s+=c[i];
			
		}
		//System.out.println(s);
	}

}
