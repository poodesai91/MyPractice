
public class BubbleSort {
	
	public void bubblesort(int a[],int n)
	{
		for(int i=0;i<n-1;i++ )
		{
			boolean swapped =false;
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swapped=true;
				}
			}
			if(swapped==false)
				break;
		}
	}
	
	void printlist(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		BubbleSort l=new BubbleSort();
		int a[]={9,8,3,4,6,0};
		int n=a.length;
		l.bubblesort(a,n);
		l.printlist(a,n);
		// TODO Auto-generated method stub

	}

}
