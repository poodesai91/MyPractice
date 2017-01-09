
public class XorUnique {

	public static void main(String[] args) {
		int arr[]={1,2,3,2,3,1,4,5};
		int num=arr[0];
		for(int i=0;i<8;i++)
		{
			num^=arr[i];
		
			System.out.println(num);
		}
		
		// TODO Auto-generated method stub

	}

}
