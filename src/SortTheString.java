
public class SortTheString {
	
	public static void sortByPattern(String pat,String str)
	{
		int count[]=new int[26];
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)-'a']++;
		}
		int index=0;
		for(int i=0;i<pat.length();i++)
		{
			for(int j=0;j<count[pat.charAt(i)-'a'];j++)
			{
				//str.charAt(index++)=pat[i];
			}
		}
	}

	public static void main(String[] args) {
		
		String pat="bca";
		String str="abc";
		sortByPattern(pat,str);
				
		// TODO Auto-generated method stub

	}

}
