class Node
{
int data;
Node next;
Node(int d)
{
data = d;
}
}


class DemoIntersectionTwoSortedLL
{
	Node head1=null,head2=null,head3=null;
	public void traverse(Node itr)
	{
		while(itr!=null)
		{
			System.out.print(itr.data+" ");
			itr= itr.next;
		}
		System.out.println();
	}
	
	public void addNode1(int d)
	{
		Node node = new Node(d);
		node.next= head1;
		head1=node;
	}
	
	public void addNode2(int d)
	{
		Node node = new Node(d);
		node.next = head2;
		head2=node;
	}
	
	public void addNode3(int d)
	{
		Node node = new Node(d);
		node.next = head3;
		head3= node;
	}
	
	public void reverse()
	{
		Node p=head3.next;
		Node q=head3;
		Node r=null;
		while(p!=null)
		{
			q.next=r;
			r=q;
			q=p;
			p=p.next;
		}
		q.next = r;
		head3=q;
	}
			
			
			
	
	public void createIntersectedList()
	{
		Node a=head1,b=head2;
		while(a!=null && b!=null)
		{
			if(a.data == b.data)
			{
				addNode3(a.data);
					a=a.next;
					b=b.next;
			}
			else if(a.data < b.data)
				a=a.next;
			else
				b= b.next;
		}
		
	}
	
	public static void main(String args[])
	{
		DemoIntersectionTwoSortedLL obj = new DemoIntersectionTwoSortedLL();
		obj.addNode1(6);
		obj.addNode1(5);
		obj.addNode1(4);
		obj.addNode1(3);
		obj.addNode1(2);
		obj.addNode1(1);
		
		
		obj.addNode2(8);
		obj.addNode2(6);
		obj.addNode2(4);
		obj.addNode2(2);
		
		obj.traverse(obj.head1);
		obj.traverse(obj.head2);
		obj.createIntersectedList();
		obj.reverse();
		obj.traverse(obj.head3);
	}
}	

//Time Complexity = O(m+n)
//Space Complexity = O(1)