class Node
{
int data;
Node next;
Node(int d)
{
	data = d;
}
}

class DemoSegregateEvenOdd
{
	Node head;
	Node dummy1 = new Node(-1);
	Node dummy2 = new Node(-1);
	public void traverse(Node itr)
	{
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
	
	public Node segregateEvenOdd()
	{
		Node p=head,q=dummy1,tail=dummy2,r=head;
		while(p!=null)
		{
			if(p.data%2 == 1)
			{
				q.next = p.next;
				tail.next = p;
				
				p=p.next;
				tail=tail.next;
				tail.next = null;
			}
			else
			{
				q=p;
				p=p.next;
			}
				
		}
		q.next = dummy2.next;
		return(dummy1.next);
		
	}
				
			
		
	
	
	public static void main(String args[])
	{
		DemoSegregateEvenOdd obj = new DemoSegregateEvenOdd();
		obj.addNode(6);
		obj.addNode(7);
		obj.addNode(1);
		obj.addNode(4);
		obj.addNode(5);
		obj.addNode(10);
		obj.addNode(12);
		obj.addNode(8);
		obj.addNode(15);
		obj.addNode(17);
		/*obj.addNode(6);
		obj.addNode(1);
		obj.addNode(4);
		obj.addNode(7);
		obj.addNode(5);
		obj.addNode(3);
		obj.addNode(1);*/
		obj.dummy1.next = obj.head;
		System.out.print("Input-----");
		obj.traverse(obj.head);
		Node result = obj.segregateEvenOdd();
		System.out.print("Dummy1-----");
		obj.traverse(obj.dummy1.next);
		System.out.print("dummy2-----");
		obj.traverse(obj.dummy2.next);
		System.out.print("Result-----");
		obj.traverse(result);
	}
}
		