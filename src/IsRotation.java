
public class IsRotation {
	
	
	static boolean isRotate(String s1,String s2)
	{
		String temp=s1+s1;
		if(temp.contains(s2))
		return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		String s1="ABCD";
		String s2="CDAB";
		Boolean ans=isRotate(s1,s2);
		System.out.println(ans);
				
		// TODO Auto-generated method stub

	}

}
