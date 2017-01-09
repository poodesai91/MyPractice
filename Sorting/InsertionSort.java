
public class InsertionSort {
	
	
	public void insertion(int arr[],int n)
	{
		for(int j=1;j<n;j++)
		{
			int key=arr[j];
			int i=j-1;
			while(i>=0 && arr[i]>key)
			{
				arr[i+1]=arr[i];
				i=i-1;
			}
			arr[i+1]=key;
		}
	}
	
	void print(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		
		InsertionSort s =new InsertionSort();
		int arr[]={2,1,6,5,4,7,8,9};
		int n=arr.length;
		s.insertion(arr,n);
		s.print(arr,n);
		// TODO Auto-generated method stub

	}

}
/*IMPORTANT*/
//this algorithm uses O(n^2)complexity because it has (n-1)comparisons and (n-1)movements in worst case.
