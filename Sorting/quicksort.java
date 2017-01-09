
public class quicksort {
	
	
	
	public int partition(int a[],int p,int r)
	{
		int i=p-1;
		int x=a[r];
		for(int j=p;j<=r-1;j++)
		{
			if(a[j]<=x)
			{
				i++;
				int temp=a[i];

				a[i]=a[j];
				a[j]=temp;
				
			}
		}
		int temp=a[i+1];
		a[i+1]=a[r];
		a[r]=temp;
		
		return i+1;
	}
	
	
	
	public void sort(int a[],int p,int r)
	{
		if(p<r)
		{
			int q=partition(a,p,r);
			sort(a,p,q-1);
			sort(a,q+1,r);
		}
			
	}
	
	public void print(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		quicksort q=new quicksort();
		int a[]={5,6,7,1,2,3,4};
		int n=a.length;
		q.sort(a,0,n-1);
		q.print(a);
		
		// TODO Auto-generated method stub

	}

}
