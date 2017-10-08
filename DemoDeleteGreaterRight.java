class Node 
{
int data;
Node next;
Node(int d)
{
	data = d;
}
}

class DemoDeleteGreaterRight
{
	Node head;
	Node dummy=new Node(-1);
	public void traverse(Node itr)
	{
		//Node itr=head;
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
	
	public Node deleteGreaterRight()
	{
		Node p = head,q=dummy;
		if(p==null || p.next==null)
			return(p);
		else
		{
			while(p!=null && p.next!=null)
			{
				if(p.data<p.next.data)
				{
					q.next = p.next;
					p=p.next;
				}
			else{
					q=p;
					p=p.next;
				}
			}
			
		return(dummy.next);
	}
	}
	
	public static void main(String args[])
	{
		DemoDeleteGreaterRight obj = new DemoDeleteGreaterRight();
		obj.addNode(3);
		obj.addNode(2);
		obj.addNode(6);
		obj.addNode(5);
		obj.addNode(11);
		obj.addNode(10);
		obj.addNode(15);
		obj.addNode(12);
		obj.dummy.next = obj.head;
		obj.traverse(obj.head);
		Node result = obj.deleteGreaterRight();
		obj.traverse(result);
	}
}
		