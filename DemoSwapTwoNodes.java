class Node 
{
int data;
Node next;
	Node (int d)
		{
			data=d;
		}
		
		
		
		
		
		
}		
		
		
		
		
				
				
	
				
						
class DemoSwapTwoNodes
{
	
	Node head;
	
	void addNode(int new_data)
		{
			Node node = new Node(new_data);
			node.next = head;
			head = node;
		}
	
	//void swapNodes(int x, int y)
	//{
		//if(head==
	
	void traverse()
		{
			Node itr= head;
			
			while(itr!=null)
			{
				System.out.print(itr.data+",");
				itr=itr.next;
			}
			
			System.out.println();
		}
	
	
	public static void main(String args[])
	{
		DemoSwapTwoNodes obj= new DemoSwapTwoNodes(); 
		
		obj.addNode(60);
		obj.addNode(50);
		obj.addNode(40);
		obj.addNode(30);
		obj.addNode(20);
		obj.addNode(10);
		obj.traverse();
	}
}	
	