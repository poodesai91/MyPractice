
public class BinaryNumber {
	
	
	
	void getBinary(int n)
	{
		if(n>1)
			getBinary(n/2);
		System.out.print(n%2);
	}

	public static void main(String[] args) {
		BinaryNumber binaryNumber=new BinaryNumber();
		binaryNumber.getBinary(7);
		//System.out.println(res);
		// TODO Auto-generated method stub

	}

}
