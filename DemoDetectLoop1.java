class Node
	{
		int data;
		Node next;
		Node(int d)
			{
				data = d;
			}
	}

class DemoDetectLoop1
{
	int flag = 1;
Node head;
Node last;
	public void traverse()
	{
		Node itr = head;
		while(itr!=null)
		{
			System.out.print(itr.data+" ");
			itr= itr.next;
		}
	}

	public void addNode(int d)
		{
			if(flag==1)
			{
			Node node = new Node(d);
			node.next = head;
			head = node;
			last = node;
			flag = 0;
			
			}
			else
			{
			Node node = new Node(d);
			node.next = head;
			head = node;
			}
			
		}

		public boolean detectLoopNode()
			{
				Node s=head,f=head.next;
				if(s==null)
					return(false);
				else{
			
				while(s!=f && f!=null )
				{
					f=f.next;
					if(f!=null)
					{
						f=f.next;
					s= s.next;
					}
				}
				if(f==null)
					return(false);
				else
				{
					detectAndRemove(s);
				return(true);
					}
			}
			}
			
			public void detectAndRemove(Node loop)
			{
				Node p1=head,p2=null;
					while(1==1)
					{
						p2=loop;
						while(p2.next!=loop && p2.next!=p1)
						{
							p2=p2.next;
						}	
						if(p2.next==p1)
							break;
						p1=p1.next;
					}
						p2.next=null;
						
						
			}
			
		public static void main(String args[])
		{
			 DemoDetectLoop1 obj = new DemoDetectLoop1();
			 obj.addNode(5);
			 obj.addNode(4);
			// obj.addNode(4);
			 obj.addNode(5);
			 obj.addNode(65);
			 obj.addNode(45);
			 obj.addNode(35);
			 obj.last.next = obj.head.next.next;
			 boolean result = obj.detectLoopNode();
			 System.out.println(result);
			 obj.traverse();
			 
		
		}
}
/* Algorithm - my language

It is Floyd Cycle Detection Algorithm. When Slow and Fast pointers meet at a point. We have to 
store this pointer. Then check can we reach to every node start from starting. If we reach at 
any pointer this will be the first node of the loop. Then we just have to make last node next 
is null.

Official - 
We know that Floyd’s Cycle detection algorithm terminates when fast and slow pointers meet 
at a common point. We also know that this common point is one of the loop nodes 
(2 or 3 or 4 or 5 in the above diagram). We store the address of this in a pointer 
variable say ptr2. Then we start from the head of the Linked List and check for nodes one
 by one if they are reachable from ptr2. When we find a node that is reachable, we know
 that this node is the starting node of the loop in Linked List and we can get pointer to
 the previous of this node.
// Time Complexity = O(n^2)
// Space Complexity = O(1)
*/

			 
		
		