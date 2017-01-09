import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;



public class PrintDuplicates {

	public static void main(String[] args) {
		String str="geeksforgeeks";
		char ch[]=str.toCharArray();
		Map<Character,Integer>count=new HashMap<>();
		
		
		for(char value:ch)
		{
			if(Character.isAlphabetic(value))
			{
				if(count.containsKey(value))
				{
					count.put(value,count.get(value)+1);
				}
				else
				{
					count.put(value, 1);
				}
			}
		}
		for(Map.Entry<Character, Integer> entry : count.entrySet())
		{
			if(entry.getValue()==1)
			{
			System.out.println(entry.getKey()+"="+entry.getValue());
			}
		}
//		System.out.println(count);
		
//		for(int i=0;i<str.length();i++)
//		{
//			char c=str.charAt(i);
//			if(count.containsKey(c))
//			{
//				int cnt=count.get(c);
//				count.put(c, cnt++);
//			}
//			else
//			{
//				count.put(c, 1);
//			}
//		}
//		for(Map.Entry<Character, Integer> entry : count.entrySet())
//		{
//			if(entry.getValue()>1)
//			{
//			System.out.println(entry.getKey()+"="+entry.getValue());
		
		
//		}
		}
		
		
		


		

		
		
		
		// TODO Auto-generated method stub

	}


