class Node
{
int data;
Node next;
	Node(int d)
	{
		data = d;
		
	}
}

class DemoRotateLL
{
		Node head;
		public void traverse()
		{
			Node itr = head;
			while(itr!=null)
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

			public void rotate(int k)
			{
				int i =1;
				Node itr = head;
				Node itr1=null;
				Node itr2=null;
				while(i<k)
				{
					itr=itr.next;
					i++;
				}
				itr1 = itr.next;
				itr.next=null;
				itr2=itr1;
				while(itr2.next!=null)
				{
					itr2=itr2.next;
				}
				itr2.next = head;
				head=itr1;
			}

				public static void main(String args[])
				{
					DemoRotateLL obj = new DemoRotateLL();
					obj.addNode(60);
					obj.addNode(50);
					obj.addNode(40);
					obj.addNode(30);
					obj.addNode(20);
					obj.addNode(10);
					
					obj.traverse();
					obj.rotate(1);
					obj.traverse();
				}
}