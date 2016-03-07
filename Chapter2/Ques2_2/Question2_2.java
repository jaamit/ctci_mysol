/* 
 * Implement an algorithm to find the kth to last element of a singly linked list.
 */

public class Question2_2 {
	
	// Iterative solution using 2 pointers p1 & p2
	// Move p2 to Kth index and then move p1 & p2 at same speed
	// when p2 reaches end p1 is at Kth index
	
	public static LinkedListNode returnKth(LinkedListNode head, int k) {
		if (head == null || k <= 0) return null;		
		
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		
		for(int i=0; i<k-1; i++) {
			if(p2 == null) return null;
			p2 = p2.next;
		}
		if(p2 == null) return null;
		while(p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
				
		return p1;
	}
	
	public static void main(String[] args) {
		LinkedListNode head = AssortedMethods.randomLinkedList(5, 0, 10);
		System.out.println(head.printForward());
		int nth = 3;
		//IntWrapper wr = new IntWrapper();
		LinkedListNode n = returnKth(head, nth);
		//nthToLastR1(head, nth);
		if (n != null) {
			System.out.println(nth + "th to last node is " + n.data);
		} else {
			System.out.println("Null.  n is out of bounds.");
		}
	}

}
