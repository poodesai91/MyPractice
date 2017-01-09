import java.awt.DisplayMode;

public class MergingList {
	
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
	
	
	public Node merge(Node h1,Node h2)
	{
		Node curr1=h1;
		Node curr2=h2;
		Node temp1=null,temp2=null;
		while(curr1.next!=null && curr2.next!=null)
		{
			temp1=curr1.next;
			curr1.next=curr2;
			temp2=curr2.next;
			curr2.next=temp1;
			curr1=temp1;
			curr2=temp2;
			
			
			
		}
		temp1=curr1.next;
		curr1.next=curr2;
		
		
		if(curr1.next!=null)
		{
			curr2.next=temp1;
		}
		
//            if(curr2.next==null)
//            {
//            	temp1=curr1.next;
//            	curr1.next=curr2;
//            	curr2.next=temp1;
//            	
//            }
		else
		{
			temp2=curr2;
			curr2.next=null;
			h2=temp2;
		}
		


		return h2;
		
		
	}
	
	
	void display(Node node)
	{
		Node temp=node;
		while(temp!=null)
		{
			System.out.print(temp.data);
			temp=temp.next;
		}
	}
	
	

	public static void main(String[] args) {
		MergingList l=new MergingList();
		Node h1=new Node(5);
		h1.next=new Node(6);
		h1.next.next=new Node(7);
		//h1.next.next.next=new Node(8);
		l.display(h1);
		
		Node h2=new Node(1);
		h2.next=new Node(2);
		//h2.next.next=new Node(3);
		//h2.next.next.next=new Node(4);
		l.display(h2);
		
		//Merging of two linked lists
		System.out.println("The merged list");
		h2=l.merge(h1, h2);
		l.display(h1);
		System.out.print("*************");
		l.display(h2);

		
		
	
		// TODO Auto-generated method stub

	}

}
