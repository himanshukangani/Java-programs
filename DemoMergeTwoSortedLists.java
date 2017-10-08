
class Node
	{
	int data;
	Node next;
	Node(int d)
	{
	 data = d;
	}
	}
	
	class DemoMergeTwoSortedLists
		{
			Node dummy=new Node(0);
			Node tail = dummy;
			Node a=null;
			Node b=null;
			
		public void addNodeToA(int data)
		{
			Node newnode = new Node(data);
			newnode.next=a;
			a=newnode;
		}
			public void addNodeToB(int data)
			{
				Node newnode = new Node(data);
				newnode.next=b;
				b=newnode;
				
			}
				
			public void traverse()
			{
				Node itra=a, itrb=b;
				while(itra!=null)
				{
					System.out.print(itra.data+" ");
					itra=itra.next;
				}
				System.out.println();
				while(itrb!=null)
				{
					System.out.print(itrb.data+" ");
					itrb=itrb.next;
				}
			}			
			
			public Node mergeSorted()
			{
				/*if(a==null)
				{
					dummy.next=b;
					return(dummy.next);
				}
				
				else if(b==null)
				{
					dummy.next=a;
					return(dummy.next);
				}*/
				
				while (a!=null && b!=null)
				{
				if(a.data<b.data)
				{
					tail.next=a;
					a=a.next;
					tail=tail.next;
					tail.next=null;
				}	
				else
				{
					tail.next=b;
					b=b.next;
					tail=tail.next;
					tail.next=null;
		
				}
				}
				if(a==null)
				{
					tail.next=b;
					return(dummy.next);
				}
				else
				{
					tail.next=a;
					return(dummy.next);
				}
			}
			
			
				
				
				
					
					
		public static void main(String args[])
			{
				DemoMergeTwoSortedLists obj = new DemoMergeTwoSortedLists();
				
				obj.addNodeToA(15);
				obj.addNodeToA(10);
				obj.addNodeToA(5);
				
				obj.addNodeToB(20);
				obj.addNodeToB(3);
				obj.addNodeToB(2);
				
				obj.traverse();
				System.out.println();
				Node tail = obj.mergeSorted();
				while(tail!=null)
				{
					System.out.print(tail.data+" ");
					tail=tail.next;
				}
				
			}	
		}
		
				
				
					
		
		
		
			