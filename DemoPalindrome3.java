class Node 
{
char data;
Node next;
	Node(char d)
	{
	data = d;
	}
}


class DemoPalindrome3
{
	Node head;
	Node left;
	public void traverse()
	{
		Node itr=head;
		while(itr!=null)
		{
			System.out.print(itr.data+" ");
			itr = itr.next;
		}
	}
	
	public void addNode(char d)
	{
		Node node = new Node(d);
		node.next = head;
		head=node;
	}
	
	public boolean palindrome3(Node right)
	{
		 left = head;
		if(right == null)
			return(true);
		
		boolean isp = palindrome3(right.next);
		if(isp == false)
			return(false);
		
		boolean isp1 = right.data == left.data;
			left=left.next;
		return(isp1);
	}
	
	
	public static void main(String args[])
	{
		DemoPalindrome3 obj = new DemoPalindrome3();
		obj.addNode('c');
		obj.addNode('b');
		obj.addNode('a');
		obj.addNode('c');
		obj.addNode('a');
		obj.addNode('b');
		obj.addNode('a');
		
		obj.traverse();
		boolean result = obj.palindrome3(obj.head);
		if(result == true)
			System.out.println("This is palindrome");
		else
			System.out.println("This is Not palindrome");
		
	}
}

			
		
