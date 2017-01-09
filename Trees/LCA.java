
public class LCA {
	
	TreeNode root;
	static boolean v1=false,v2=false;
	
	
	
	public TreeNode findLCAUtils(TreeNode root,int n1,int n2)
	{
		if(root==null)
			return null;
		if(root.data==n1)
		{
			v1=true;
			return root;
		}
		if(root.data==n2)
		{
			v2=true;
			return root;
		}
		
		TreeNode left=findLCAUtils(root.left, n1, n2);
		TreeNode right=findLCAUtils(root.right, n1, n2);
		if(left != null && right !=null)
		{
			return root;
		}
		if(left==null && right==null)
		{
			return null;
		}
		
		return left!=null?left:right;
	}
	
	public TreeNode findLCA (int n1,int  n2)
	{
		
		
		v1=false;
		v2=false;
		
		TreeNode lca=findLCAUtils(root,n1,n2);
		
		if(v1&&v2)
		{
		return lca;
		}
		return null;
		
		
	}

	public static void main(String[] args) {
		
		
		LCA l=new LCA();
		l.root=new TreeNode(1);
		l.root.left=new TreeNode(2);
		l.root.right=new TreeNode(3);
		l.root.left.left=new TreeNode(4);
		l.root.left.right=new TreeNode(5);
		l.root.right.left=new TreeNode(6);
		l.root.right.right=new TreeNode(7);
		TreeNode lca=l.findLCA(4,5);
		if(lca!=null){
			System.out.println(lca.data);
		}
		else
			System.out.println("The keys are not found");
		
		// TODO Auto-generated method stub

	}

}
