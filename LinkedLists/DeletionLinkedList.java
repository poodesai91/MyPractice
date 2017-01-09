
public class DeletionLinkedList {
	static Node head;
	
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
		
	}
	//deleting a node
	public void  delete(Node node,Node n)
	{
		if(node==n)
		{
			if(node.next==null)
			{
				System.out.println("Linked List cannot be empty");
				return;
			}
		
	    node.data=node.next.data;
		node.next=node.next.next;
		//n=node.next;
		
		System.gc();
		
		return;
		}
		Node prev=node;
		while(prev.next!=null && prev.next!=n)
		{
			prev=prev.next;
		}
		prev.next=prev.next.next;
		System.gc();
		return;
		
	}
	
	void printlist(Node head)
	{
			Node temp=head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
	}

	public static void main(String[] args) {
		DeletionLinkedList deletionLinkedList=new DeletionLinkedList();
		deletionLinkedList.head=new Node(5);
		deletionLinkedList.head.next=new Node(6);
		deletionLinkedList.head.next.next=new Node(10);
		deletionLinkedList.head.next.next.next=new Node(15);
		System.out.println("Given linked list" );
		deletionLinkedList.printlist(head);
		//deleting the node 10
		deletionLinkedList.delete(head, head.next.next);
	    deletionLinkedList.printlist(head);
	    System.out.println("Modified linked list" );
	    
	   deletionLinkedList.delete(head, head);
	   deletionLinkedList.printlist(head);
	   System.out.println("Modified linked list");
	    
		
		
		

	}

}
