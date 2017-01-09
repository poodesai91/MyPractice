
public class SmallestValue {
	
	
	int findSmallestValue(int arr[],int n)
	{
		int res=1;
		for(int i=0;i<n&&res>=arr[i];i++)
		{
			res=res+arr[i];
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[]={1,3,6,10,11,12};
		int n=arr.length;
		SmallestValue smallestValue=new SmallestValue();
		int value=smallestValue.findSmallestValue(arr,n);
		System.out.println(value);
		// TODO Auto-generated method stub

	}

}
