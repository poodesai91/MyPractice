

public class ReverseInBlocks {
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
	void display(Node n)
	{
		Node temp=n;
		while(temp!=null)
		{
			System.out.print(temp.data);
			temp=temp.next;
		}
	}
	
	
	public Node reverseInBlocks(Node head,int k)
	{
		Node prev=null;
		Node current=head;
		Node temp=null;
		int count=0;
		while(count<k&&current!=null)
		{
			temp=current.next;
			current.next=prev;
			prev=current;
			current=temp;
			count++;
		}
		
		if(temp!=null)
		{
			head.next=reverseInBlocks(temp, k);
		}
		
		return prev;
	}

	public static void main(String[] args) {
		ReverseInBlocks r=new ReverseInBlocks();
		Node h1=new Node(5);
		h1.next=new Node(6);
		h1.next.next=new Node(7);
		h1.next.next.next=new Node(8);
		h1.next.next.next.next=new Node(9);
		h1.next.next.next.next.next=new Node(10);
		h1=r.reverseInBlocks(h1,3);
		r.display(h1);
		// TODO Auto-generated method stub

	}

}
