class Node
{
int data;
Node next;
 Node (int d)
 {
	data = d;
}
}

	class DemoReverseLLInGroup
	{
	
	  Node head;
		public void traverse()
			{
				Node itr = head;
				while (itr!=null)
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
					
				public Node reverse(Node head , int g)
				{
					int count = 0;
					Node curr=head;
					Node p=null,q=null;
					while(curr!=null && count < g)
					{
						p = curr.next;
						curr.next= q;
						q=curr;
						curr = p;
						count++;
					}
						if(curr != null)
						head.next = reverse(curr,g);
						
								return(q);
				}
				
				
				public static void main(String args[])
				{
					DemoReverseLLInGroup obj = new DemoReverseLLInGroup();
					obj.addNode(50);
					obj.addNode(10);
					obj.addNode(9);
					obj.addNode(23);
					obj.addNode(3);
					obj.addNode(15);
					obj.addNode(12);
					obj.addNode(33);
					int g = 6;
					
					obj.traverse();
					 Node result = obj.reverse(obj.head,g);
					 while(result != null)
					 {
						 System.out.print(result.data+" ");
						 result=result.next;
					
				}
	}				
	}
					