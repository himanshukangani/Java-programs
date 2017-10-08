class Node
{
int data;
Node next;
Node(int d)
{
data = d;
}
}

class DemoPairwiseSwap
{
Node head;
public void traverse()
{
	Node itr = head;
	while(itr!=null)
	{
		System.out.print(itr.data+" ");
		itr = itr.next;
	}
}

public void addNode(int d)
{
	Node node = new Node(d);
	node.next= head;
	head = node;
}

public void pairwiseSwap()
{
	Node p=head.next,q=head,b=p;
	if(q != null && p !=null)
	{
		head = reversePair(q,p);
		 b = q;
		p=q.next.next;
		q=q.next;
		while(q!=null && p!=null && p.next!=null)
		{
			
			
			
			b.next = reversePair(q,p);
			b=b.next.next;
			p=q.next.next;
			q=q.next;
			
			
		}
		if(p!=null)
		b.next = reversePair(q,p);
	}
		
}

public Node reversePair(Node q,Node p)
{
	q.next = p.next;
	p.next = q;
	return(p);
}


public static void main(String args[])
{
	DemoPairwiseSwap obj = new DemoPairwiseSwap();
	obj.addNode(10);
	obj.addNode(20);
	obj.addNode(43);
	obj.addNode(4);
	obj.addNode(34);
	obj.addNode(23);
	obj.addNode(2);
	obj.addNode(65);
	
	obj.traverse();
	obj.pairwiseSwap();
	System.out.println();
	obj.traverse();
	
}
}
