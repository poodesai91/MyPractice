
public class summation {
	
	
	public void closestpair(int arr[],int n,int x)
	{
		int res_l=0;
		int res_r=0;
		int l=0,r=n-1,diff=Integer.MAX_VALUE;
		while(r>l)
		{
			if(Math.abs(arr[l]+arr[r]-x)<diff)
			{
				res_l=l;
				res_r=r;
				diff=Math.abs(arr[l]+arr[r]-x);
			}
			
			if(arr[l]+arr[r]>x)
			{
				r--;
				
			}
			else
				l++;
		}
		
		
		System.out.println("The pair is "+arr[res_l]+" and "+arr[res_r]);
	}

	public static void main(String[] args) {
		summation s=new summation();
		int arr[]={10,22,28,29,30,20};
		int x=54;
		int n=arr.length;
		s.closestpair(arr,n,x);
		// TODO Auto-generated method stub

	}

}
