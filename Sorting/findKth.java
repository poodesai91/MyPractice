
public class findKth {
	
	
	
	public void minheap(int arr[],int n)
	{
		for(int i=(n/2)-1;i>=0;i--)
		{
			heapify(arr,n,i);
		}
		
	}
	
	public void heapify(int arr[],int n,int i)
	{
		int smallest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<n && arr[left]<arr[smallest])
			smallest=left;
		
		if(right<n && arr[right]<arr[smallest])
			smallest=right;
		
		if(smallest!=i)
		{
			int temp=arr[i];
			arr[i]=arr[smallest];
			arr[smallest]=temp;
			heapify(arr, n, smallest);
			
		}
		
		
	}
	
	
	public int extractmin(int arr[],int n)
	{
		if(n==0)
			return Integer.MAX_VALUE;
		
			int root = arr[0];
			if(n>1)
			{
				arr[0]=arr[n-1];
				heapify(arr, n, 0);

			}
			n--;
			return root;
		
	}
	public  int findKthSmallest(int arr[],int n,int k)
	{
		minheap(arr,n);
		int min=0;
		for(int i=0;i<=k-1;i++)
		{
			 min=extractmin(arr,n);
		}
		
		return min;
	}

	public static void main(String[] args) {
		
		findKth kt=new findKth();
		
		int arr[]={23,34,12,5,6,7,8,9,0};
		int n=arr.length;
		int k=4;
		int answer=kt.findKthSmallest(arr,n,k);
		System.out.println(answer);
		// TODO Auto-generated method stub

	}

}
