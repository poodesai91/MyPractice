
public class CheckIfAnagrams {
	
	boolean Anagrams(String str1,String str2)
	
	{
		if(str1.length() !=str2.length())
		{
			return false;
		}
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			inner:for(int j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					count++;
					break inner;
				}
			}
		}
		if(count==str1.length())
		{
			return true;
		}
		return false;
	}
	

	public static void main	(String[] args) {
		String str1="actaa";
		String str2="caaat";
		CheckIfAnagrams check=new CheckIfAnagrams();
		 boolean bool=check.Anagrams(str1,str2);
		 System.out.println(bool);
		
	
		

		
		

}
}
