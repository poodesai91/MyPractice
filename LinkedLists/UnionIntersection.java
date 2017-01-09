import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 */

/**
 * @author Kunal
 *
 */
public class UnionIntersection {
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
	
	public HashSet<Integer> Node(Node h1,Node h2)
	{
		HashSet<Integer>union=new HashSet<>();
		Node current1=h1;
		Node current2=h2;
		while(current1!=null)
		{
			union.add(current1.data);
			current1=current1.next;
		}
		while(current2!=null)
		{
			union.add(current2.data);
			current2=current2.next;
		}
		return union;
	}
	
	public void intersection(Node h1,Node h2)
	{
		HashMap<Integer, Integer>intersection=new HashMap<Integer, Integer>();
		Node current1=h1;
		Node current2=h2;
		UnionIntersection u=new UnionIntersection();
		while(current1!=null)
		{
			
			intersection.put(current1.data, 1);
			current1=current1.next;
			
		}
		while(current2!=null)
		{
			if(intersection.containsKey(current2.data))
			{
				u.push(current2.data);
				
			}
			current2=current2.next;
		
	}
		u.printlist();
	}
	
	public void push(int data)
	{
		Node new_Node=new Node(data);
		new_Node.next=head;
		head=new_Node;
	}
	
	void printlist()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UnionIntersection u=new UnionIntersection();
		UnionIntersection unionlist=new UnionIntersection();
		UnionIntersection iList=new UnionIntersection();
		Node h1=new Node(10);
		h1.next=new Node(15);
		h1.next.next=new Node(4);
		h1.next.next.next=new Node(20);
		
		Node h2=new Node(8);
		h2.next=new Node(4);
		h2.next.next=new Node(2);
		h2.next.next.next=new Node(10);
		
		HashSet<Integer>union=u.Node(h1, h2);
		for (Integer integer : union) {
			unionlist.push(integer);
			
		}
		unionlist.printlist();
		u.intersection(h1, h2);
		
		
		
	
		
		
		// TODO Auto-generated method stub

	}

}
