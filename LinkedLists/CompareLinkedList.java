
public class CompareLinkedList {
	Node head;
	
	static Node a,b;
	static class Node
	{
		int data;
		Node next;
		Node(char d)
		{
			data=d;
			next=null;
		}
	}
	
	public int compareLists(Node node1,Node node2)
	{
		if(node1==null && node2 ==null)
		{
			return 1;
		}
		while(node1!=null && node2!=null&& node1.data==node2.data)
		{
			node1=node1.next;
			node2=node2.next;
		}
		//checking lexographically
		if(node1!=null && node2 !=null)
		{
			return(node1.data>node2.data?1:-1);
		}
		
		if(node1==null && node2 !=null)
			return -1;
		if(node1!=null && node2==null)
		{
			return 1;
		}
		return 0;
	}
	

	public static void main(String[] args) {
		
		CompareLinkedList list=new CompareLinkedList();
		Node result=null;
		list.a=new Node('g');
		list.a.next=new Node('e');
		list.a.next.next=new Node('e');
		list.a.next.next.next=new Node('k');
		list.a.next.next.next.next=new Node('s');
		list.a.next.next.next.next.next=new Node('b');
		
		list.b=new Node('g');
		list.b.next=new Node('e');
		list.b.next.next=new Node('e');
		list.b.next.next.next=new Node('k');
		list.b.next.next.next.next=new Node('s');
		list.b.next.next.next.next.next=new Node('a');
		int value;
		value=list.compareLists(a,b);
		System.out.println(value);
		// TODO Auto-generated method stub

	}

}
