class Node 
{
 int data;
 Node next;
  Node(int d)
  {
	data = d;
	}
}


class DemoInsertInLL
{
 Node head;
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
	 Node node = new Node(d);
	 node.next = head;
	 head = node;
 }
 
 public Node insertNode(Node k)
 {
	 Node p=head.next,q=head;
	 if(head==null)
		 return(k);
	 else if(head.data>k.data)
	 {
		 k.next=head;
		 head=k;
		 return(head);
	 } 
	 else
	 {
		 while( p!=null && p.data<k.data)
		 {
			 p=p.next;
			 q=q.next;
		 }
		 if(p==null)
		 {
			 q.next=k;
			 return(head);
		 }
		 else
		 {
			 q.next = k;
			 k.next = p;
			 return(head);
		 }	 
			 
}
 }


public static void main(String args[])
{
	DemoInsertInLL obj = new DemoInsertInLL();
	for(int i= 50;i>=10;i=i-10)
	{
		obj.addNode(i);
	}
	obj.traverse();
	Node k = new Node(4343);
	Node result = obj.insertNode(k);
	System.out.println();
	while(result!=null)
	{
		System.out.print(result.data+" ");
		result=result.next;
	}	
}
}