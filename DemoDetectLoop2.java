class Node 
{
 int data;
 Node next;
 Node(int d)
	{
	data = d;
	}
}


class DemoDetectLoop2
	{
		int flag=1;
		Node head;
		Node last;
		public void traverse()
			{
				Node itr = head;
				while(itr != null)
				{
					System.out.print(itr.data+" ");
					itr = itr.next;
				}
			}
			public void addNode(int d)
			{
				if(flag ==1)
					{
			
				Node node = new Node(d);
				node.next= head;
				head= node;
				last = head;
				flag =0;
					}
				else
				{
				
				Node node = new Node(d);
				node.next= head;
				head= node;
				}	
			}
				public boolean detectLoopNode()
					{
						Node s=head,f=head.next;
						while(s!=null && f!=null && s!=f)
						{
							f=f.next;
							if(f!=null)
							{
								f=f.next;
								s=s.next;
							}	
						}
					if(f==null)
						return(false);
					else{
						removeLoop(s);
						return(true);
						}
					}
				public void removeLoop(Node loop)
				{
					Node p1 = loop;
					Node p2 = loop;
					int k = 1;
					while(p2.next != p1)
					{
						p2=p2.next;
						k++;
					}
					p1=head;
					p2=head;
					for(int i=0; i<k;i++)
					{
						p2=p2.next;
					}
					while(p1!=p2)
					{
						p1=p1.next;
						p2=p2.next;
					}
					while(p2.next!=p1)
					{
							p2=p2.next;
					}
						p2.next=null;
						
				}
				
				public static void main(String args[])
				{
				DemoDetectLoop2 obj = new DemoDetectLoop2();
				obj.addNode(10);
				obj.addNode(4);
				obj.addNode(15);
				obj.addNode(20);
				obj.addNode(50);
				obj.last.next =obj.head.next.next;
				boolean result = obj.detectLoopNode();
				System.out.println(result);
				System.out.println();
				obj.traverse();
				
				
				}
			}	
			/*
			Time Complexity = O(n)
			Space Complexity = O(1)
			
			This method is also dependent on Floyd’s Cycle detection algorithm.
1) Detect Loop using Floyd’s Cycle detection algo and get the pointer to a loop node.
2) Count the number of nodes in loop. Let the count be k.
3) Fix one pointer to the head and another to kth node from head.
4) Move both pointers at the same pace, they will meet at loop starting node.
5) Get pointer to the last node of loop and make next of it as NULL.
*/
			
			
			