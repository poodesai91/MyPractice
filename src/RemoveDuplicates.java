import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	void removeDuplicates(String str)
	{
		LinkedHashSet<Character>ll=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			ll.add(str.charAt(i));
		}
		for(Character ch:ll)
		{
			System.out.print(ch);
		}
		
	}

	public static void main(String[] args) {
		
		String str="geeksforgeeks";
		RemoveDuplicates r=new RemoveDuplicates();
		r.removeDuplicates(str);
		// TODO Auto-generated method stub

	}

}
