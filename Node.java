class Node
{
int data;
Node next;

	Node(int d)
		{
			data=d;
			
		}

	public static void main(String args[])
			{
			Node head = new Node(10);
			Node sec = new Node(20);
			Node thi = new Node (30);
			Node fou = new Node(40);
			Node fiv = new Node(50);
			head.next=sec;
			sec.next=thi;
			thi.next=fou;
			fou.next=fiv;

			printAll(head);
			}
			static void printAll(Node head)
			{
			Node k=head;
				while(k!=null)
				{	
					System.out.println(k.data);
					k=k.next;
				}
			}
			
				
	}