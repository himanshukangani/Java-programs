class Node
{
int data;
Node next;
Node(int d)
{
data = d;
}
}

	class DemoPalindrome1
	{
	Node head;
	int s[]=new int[10];
	int top=-1;
	//for(int i=0;i<s.length;i++)
	//System.out.println(s[5]);
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
		node.next = head;
		head=node;
	}
	
	public void push(int d)
	{
		top++;
		s[top]=d;
		//System.out.println(s[top]);
		
	}
	/*public void  pop()
	{
		
		top--;
		
	}*/
	
	public boolean palindrome()
	{
		Node p = head,q=head;
		while(p!=null)
		{
			push(p.data);
			p=p.next;
		}
		//System.out.println(top);
		while(q!=null)
		{
			if(q.data==s[top])
			{
				top--;
				//pop();
			}
			else
				break;
			q=q.next;
			//System.out.println(top);
		}
		if(top==-1)
		{
			//System.out.println(top);
			return(true);
		}
		else
		{
		//System.out.println(top);	
			return(false);
	}}
	
	public static void main(String args[])
	{
		DemoPalindrome1 obj = new DemoPalindrome1();
		obj.addNode(10);
		
		obj.addNode(20);
		
		obj.addNode(10);
		
		obj.addNode(30);

		obj.addNode(10);
		
		
		obj.traverse();
		boolean result =obj.palindrome();
		System.out.println(result);
		System.out.println();
		if(result == false)
		System.out.println("This is not palindrome");
		else
			System.out.println("This is palindrome");
	}
	}
		
	