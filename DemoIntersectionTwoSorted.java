class Node
{
int data;
Node next;
Node(int d)
{
	data = d;
}
}

class DemoIntersectionTwoSorted
{
	Node head1,head2,head3,last;
	public void traverse(Node itr)
	{
		while(itr!=null)
		{
			System.out.print(itr.data+" ");
			itr = itr.next;
		}
	}
	
	public void addNode1(int d)
	{
		Node node = new Node(d);
		node.next = head1;
		head1=node;
	}
	
	public void addNode2(int d)
	{
		Node node = new Node(d);
		node.next = head2;
		head2=node;
	}
	
	
	public void createIntersectedList()
	{
		Node p=head1,q=head2;
		while(p!=null)
		{
			q=head2;
			while(q!=null)
			{
				if(p.data == q.data)
				{
					Node node = new Node(p.data);
					node.next = head3;
					head3=node;
				}
				q=q.next;
			}
			p=p.next;

		}
	}
	
	public static void main(String args[])
	{
		DemoIntersectionTwoSorted obj = new DemoIntersectionTwoSorted();
		obj.addNode1(6);
		obj.addNode1(4);
		obj.addNode1(3);
		obj.addNode1(2);
		obj.addNode1(1);
		
		
		obj.addNode2(8);
		obj.addNode2(6);
		obj.addNode2(4);
		obj.addNode2(2);
		
		obj.traverse(obj.head1);
		System.out.println();
		obj.traverse(obj.head2);
		obj.createIntersectedList();
		System.out.println();
		obj.traverse(obj.head3);
	}
}