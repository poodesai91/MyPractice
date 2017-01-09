
public class ReverseOfStringRecursion {
	
	public static void recursion(char s[],int i)
	{
		if(i<s.length)
		{
			

			recursion(s,i+1);
			System.out.print(s[i]);
			System.out.print("");
			
		}
		

	}
	public static void main(String args[])
	{
		String str="GeeksForGeeks";
		char c[]=new char[str.length()];
		c=str.toCharArray();
		recursion(c,0);
	}

}
