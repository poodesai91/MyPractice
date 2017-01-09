import java.util.HashSet;

public class LengthOfSubArrayWithDuplicates {
	
	
	int min(int x,int y)
	{
		return (x<y)?x:y;
	}
	int max(int x,int y)
	{
		return (x>y)?x:y;
	}
	
	
	int findSubArray(int arr[],int n){
		
		
		int max_length=1;
		for(int i=0;i<n-1;i++)
		{
			
			HashSet<Integer>set=new HashSet<>();
			set.add(arr[i]);
			int mn=arr[i],mx=arr[i];
			for(int j=i+1;j<n;j++)
			{
				if(set.contains(arr[j]))
					break;
				 mn=min(mn,arr[j]);
				 mx=max(mx,arr[j]);
				 if((mx-mn)==j-i)
					 return max_length=max(max_length,j-i+1);
			}
		}
		return max_length;
		
	}

	public static void main(String[] args) {
		
		int arr[]={12,14,12};
		int n=arr.length;
	    LengthOfSubArrayWithDuplicates lengthOfSubArrayWithDuplicates=new LengthOfSubArrayWithDuplicates();
	   int res= lengthOfSubArrayWithDuplicates.findSubArray(arr,n);
	   System.out.println(res);
		// TODO Auto-generated method stub

	}

}
