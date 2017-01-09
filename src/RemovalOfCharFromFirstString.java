
public class RemovalOfCharFromFirstString {
	
	
	private static String removeCharacters(String s1,String s2)
	{
		int i=0;
		String temp="";
		while(i<s1.length())
		{
			for(int j=0;j<s2.length();j++){
				if(s1.charAt(i)==s2.charAt(j))
				{
					s1=s1.replace(s1.charAt(i), '0');
				}
			}
			++i;
		}
		for(int k=0;k<s1.length();k++)
		{
			if(s1.charAt(k)!='0')
			{
				temp+=s1.charAt(k);
			}
		}
		
		return temp;
	}

	public static void main(String[] args) {
		
		String s1="geeksforgeeks";
		String s2="mask";
		String result=removeCharacters(s1,s2);
		System.out.println(result);
		
		// TODO Auto-generated method stub

	}

}
