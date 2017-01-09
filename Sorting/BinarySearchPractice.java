
public class BinarySearchPractice {
	
	
	public int binarySearch(int a[],int s,int n,int l)
	{
		
		if(n<1)
			return -1;

		int mid=(n+l)/2;
		if(a[mid]==s)
		{
		return mid;
		}
		else if(s<a[mid])
		{
			n=mid-1;
			return binarySearch(a, s, n,l);
		}
		else if(s>a[mid])
		{
			l=mid+1;
			return binarySearch(a, s, n, l);
		}
		return mid;
	}

	public static void main(String[] args) {
		BinarySearchPractice p=new BinarySearchPractice();
		int a[]={9,3,2,4,5,6,7,1};
		int n=a.length;
		int s=4;
		int mid=p.binarySearch(a,s,n-1,0);
		System.out.println(mid);
		// TODO Auto-generated method stub

	}

}
