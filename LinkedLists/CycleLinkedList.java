import java.util.HashMap;

public class CycleLinkedList {
	
	Node head;
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
	
	public boolean isCycle(Node head)
	{
		Node fast_ptr=head,slow_ptr=head,current=head;
		while(current!=null)
		{
			fast_ptr=fast_ptr.next.next;
			slow_ptr=slow_ptr.next;
			if(fast_ptr==slow_ptr)
			{
				
				return true;
			}
			else
			{
				current=current.next;
			}
		}
		return false;
	}
	
	
	
	public void removeloop(Node node)
	{
	Node temp=node;
	Node prev=null;
	CycleLinkedList l=new CycleLinkedList();
	
	HashMap<Node,Integer>map=new HashMap<>();
	while(temp!=null)
	{
		if(map.containsKey(temp))
		{
		   prev.next=null;	
			break;
		}
		map.put(temp, 1);
		prev=temp;
		temp=temp.next;
	}
	l.printList(node);
	
	
	}
	
	public void push(int data)
	{
		 Node new_node=new Node(data);
		 new_node.next=head;
		 head=new_node;
		 
				 
				 
		
	}
	
	void printList(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
			
		}
	}

	public static void main(String[] args) {
		CycleLinkedList l=new CycleLinkedList();
        Node h1=new Node(2);
        h1.next=new Node(3);
        h1.next.next=new Node(4);
        h1.next.next.next=new Node(6);
        
        //for testing
        h1.next.next.next.next=h1;
        boolean b=l.isCycle(h1);
        System.out.println(b);
        if(b==true)
        {
        	l.removeloop(h1);
        }
        
        
        
		// TODO Auto-generated method stub

	}

}
