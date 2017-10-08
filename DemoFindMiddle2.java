class Node 
{
int data;
Node next;
	Node(int d)
	{
		data = d;
	}
}


class DemoFindMiddle2
{
	Node head;

	
	
	public void addNode(int d)
	{
		Node node = new Node(d);
		node.next = head;
		head = node;
	}


 int findMiddle()
 {
	 Node s = head;
	 Node p = head;
	 while(s!=null && p!=null && p.next!=null)
	 {
		 s = s.next;
		 p=p.next.next;
	 }
	 return(s.data);

 }
public static void main(String args[])
{
	DemoFindMiddle2 obj = new DemoFindMiddle2();
	obj.addNode(60);
	obj.addNode(50);
	obj.addNode(40);
	obj.addNode(30);
	obj.addNode(20);
	obj.addNode(10);
	int result =obj.findMiddle();
	System.out.println("The Middle of the LL is "+result);
}
}
	