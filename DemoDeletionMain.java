class Node
{
int data;
Node next;

	Node(int d)
		{
             data = d;
	   }
Node deletion(Node itr, int x)
{
Node p= null;
Node s=null ;
if (itr==null)
{
System.out.println("LinkedList is empty");
return(null);
}

else if(itr.data==x)
{
p = itr.next;
return(p);
}


else
{
p=itr;
s=null;
while(p.next!=null && p.data!=x)
{
s=p;
p= p.next;
}
	if(p.data==x)
	{
	s.next= p.next;
	p=null;
        return(itr);
	}
	else
	{
		System.out.println("Data "+x+" is not available");
	return(itr);	}
}
}
void traverse(Node head)
{
while(head!=null)
{
System.out.print(head.data+",");
head=head.next;
}
System.out.println();
}
}


class DemoDeletionMain
{
public static void main(String args[])
{
Node first = new Node(10);
Node second = new Node(20);
Node third = new Node(30);
Node fourth = new Node(40);
Node fifth = new Node(50);
first.next= second;
second.next= third;
third.next=fourth;
fourth.next=fifth;
first.traverse(first);
first=first.deletion(first,10);
first.traverse(first);
}
}

