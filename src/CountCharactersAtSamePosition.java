import java.util.Scanner;

public class CountCharactersAtSamePosition {
	
	private int countCharacterAtSamePosition(String str)
	{
		int count=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
//			char c=str.charAt(i);
//			int ascii=(int)c;
//			int num=ascii-97;
			if(i==str.charAt(i)-'a')
			{
				count++;
			}
			
		}
		return count;
	}
	
	
	

	public static void main(String[] args) {
		
//		Accepting input
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		CountCharactersAtSamePosition c=new CountCharactersAtSamePosition();
		int count=c.countCharacterAtSamePosition(str);
		System.out.println(count);
				
		
		// TODO Auto-generated method stub

	}

}
