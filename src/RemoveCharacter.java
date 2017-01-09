
public class RemoveCharacter {
	
	 static Boolean isCheck(String subString)
	{
		int low=0;
		int high=subString.length()-1;
		while(low<high)
		{
			if(subString.charAt(low)!=subString.charAt(high))
			{
				return false;
			}
			low++;
			high--;
		}
		return true;
	}
	
	
	public static int isPalindrome(String str)
	{
		
	  int low=0;
	  int high=str.length()-1;
	  while(low<high){
				 if(str.charAt(low)==str.charAt(high))
				 {
					 low++;
				     high--;
				 }
				     else
				     {
				    	if( isCheck(str.substring(low+1, high+1)))
				    	 return low;
				     

					 if(isCheck(str.substring(low,high)))
					 return high;
					 return -1;
				 }
				  
				  
			  }
	return -2;

	
	}

	public static void main(String[] args) {
		String str="abecbea";
		
		int res=isPalindrome(str);
		if(res==-1)
		System.out.println("Not possible");
		else if(res==-2)
			System.out.println("Possible without removing the letters");
		else
		{
			System.out.println("Possible by removing the character "+res);
		}
		// TODO Auto-generated method stub

	}

}
