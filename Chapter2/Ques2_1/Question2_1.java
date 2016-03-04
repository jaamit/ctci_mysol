import java.util.HashSet;
import java.util.Set;

/*
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class Question2_1 {
	
	// Similar to finding duplicates in an array
	// HashTable is ideal to use here 
	// 
	private static void deleteDupsHash(LinkedListNode node) {
		if(node == null || node.next == null) return;		
		
		LinkedListNode curr = node;
		LinkedListNode prev = null; // prev should track only the unique elements
		Set<Integer> set = new HashSet<>();
		while(curr != null) {
			if(set.contains(curr.data)) { // duplicates found... remove node
				prev.next = curr.next;				
			} else {
				set.add(curr.data);
				prev = curr;
			}
			
			// following is a bug - as it produces following result 
			/*0->1->0->1
			0->1->1
			as it resets prev to duplicate node
			*/
			//prev = curr; 
			
			curr = curr.next;
		}
	}
	
	// O(N^2) solution - check for each element against each other
	private static void deleteDupsLoop(LinkedListNode head) {
		if(head == null || head.next == null) return;
		
		LinkedListNode curr = head;		
		while(curr != null) {
			
			LinkedListNode runner = curr;
			while(runner.next != null) {
				if(curr.data == runner.next.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			
			curr = curr.next;
		}		
	}
	
	// Gayle's test cases
	public static void main(String[] args) {	
		LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i % 2, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		System.out.println(head.printForward());
		LinkedListNode clone = head.clone();
		deleteDupsHash(head);
		System.out.println(head.printForward());
		deleteDupsLoop(clone);
		System.out.println(clone.printForward());
	}


	

}
