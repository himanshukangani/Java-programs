class Node 
{
int data;
Node next;
Node(int d)
{
	data = d;
}
}


class DemoDeleteAlternate
{
	Node head = null;
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
	
	public void deleteAlternate()
	{
		if(head!=null && head.next!=null)
		{
			Node p=head;
			while(p!=null && p.next!=null)
			{
				p.next=p.next.next;
				p=p.next;
			}
		}
				
	}
	
	public static void main(String args[])
	{
		DemoDeleteAlternate obj = new DemoDeleteAlternate();
		for(int i=40;i>0;i=i-10)
		obj.addNode(i);
		obj.traverse();
		obj.deleteAlternate();
		obj.traverse();
	}
}