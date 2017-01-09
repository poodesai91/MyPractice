import java.util.Scanner;

public class ReversalOfAnArray {
	
	
	static Boolean isAlphabet(char c)
	{
		return((c>='A'&& c<='Z')||(c>='a'&&c<='z'));
		
	}
	
	static void swap(char low,char high)
	{
		char temp=low;
		low=high;
		high=temp;
	}
	
	
	static void reverse(char str[])
	{
		int n=str.length;
		int low=0;
		int high=n-1;
		while(low<high)
		{
			if(!isAlphabet(str[low])){
				low++;
			}
			else if(!isAlphabet(str[high]))
			{
				high--;}
			else
			{
				char temp=str[low];
				str[low]=str[high];
				str[high]=temp;
				low++;
				high--;
			}
			
		}
		for(int i=0;i<str.length;i++)
		   {
			   System.out.print(str[i]);   
		   }
		//System.out.println();
		
	}

	public static void main(String[] args) {
      String str="a!!!b.c.d,e'f,ghi";
      char c[]=str.toCharArray();
     reverse(c);
   
     
		
		// TODO Auto-generated method stub

	}

}
