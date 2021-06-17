package linkedList;

public class MergeList {
	// Linked List Class
		Node head; // head of list
		Node tail;
		/* Node Class */
		class Node
		{
			int data;
			Node next;
			
			// Constructor to create a new node
			Node(int d) {data = d; next = null; }
		}

	/* Appends a new node at the end. This method is
	defined inside LinkedList class shown above */
	public void append(int new_data)
	{
		/* 1. Allocate the Node &
		2. Put in the data
		3. Set next as null */
		Node new_node = new Node(new_data);

		/* 4. If the Linked List is empty, then make the
			new node as head */
		if (head == null)
		{
			head = new Node(new_data);
			return;
		}

		/* 4. This new node is going to be the last node, so
			make next of it as null */
		new_node.next = null;

		/* 5. Else traverse till the last node */
		Node last = head;
		while (last.next != null)
			last = last.next;

		/* 6. Change the next of last node */
		last.next = new_node;
		return;
	}

	 public void sortList()
	    {
	  
	        // Node current will point to head
	        Node current = head, index = null;
	  
	        int temp;
	  
	        if (head == null) {
	            return;
	        }
	        else {
	            while (current != null) {
	                // Node index will point to node next to
	                // current
	                index = current.next;
	  
	                while (index != null) {
	                    // If current node's data is greater
	                    // than index's node data, swap the data
	                    // between them
	                    if (current.data > index.data) {
	                        temp = current.data;
	                        current.data = index.data;
	                        index.data = temp;
	                    }
	  
	                    index = index.next;
	                }
	                current = current.next;
	            }
	        }
	    }
	public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
	 public MergeList mergeTwoLists(MergeList l1, MergeList l2) {
		 
		 	Node tnode = l2.head;
	        while (tnode != null)
	        {
	        	l1.append(tnode.data);
	        }
	       
	        l1.sortList();
	        l1.printList();
	        return l1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeList l1= new MergeList();
		l1.append(1);
		l1.append(2);
		l1.append(4);
		MergeList l2= new MergeList();
		l1.append(1);
		l1.append(3);
		l1.append(4);
		new MergeList().mergeTwoLists(l1, l2);

	
	}

}
