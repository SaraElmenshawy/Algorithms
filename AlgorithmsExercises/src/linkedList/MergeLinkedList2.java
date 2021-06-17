package linkedList;

public class MergeLinkedList2 {
	ListNode head; // head of list
	ListNode tail;
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode tnode = l2.head;
		
		 while (tnode != null)
	        {
	        	l1.append(0);
	        }
	       
	        l1.sortList();
	        l1.printList();
	        return l1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
