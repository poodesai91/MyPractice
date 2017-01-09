
public class LengthOfLargestSubArray {
	
	
	int min(int x,int y)
	{
		return(x<y)?x:y;
		
	}
	int max(int x,int y)
	{
		return(x>y)?x:y;
	}
	
	
	int findLength(int arr[],int n)
	{
		int max_length=1;
		for(int i=0;i<n-1;i++)
		{
			int mn=arr[i];
			int mx=arr[i];
			for(int j=i+1;j<n;j++)
			{
				mn=min(mn,arr[j]);
				mx=max(mx,arr[j]);
				if((mx-mn)==j-i)
					max_length=max(max_length,mx-mn+1);
			}
		}
		return max_length;
	}

	public static void main(String[] args) {
		
		int arr[]={1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
		int n=arr.length;
		LengthOfLargestSubArray lengthOfLargestSubArray=new LengthOfLargestSubArray();
		int res=lengthOfLargestSubArray.findLength(arr,n);
		System.out.println(res);
				
		// TODO Auto-generated method stub

	}

}
