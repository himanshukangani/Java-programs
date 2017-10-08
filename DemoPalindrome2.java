class Node 
{
int data;
Node next;
Node(int d)
{
data = d;
}
}


class DemoPalindrome2
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
		node.next = head;
		head = node;
	}
	
	public boolean palindrome()
	{
		Node f=head,mid=head,prev=null,secl=null;
		while(f!=null && f.next!=null)
		{
			f=f.next.next;
			prev = mid;
			mid=mid.next;
		}
		if(f!=null)
		{
			secl = mid.next;
			//mid=mid.next;
		}	
		else
			secl = mid;
		
		prev.next = null;
		
		secl = reverse(secl);
		Node test = secl;
		while(test != null)
		{
			System.out.println(test.data);
			test=test.next;
		}
		Node com1 = secl,com = head;
		while( com!=null && com1!=null)
		{
			if(com.data!=com1.data)
				return(false);
			
				com=com.next;
				com1=com1.next;
		}
		return(true);
	}
	public Node reverse(Node secl)
	{
		Node p=secl.next,q=secl,r=null;
		while(p!=null)
		{
			q.next=r;
			r=q;
			q=p;
			p=p.next;
		}
		q.next = r;
		return(q);
	}
	public static void main(String args[])
	{
		DemoPalindrome2 obj = new DemoPalindrome2();
		obj.addNode(10);
		obj.addNode(20);
		obj.addNode(30);
		obj.addNode(10);
		obj.addNode(10);
		
			obj.traverse();
			boolean result = obj.palindrome();
			System.out.println(result);
			if(result == true)
			System.out.println("This is palindrome.");
		else
			System.out.println("This is not palindrome.");
	}
}