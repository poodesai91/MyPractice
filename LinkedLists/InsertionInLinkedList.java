
public class InsertionInLinkedList {
	
	Node head;
	
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	//function to add node in the linked list
	
	void insert(Node new_node)
	{
		Node current;
		
		//special case 
		if(head==null || head.data>=new_node.data){
			new_node.next=head;
			head=new_node;
		}
		else
		{
			current=head;
			while(current.next!=null && current.data<new_node.data)
			{
				current=current.next;
			}
			new_node.next=current.next;
			current.next=new_node;
			
		}
	}
	//function to create node
	Node newNode(int data)
	{
		Node x=new Node(data);
		return x;
		
	}
	//function to print linked list
	void printList()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	//main function
	

	public static void main(String[] args) {
		//InsertionInLinkedList insertionInLinkedList=new InsertionInLinkedList();
		
		InsertionInLinkedList llist = new InsertionInLinkedList();
        Node new_node;
        new_node = llist.newNode(5);
        llist.insert(new_node);
        new_node = llist.newNode(10);
        llist.insert(new_node);
        new_node = llist.newNode(7);
        llist.insert(new_node);
        new_node = llist.newNode(3);
        llist.insert(new_node);
        new_node = llist.newNode(1);
        llist.insert(new_node);
        new_node = llist.newNode(9);
        llist.insert(new_node);
        System.out.println("Created Linked List");
        llist.printList();
		
		
		
		// TODO Auto-generated method stub

	}

}
