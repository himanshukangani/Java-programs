class Node
{
int data;
Node next;
Node(int d)
{
data = d;
}
}

class DemoRemDupFromSorted
{
	Node head;
	public void traverse()
	{
		Node itr = head;
		while(itr != null)
		{
			System.out.print(itr.data+" ");
			itr = itr.next;
		}
	}
	
	public void addNode(int d)
	{
		Node node = new Node(d);
		node.next = head;
		head = node;
	}
	
	public void remDupSorted()
	{
		Node p=head;
		while( p!= null && p.next!=null)
		{
			if(p.data == p.next.data)
			{
				p.next = p.next.next;
				
			}
			else
			p=p.next;
	}
	System.out.println(p.data);
	}
	
	public static void main(String args[])
	{
		DemoRemDupFromSorted obj = new DemoRemDupFromSorted();
		obj.addNode(70);
		obj.addNode(40);
		obj.addNode(40);
		obj.addNode(20);
		obj.addNode(11);
		obj.addNode(11);
		obj.addNode(11);
		
		obj.traverse();
		obj.remDupSorted();
		System.out.println();
		obj.traverse();
	}
}
	