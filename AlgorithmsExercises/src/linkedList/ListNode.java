package linkedList;


public class ListNode {

	ListNode head; // head of list
	ListNode tail;
	int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public void append(int new_data)
	{
		ListNode new_node = new ListNode(new_data);

		if (head == null)
		{
			head = new ListNode(new_data);
			return;
		}

		new_node.next = null;

		ListNode last = head;
		while (last.next != null)
			last = last.next;

		last.next = new_node;
		return;
	}
	public void sortList()
    {
  
        // Node current will point to head
		ListNode current = head, index = null;
  
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
                    if (current.val > index.val) {
                        temp = current.val;
                        current.val = index.val;
                        index.val = temp;
                    }
  
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
public void printList()
{
	ListNode tnode = head;
    while (tnode != null)
    {
        System.out.print(tnode.val+" ");
        tnode = tnode.next;
    }
}
}
