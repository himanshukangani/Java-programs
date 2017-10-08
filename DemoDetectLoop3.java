class Node
{
 int data;
 Node next;
 Node(int d)
 {
	data = d;
	}
}

class DemoDetectLoop3
{
Node head;
Node last;
int flag = 1;
	public void traverse()
	{
		Node itr = head;
		while(itr!=null)
		{
			System.out.print(itr.data+" ");
			itr=itr.next;
		}
	}

		public void addNode(int d)
		{
			if(flag==1)
			{
				Node node = new Node(d);
				node.next= head;
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

			public void detectLoop()
			{
				Node s=head,f=head.next;
				while(s!=null && f!=null && f.next!=null && s!=f)
				{
					s=s.next;
					f=f.next.next;
				}
				if(s==f)
				{
					System.out.println("have loop");
					removeLoop(s);
				}
				else
				
					System.out.println("Does not have loop");
					
			}
			
			
				public void removeLoop(Node loop)
				{
					
					Node p1 = head;
					Node p2 = loop;
					while(p2.next != p1)
					{
						p2=p2.next;
						p1=p1.next;
					}
						p2.next=null;
						
						//System.out.println("yehi hai right choice");
				}
				
			public static void main(String args[])
			{
				DemoDetectLoop3 obj = new DemoDetectLoop3();
				obj.addNode(43);
				obj.addNode(4);
				obj.addNode(5);
				obj.addNode(6);
				obj.addNode(2);
				obj.addNode(67);
				obj.traverse();
				obj.last.next = obj.head.next.next;
				obj.detectLoop();
				System.out.println();
				obj.traverse();
				
				
			}
}
/*
Time Complexity O(n)
Space Complexity O(1)
Algo - */