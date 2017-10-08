class Node
{
int data;
Node next;
 
 Node(int d)
 {
  data = d;
  }
 Node deletePos(Node itr, int x)
	{
		Node s=null,p=itr;
		if(itr==null)
			return(null);
		else if(x==0)
		{
			p=itr.next;
			itr.next=null;
			System.gc();
			return(p);
	    }
		
		else
		{
			int count=0;
			while(p.next!=null && count!=x)
			{
				count++;
				s=p;
				p=p.next;
			}
			if(count==x)
			{
				s.next=p.next;
				p.next=null;
				System.gc();
				return(itr);
			}
				else{
					System.out.println("The position "+x+" is not available");
					return(itr);
					}
			
				
		}
	}	
	  void traverse(Node itr)
	{
		while(itr!=null)
		{
		System.out.print(itr.data+",");
		itr= itr.next;
		}
		System.out.println();
	}
	
	}
	
class DemoDeletePosMain
	{
	 public static void main(String args[])
	 {
	 Node first = new Node(10);
	 Node second = new Node(20);
	 Node third = new Node(30);
	 Node fourth = new Node(40);
	 Node fifth = new Node(50);
	 first.next = second;
	 second.next=third;
	 third.next=fourth;
	 fourth.next=fifth;
	 first.traverse(first);
	 first=first.deletePos(first,4);
	 first.traverse(first);
	 }
	}
		
	
	