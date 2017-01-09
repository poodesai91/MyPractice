import java.util.HashSet;
import java.util.Set;

public class DistinctStrings {
	
	
	public String encodeString(String str)
	{
		int hashEven[]=new int[26];
		int hashOdd[]=new int[26];
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(i%2!=0)
				hashOdd[c-'a']++;
			else
				hashEven[c-'a']++;	
			
		}
		String encoding="";
		for(int i=0;i<26;i++)
		{
			encoding+=String.valueOf(hashEven[i]);
			encoding+='-';
			encoding+=String.valueOf(hashOdd[i]);
			encoding+='-';	
		}
		return encoding;
		
	}
	
	
	
	public int countDistinct(String input[],int n)
	{
		int countDistinct=0;
		Set<String>s=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			Boolean bool=s.add(encodeString(input[i]));
			if(bool==true)
			{
			countDistinct++;
			}
		}
		return countDistinct;
		
	}

	public static void main(String[] args) {
		
		String input[]={"abcd", "acbd", "adcb", "cdba",
                "bcda", "badc"};
//		String input[]={"abc","cba"};
		int n=input.length;
		DistinctStrings distinctStrings=new DistinctStrings();
		int res=distinctStrings.countDistinct(input, n);
		System.out.println(res);
		
		
		// TODO Auto-generated method stub

	}

}
