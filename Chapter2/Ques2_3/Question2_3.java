/*
 * Implement an algorithm to delete a node in the middle of a singly linked list,
 * given only access to that node.
 * EXAMPLE
 * Input: the node c from the linked list a->b->c->d->e
 * Result: nothing is returned, but the new linked list looks like a- >b- >d->e
 * 
 */

public class Question2_3 {
	
	private static void deleteNode(LinkedListNode next) {
		// TODO Auto-generated method stub
		LinkedListNode temp = next;
		if(next == null || temp.next == null) {
			return;
		}
		temp.data = temp.next.data;
		temp.next = temp.next.next;
		
	}
	
	public static void main(String[] args) {
		LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
		System.out.println(head.printForward());
		deleteNode(head.next.next.next.next); // delete node 4
		System.out.println(head.printForward());
	}



}
