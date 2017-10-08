class Node 
{
int data;
Node next;
Node(int d)
{
	data = d;
}
}

class DemoReverseInGroups
{
	
	Node head;
	//Node dummy = new Node(-1);
	
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
	
	public Node reverseGroups(Node head,int k)
	{
		int count = 1;
		Node q = null,r=null,p=head;
		
		while(p!=null && count <=k)
			{
				r=q;
				q=p;
				p=p.next;
				q.next = r;
				count++;
			}
			if(p!=null)
				head.next = reverseGroups(p,k);
			
			return(q);
		}
		
		
		
	
	
	public static void main(String args[])
	{
		int k = 4;
		DemoReverseInGroups obj = new DemoReverseInGroups();
		for(int i=90;i>0;i=i-10)
			obj.addNode(i);
		//obj.dummy.next = obj.head;
		//obj.head = obj.dummy;
		obj.traverse();
		//obj.reverseGroups(obj.head.next);
		obj.head = obj.reverseGroups(obj.head,k);
		obj.traverse();
		
		
	}
}

