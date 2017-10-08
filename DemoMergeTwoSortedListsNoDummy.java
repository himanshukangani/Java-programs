
class Node
	{
	int data;
	Node next;
	Node(int d)
	{
	 data = d;
	}
	}
	
	class DemoMergeTwoSortedListsNoDummy
		{
			Node front=null; int flag=1;
			Node tail=null;
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
				
				if(a==null)
				{
					front=b;
					return(front);
				}
				
				else if(b==null)
				{
					front=a;
					return(front);
				}
				
				else
				{
				
				while (a!=null && b!=null)
				{
				if(a.data<b.data)
				{
					if(flag==1)
					{
						flag=0;
						front=a;
						tail=a;
						a=a.next;
					tail=tail.next;
					tail.next=null;
					}
					else
					{
						tail.next=a;
					
					a=a.next;
					tail=tail.next;
					tail.next=null;
					}
				}	
				else
				{
					if(flag==1)
					{
						flag=0;
						front = b;
						tail=b;
						b=b.next;
					//tail=tail.next;
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
				}
				if(a==null)
				{
					tail.next=b;
					return(front);
				}
				else
				{
					tail.next=a;
					return(front);
				}
			}
			}
			
				
				
				
					
					
		public static void main(String args[])
			{
				DemoMergeTwoSortedListsNoDummy obj = new DemoMergeTwoSortedListsNoDummy();
				
				obj.addNodeToA(15);
				obj.addNodeToA(10);
				obj.addNodeToA(5);
				
				obj.addNodeToB(70);
				obj.addNodeToB(40);
				obj.addNodeToB(2);
				
				obj.traverse();
				System.out.println();
				 Node k = obj.mergeSorted();
				while(k!=null)
				{
					System.out.print(k.data+" ");
					k=k.next;
				}
				
			}	
		}
		
				