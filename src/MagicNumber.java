
public class MagicNumber {
	
	
	int magicNumber(int n)
	{
		int pow=1,ans=0;
		//String num=Integer.toBinaryString(n);
		//int len=num.length();
		//int i=0;
		while(n>0)
		{
			pow=pow*5;
			if((n&1)==1)
				ans+=pow;
			n>>=1;
		}
		return ans;
	}

	public static void main(String[] args) {
		
		int n=5;
		MagicNumber magicNumber=new MagicNumber();
		int res=magicNumber.magicNumber(n);
		System.out.println(res);
		// TODO Auto-generated method stub

	}

}
