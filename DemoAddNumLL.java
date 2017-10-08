//import java.math.*;
class Node 
{
 int data;
 Node next;
 Node(int d)
 {
	data = d;
 }
}

class DemoAddNumLL
{
	Node head1;
	Node head2;
	
	public void traverse(Node itr)
	{
		
		while(itr!=null)
		{
			System.out.print(itr.data+" ");
			itr = itr.next;
		}
		System.out.println();
	}

		public void addNode1(int d)
		{
			Node node = new Node(d);
			node.next = head1;
			head1 = node;
		}
		
		public void addNode2(int d)
		{
			Node node = new Node(d);
			node.next = head2;
			head2 = node;
		}
		
		public int addTwoNum()
		{
			int  sum=0;
			int  i =0;
			Node itr = head1;
			while(itr!=null)
			{
				
				sum=sum+(itr.data*((int)(Math.pow(10,i))));
				i++;
				itr=itr.next;
			
			}
			itr = head2;
			i=0;
			while(itr!=null)
			{
				sum=sum+(itr.data*((int)(Math.pow(10,i))));
				i++;
				itr=itr.next;
			}	
			return(sum);
			
		
		}
		
		
		public static void main(String args[])
		{
			DemoAddNumLL obj = new DemoAddNumLL();
			
			obj.addNode1(2);
			obj.addNode1(4);
			obj.addNode1(5);
			obj.addNode1(2);
			
			obj.addNode2(2);
			obj.addNode2(5);
			obj.addNode2(5);
			
			obj.traverse(obj.head1);
			obj.traverse(obj.head2);
			int result = obj.addTwoNum();
			System.out.println(result);
			int x;
			while(result!=0)
			{
				 x = result%10;
				result = result/10;
				
				
			
		}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			