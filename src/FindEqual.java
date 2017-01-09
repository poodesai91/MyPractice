
public class FindEqual {

	
	private static int findEqual(int arr[],int n)
	
	{
	int i=0;
	int di=0;
	int dis[]=new int[n];
	while(i<n)
	{
		dis[di++]=arr[i++];
		if(i<n && arr[i]==arr[i-1])
			System.out.println(arr[i]);
			i++;
		
		
	}
	if(di%2==0)
	{
		return -1;
	}
	else
	{
		return (dis[di/2]);
	}
	}
	
//	private static final findEqual(int arr[],int n)
//	{
//		Set<>
//		
//	}
	
	public static void main(String[] args) {
		
		int arr[]={1, 2, 3, 4, 4, 5, 6, 6, 6, 7};
		int n=arr.length;
		int index=findEqual(arr,n);
		if(index !=-1)
		System.out.println(arr[index]);
		else
			System.out.println("-1");
		// TODO Auto-generated method stub

	}

}
