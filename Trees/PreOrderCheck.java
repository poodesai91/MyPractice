import java.util.Stack;

public class PreOrderCheck {
	
	
	boolean canRepresentBST(int arr[],int n)
	{
		Stack<Integer>stack=new Stack<Integer>();
		//initialise root to min possible value
		int root=Integer.MIN_VALUE;
		
		//traverse the array
		for(int i=0;i<n;i++)
		{
			if(arr[i]<root)
				return false;
			while(!stack.isEmpty()&& stack.peek()<arr[i])
			{
				root=stack.peek();
				stack.pop();	
			}
			stack.push(arr[i]);
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PreOrderCheck p=new PreOrderCheck();
		//int pre[]={40,30,35,80,100};
		int pre[]={2,4,3};
		int n=pre.length;
		if(p.canRepresentBST(pre,n)==true)
			System.out.println("true");
		
		if(p.canRepresentBST(pre,n)==false)
			System.out.println("false");

	}

}
