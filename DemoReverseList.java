
class Node 
{
 int data;
 Node next;
  Node(int d)
	{
		data = d;
		
	}
	
}	

class DemoReverseList
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
	}
	
	
	 public void addNode(int d)
	{
		 Node node = new Node(d);
		 node.next = head;
		 head = node;
		
	}	



	void reverseList()
	 {
		 Node s=null,p=head,itr=null;
		 while(p!=null)
		 {
			 s=itr;
			 itr=p;
			 p=p.next;
			 itr.next=s;
		 }	 
		 head = itr;
	 }

		public static void main(String args[])
		{
			int data=80;
			DemoReverseList obj = new DemoReverseList();
			for(int i=1;i<9;i++)
			{
			obj.addNode(data);
			data = data -10;
			}
			
			obj.traverse();
			obj.reverseList();
			System.out.println();
			obj.traverse();
			}
}
			
			
		
		
		