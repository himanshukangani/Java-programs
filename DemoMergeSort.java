class Node
	{
		int data;
		Node next;
		Node(int d)
		{
		data = d;
		}
	}

class DemoMergeSort
	{
	 Node head;
	
		public void traverse()
			{
			Node itr= head;
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
				
				public Node mergeSort(Node head)
				{
					Node result=null;
					if(head !=null && head.next!=null)
					{
						Node mid= head;
						Node p = head;
						while(p!=null && p.next !=null)
						{
							mid=mid.next;
							p=p.next.next;
						}
						
						mergeSort(head);
						mergeSort(mid);
						 result = mergeSorted(head,mid);
						
					}
					return(result);
				}
				// sort 2 sorted ll
				public Node mergeSorted(Node p,Node q)
				{
					Node dummy = new Node(-1);
					Node tail = dummy;
					while(p!=null && q!=null)
					{
						if(p.data<q.data)
						{
							tail.next = p;
							p=p.next;
							tail=tail.next;
							tail.next = null;
						}
						else{
							tail.next = q;
							q=q.next;
							tail = tail.next;
							tail.next = null;
						}
							if(p==null)
								tail.next = q;
							else
								tail.next = p;
						
				}
				return(dummy.next);
				}
			
			
			
				
			public static void main(String args[])
			{
				DemoMergeSort obj = new DemoMergeSort();
				obj.addNode(20);
				obj.addNode(11);
				obj.addNode(2);
				obj.addNode(10);
				obj.addNode(15);
				obj.addNode(5);
				
				obj.traverse();
			 Node result = obj.mergeSort(obj.head);
			 obj.mergeSort(result);
			    
			}
	}	
				
					
			