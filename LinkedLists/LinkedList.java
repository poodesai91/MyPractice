
// Java program to delete a given node in linked list under given constraints
 
class LinkedList {
 
    static Node head1=null;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    Node add(Node h1,Node h2)
    {
    	int carry=0;
    	Node curr=null;
    	if(h1==null && h2==null)
    	{
    		return null;
    	}
    	while(h1!=null && h2!=null)
    	{
    		int a=h1.data;
    		int b=h2.data;
    		int total=a+b+carry;
    		if(total>=10)
    		{
    			carry=1;
    			total=total%10;
    		}
    		if(head1==null)
    		{
    			head1=new Node(total);
    			curr=head1;
    		}
    		else
    		{
    			Node newNode=new Node(total);
    			curr.next=newNode;
    			curr=curr.next;
    		}
    		h1=h1.next;
    		h2=h2.next;
    		
    	}
    	
    	while(h1!=null)
    	{
    		int x=h1.data+carry;
    		Node n=new Node(x);
    		curr.next=n;
    		curr=curr.next;
    		h1=h1.next;
    		carry=0;
    	}
    	while(h2!=null)
    	{
    		int x=h2.data+carry;
    		Node n=new Node(x);
    		curr=curr.next;
    		h2=h2.next;
    		carry=0;
    	}
    	if(carry>0){
    		Node n=new Node(carry);
    		curr.next=n;
    		curr=curr.next;
    		
    	}
    	return head1;
    }
    
    public void display(Node head)
    {
    	Node temp=head;
    	while(temp!=null)
    	{
    		System.out.println(temp.data);
    		temp=temp.next;
    	}
    }
    public void displayreverse(Node head)
    {
    	Node currnode=head;
    	if(head==null)
    		return;
    	display(head.next);
    	System.out.println(head.data);
    }
 public static void main(String args[])
 {
	 LinkedList l=new LinkedList();
	 Node h1=new Node(5);
	 h1.next=new Node(9);
	 h1.next.next=new Node(5);
	 h1.next.next.next=new Node(7);
	 System.out.println("First number in reverse order");
	 l.display(h1);
	 Node h2=new Node(5);
	 h2.next=new Node(9);
	 System.out.println("Second number in reverse order");
	 l.display(h2);
	 Node x=l.add(h1, h2);
	 System.out.println("\n addition in reverse order");
	 l.display(x);
	 System.out.println("\n addition in forward order");
	 l.displayreverse(x);
	 
 }
    
}
 
// this code has been contributed by Mayank Jaiswal
