class Node 
{
int data;
Node next;
	Node(int d)
	{
		data =d;
	}
}

class DemoDetectLoopByArray
{
	Node head;
	public void traverse()
	{
		Node itr=head;
		while(itr!=null)
		{
			System.out.print(itr.data+" ");
			itr = itr.next;
		}
	}

		public void addNode(int d)
		{
			Node node = new Node(d);
			node.next = head;
			head = node;
		}
		
		public boolean detectLoop()
		{
			int i=0;
			int j=-1;
			Node itr=head;
			Node []visit= new Node[5];
			
			
			while(itr!=null)
			{
				for( i=0;i<=j;i++) 
				{
					if(itr==visit[i])
						break;
				}
				if(itr==visit[i])
					break;
				j++;
				visit[j]=itr;
				itr=itr.next;
				
			}	
			if(itr==null)
				return(false);
			else
				return(true);
			
		}

		public static void main(String args[])
		{
			
			DemoDetectLoopByArray obj = new DemoDetectLoopByArray();
			for(int i = 50;i>0;i=i-10)
			obj.addNode(i);
			obj.traverse();
			//obj.head.next.next.next.next.next=obj.head.next.next;
			boolean result = obj.detectLoop();
			System.out.println(result);
			
		}
}
			
		