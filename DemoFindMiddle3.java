class Node
{
 int data;
 Node next;
	Node(int d)
	{
	data = d;
	}
}	

class DemoFindMiddle3
{
	Node head;
	public void traverse()
	{
		Node itr=head;
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
		head= node;
	}

	public void findMiddle()
	{
		Node itr = head;
		Node mid = head;
		int count = 0;
		while(itr!=null)
		{
			if(count%2==1)
				mid=mid.next;
			count++;
			itr=itr.next;
			
		}
		if(mid!=null)
			System.out.println("The mid is "+mid.data);
	}
	
	public static void main(String args[])
	{
		DemoFindMiddle3 obj = new DemoFindMiddle3();
		for(int i = 9;i>0;i--)
		{			
		obj.addNode(i);
		}
		obj.traverse();
		obj.findMiddle();
	}
}	