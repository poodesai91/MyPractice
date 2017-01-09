
public class SmallestSubArray {
	
	
	
	int findtheSubset(int arr[],int n,int x)
	{
		int min_len=n-1,curr_sum=0;
		int start=0,end=0;
		while(end<n)
		{
			while(curr_sum<=x && end<n)
			{
				curr_sum+=arr[end++];
				while(curr_sum>x&&start<n)
				{
					if(end-start<min_len)
					{
						min_len=end-start;
					}
					curr_sum-=arr[start++];
				}
			}
		}
		return min_len;
		
		
	}

	public static void main(String[] args) {
		int arr[]={1, 4, 45, 6, 0, 19};
		int n=arr.length;
		int x=51;
		SmallestSubArray smallestSubArray=new SmallestSubArray();
		smallestSubArray.findtheSubset(arr,n,x);
		// TODO Auto-generated method stub

	}

}
