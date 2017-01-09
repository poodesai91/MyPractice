
public class BinarySearchIterative {
	
	
	public int binarySearch(int a[],int target,int h,int l)
	{
		if(h<1)
		{
			return -1;
		}
		while(l<h)
		{
		int mid=(l+h)/2;
		if(a[mid]==target)
			return mid;
		else if(target<a[mid])
		{
			h=mid-1;
//			while(l<h)
//			{
//				if(a[mid]==target)
//				{
//					return mid;
//				}
//				l++;
//				
//			}
		}
			else
				l=mid+1;
//				if(target>a[mid])
//			{
//				
//				l=mid+1;
//				while(l<h)
//				{
//				if(a[mid]==target)
//				{
//					return mid;
//				}
//				l++;
				mid=(l+h)/2;
			}
			
		
		return l;
	}

	public static void main(String[] args) {
		
		BinarySearchIterative obj=new BinarySearchIterative();
		int a[]={9,3,2,4,5,6,7,1};
		int n=a.length;
		int s=4;
//		int mid=p.b(a,s,n-1,0);
		int mid=obj.binarySearch(a, s, n-1, 0);
		System.out.println(mid);
		// TODO Auto-generated method stub

	}

}
