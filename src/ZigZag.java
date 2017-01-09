
public class ZigZag {
	
	static void swap(int x,int y)
	{
		int temp=x;
		x=y;
		y=temp;
	}

	
	static void zigzag(int arr[],int n)
	{
		Boolean flag=true;
		for(int i=0;i<=n-2;i++)
		{
			if(flag)
				if(arr[i]>arr[i+1])
				{
					int tem=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=tem;}
			
		
		
		
				else if(arr[i]<arr[i+1])
			{
					int tem=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=tem;
		
			}
			flag=!flag;
		}
		
	}

	static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[]={4, 3, 7, 8, 6, 2, 1};
		int n=arr.length;
		zigzag(arr,n);
		printArray(arr);
		// TODO Auto-generated method stub

	}

}
