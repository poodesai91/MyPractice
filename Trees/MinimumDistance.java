import java.util.LinkedList;
import java.util.Queue;

public class MinimumDistance {
	
	TreeNode root;

	
	public int minDepth(TreeNode root)
	{
		
		if(root==null)
			return 0;
		if(root.right==null && root.left==null)
			return 1;
LinkedList<TreeNode>nodes=new LinkedList<>();
LinkedList<Integer>counts=new LinkedList<>();
nodes.add(root);
counts.add(1);
while(!nodes.isEmpty())
{
	TreeNode curr=nodes.remove();
	int count=counts.remove();
	if(curr.left==null && curr.right==null)
		return count;
	if(curr.left!=null)
		nodes.add(root.left);
	counts.add(count+1);
	if(curr.right!=null)
		nodes.add(root.right);
	counts.add(count+1);
	
}
return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumDistance min=new MinimumDistance();
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		int res=min.minDepth(root);
		System.out.println(res);
		
		
		
		

	}

}
