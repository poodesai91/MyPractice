import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	
	TreeNode root;
	
	
	void printNode()
	{
		Queue<TreeNode>queue=new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			TreeNode tempNode=queue.poll();
			System.out.print(tempNode.data);
			if(tempNode.left!=null)
			{
				queue.add(tempNode.left);
			}
			if(tempNode.right!=null)
			{
				queue.add(tempNode.right);
			}
		}
		}

	public static void main(String[] args) {
		
		LevelOrderTraversal levelOrderTraversal=new LevelOrderTraversal();
		levelOrderTraversal.root=new TreeNode(1);
		//levelOrderTraversal.root.left=new TreeNode(2);
		levelOrderTraversal.root.right=new TreeNode(3);
		//levelOrderTraversal.root.left.left=new TreeNode(4);
		levelOrderTraversal.root.right.right=new TreeNode(5);
		
		
		levelOrderTraversal.printNode();
		//System.out.println();
		
		// TODO Auto-generated method stub

	}

}
