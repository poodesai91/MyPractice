
public class ReverseList {
	
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
	
	public Node reverse(Node head)
	{
		Node prev=null;
		Node curr=head;
		while(curr!=null)
		{
		Node temp=curr.next;
		curr.next=prev;
		prev=curr;
		curr=temp;
		}
		head=prev;
		return head;
	}
	
	void display(Node n)
	{
		Node temp=n;
		while(temp!=null)
		{
			System.out.print(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		
		ReverseList r=new ReverseList();
		Node h1=new Node(5);
		h1.next=new Node(6);
		h1.next.next=new Node(7);
		h1.next.next.next=new Node(8);
		h1=r.reverse(h1);
		r.display(h1);
		
		// TODO Auto-generated method stub

	}

}
