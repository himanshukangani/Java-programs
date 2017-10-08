class Node 
{
int data;
Node next;
Node(int d)
{
data = d;
}
}

class DemoDeleteAlternateRec
{
	Node head=null;
	
	public void traverse()
	{
		Node itr = head;
		while(itr!=null)
		{
			
		System.out.print(itr.data+" ");
		itr = itr.next;
		}
		System.out.println();
	
	}
	
	public void addNode(int d)
	{
		Node node = new Node(d);
		node.next = head;
		head = node;
	}
	
	public void deleteAlternate(Node p)
	{
		if(p==null || p.next==null)
			return;
		else
		{
			p.next=p.next.next;
			deleteAlternate(p.next);
		}
	}
	
	public static void main(String args[])
	{
		DemoDeleteAlternateRec obj = new DemoDeleteAlternateRec();
		for(int i=40;i>0;i=i-10)
			obj.addNode(i);
		obj.traverse();
		obj.deleteAlternate(obj.head);
		obj.traverse();
	}
}