
public class isFullBinaryTree {
	TreeNode root;
	
	
	
	public boolean isFullTree(TreeNode root)
	{
		if(root==null)
			return true;
		if(root.left==null && root.right==null)
			return true;
		if(root.left!=null && root.right !=null)
			return (isFullTree(root.left))&&
					(isFullTree(root.right));
		return false;
		
							
	}

	public static void main(String[] args) {
		isFullBinaryTree tree = new isFullBinaryTree();
        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(20);
        tree.root.right = new TreeNode(30);
        tree.root.left.right = new TreeNode(40);
        tree.root.left.left = new TreeNode(50);
        tree.root.right.left = new TreeNode(60);
        tree.root.left.left.left = new TreeNode(80);
        tree.root.right.right = new TreeNode(70);
        tree.root.left.left.right = new TreeNode(90);
        tree.root.left.right.left = new TreeNode(80);
        tree.root.left.right.right = new TreeNode(90);
        tree.root.right.left.left = new TreeNode(80);
        tree.root.right.left.right = new TreeNode(90);
        tree.root.right.right.left = new TreeNode(80);
        tree.root.right.right.right = new TreeNode(90);
          
        if(tree.isFullTree(tree.root))
            System.out.print("The binary tree is full");
        else
            System.out.print("The binary tree is not full"); 
		// TODO Auto-generated method stub

	}

}
