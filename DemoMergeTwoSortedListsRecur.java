class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
		}
	}


		class DemoMergeTwoSortedListsRecur
		{
			static Node a;
			static Node b;
			//Node result;
			public void addNodeA(int d)
			{
				Node node = new Node(d);
				node.next=a;
				a=node;
			}
			
			public void addNodeB(int d)
			{
				Node node = new Node(d);
				node.next=b;
				b=node;
			}	
				
		public void traverse(Node itr)
		{
		
		 while (itr!=null)
		 {
		 System.out.print(itr.data+" ");
		 itr=itr.next;
		 }
		 System.out.println();
		 }
		 
		 public Node mergeSorted(Node a, Node b)
		 {
			 Node result;
			 if(a==null)
			 {
				 result=b;
				 return(result);
			 }
			 else if(b==null)
			 {
				 result=a;
				 return(result);
			 }
			  
			  else
			  {
			 
				 if(a.data<b.data)
				 {
					 result=a;
					 result.next=mergeSorted(a.next,b);
				 } 
				 else
				 {
					 result=b;
					result.next= mergeSorted(a,b.next);
			 
				 }
			  }
			  return(result);
		 } 
				 
				 
			 
		
		public static void main(String args[])
		{
			DemoMergeTwoSortedListsRecur obj = new DemoMergeTwoSortedListsRecur();
			obj.addNodeA(15);
			obj.addNodeA(10);
			obj.addNodeA(5);
			
			obj.addNodeB(20);
			obj.addNodeB(11);
			obj.addNodeB(2);
			
			obj.traverse(a);
			obj.traverse(b);
			
			Node result = obj.mergeSorted(a,b);
			while(result!=null)
			{
				System.out.print(result.data+" ");
				result=result.next;
			}
				
			
		}
		}		