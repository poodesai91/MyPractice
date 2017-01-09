
public class isPreOrder {
	
	
	
	public int isCheck(int arr[],int n)
	{
		int s=arr[0];
		int res=1;
		if(arr[n-1]<s){
			return 0;
		}
		else
		{
			int i=1;
			while(i<n-1)
			{
				if((arr[i]>n && arr[i]>arr[i-1])||(arr[i]>n && arr[i]<arr[i-1]))
				i++;
				
				
				else if((arr[i]<n && arr[i]>arr[i-1])||(arr[i]<n && arr[i]<arr[i-1]))
				i++;
				
				else
					res=0;
				
			}
		}
		return res;
		
		
	}

	public static void main(String[] args) {
		
		
		isPreOrder p=new isPreOrder();
//		TreeNode n=new TreeNode(2);
//		n.right=new TreeNode(4);
//		n.right.left=new TreeNode(3);
		int arr[]={40,30,35,20,80,100};
		int n=arr.length;
		int res=p.isCheck(arr,n);
		if(res==0)
			System.out.println("false");
		else
			System.out.println("true");
		
		
		// TODO Auto-generated method stub

	}

}
