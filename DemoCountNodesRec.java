class Node
{
int data;
Node next;
	Node(int d)
	{
		data=d;
	}
int countNodes(Node itr)
	{
	if(itr==null)
	return(0);
	else 
	{
	return(1+countNodes(itr.next));
	}
	
	}
}

class DemoCountNodesRec
{
		public static void main(String args[])
		{
			Node first= new Node(10);
			Node second= new Node(20);
			Node third= new Node(30);
			Node fourth= new Node(40);
			Node fifth = new Node(50);
			first.next= second;
			second.next= third;
			third.next= fourth;
			fourth.next=fifth;
			
			System.out.println("Total number of nodes in the linked list is "+first.countNodes(first));
		}
}	
			