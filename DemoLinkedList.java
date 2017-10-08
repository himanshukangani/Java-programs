class DemoLinkedList
{
Node head;
{
static class Node{
int data;
Node next;
Node(int d)
{
data = d;
next=NULL;
}
}
}


void printAll()
{
Node n=head;
while(n!=NULL)
{
System.out.println(n.data);
n=n.next;
}
}
}

public static void main(String args[])
{
DemoLinkedList llist = new DemoLinkedList();
llist.head = new Node(1);
Node second = new Node(2);
Node third = new Node(3);
llist.head.next=second;
second.next=third;
third.next=NULL;

llist.printAll();
}


