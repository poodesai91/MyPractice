
public class AdditionOfLinkedList {
	
	public int carry=0;
	public Node newHead=null;
	public Node add(Node h1,Node h2)
	{
		//first we will make sure that the length of the linked lists are same
		int h1len=getSize(h1);
		int h2len=getSize(h2);
		if(h1len>h2len)
		{
			int diff=h1len-h2len;
			while(diff>0)
			{
				Node n=new Node(0);
				n.next=h2;
				h2=n;
				diff--;
				
			}
		}
		if(h2len>h1len)
		{
			int diff=h2len-h1len;
			
			while(diff>0)
			{
				Node n=new Node(0);
				n.next=h1;
				h1=n;
				diff--;
				
			}
			
		}
		Node newHead=addrecursion(h1,h2);
		if(carry!=0)
		{
			Node n=new Node(carry);
			n.next=newHead;
			newHead=n;
		}
		return newHead;
	}
	
	
	
	
	public Node addrecursion(Node h1,Node h2)
	{
		if(h1==null && h2==null)
			return null;
		addrecursion(h1.next, h2.next);
		int a=h1.data+h2.data+carry;
		if(a>10)
		{
			carry=1;
			a=a%10;
		}
		Node n=new Node(a);
		if(newHead==null)
			newHead=n;
		else
		{
			n.next=newHead;
			newHead=n;
		}
		return newHead;
	}
	
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
//	void push(Node head,int data)
//	{
//		Node new_node=new Node(data);
//		new_node.data=data;
//		new_node.next=head;
//		head=new_node;
//	}
	void printlist(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
			
		}
	}
//	void swap(Node a,Node b)
//	{
//		Node temp=a;
//		a=b;
//		b=temp;
//	}
	
	int getSize(Node node)
	{
		int size=0;
		while(node!=null)
		{
			node=node.next;
			size++;
		}
		return size;
	}
	

	public static void main(String[] args) {
		
		AdditionOfLinkedList l=new AdditionOfLinkedList();
		Node h1=new Node(1);
		h1.next=new Node(1);
		h1.next.next=new Node(1);
		h1.next.next.next=new Node(7);
	    l.printlist(h1);
	    
	    Node h2=new Node(9);
	    h2.next=new Node(9);
	    h2.next.next=new Node(9);
	    h2.next.next.next=new Node(9);
	    l.printlist(h2);
	    
	    Node node=l.add(h1, h2);
	    l.printlist(node);
	    
		// TODO Auto-generated method stub

	}

}
