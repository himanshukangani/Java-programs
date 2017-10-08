class Node 
{
int data;
Node next;
Node(int d)
{
data =d;
}
}

class DemoReverseAlternateGroups
{
	Node head;
	int flag=1;
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
	
	public Node reverseAlternateGroups(Node head,int k)
	{
		int count =1;
		
		if(flag==1)
		{
			Node p=head,q=null,r=null;
		while(p!=null && count<=k)
		{
			r=q;
			q=p;
			p=p.next;
			q.next=r;
			count++;
		}
		flag = 0;
		if(p!=null)
			head.next = reverseAlternateGroups(p,k);
		return(q);
		}
		
		else
		{
			flag = 1;
			Node p=head,q=null;
			while(p!=null && count<=k)
			{
				q=p;
				p=p.next;
				
				count++;
			}
			if(p!=null)
				q.next = reverseAlternateGroups(p,k);
			return(head);
		}
			
	}
	
	public static void main(String args[])
	{
		int k =3;
		DemoReverseAlternateGroups obj = new DemoReverseAlternateGroups();
		for(int i=120; i>0;i=i-10)
			obj.addNode(i);
		obj.traverse();
		obj.head = obj.reverseAlternateGroups(obj.head,k);
		obj.traverse();
	}
}