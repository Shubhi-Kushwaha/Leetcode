/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head; // Return null if the list is empty
        }
        
        // Handle case where the head node has the target value
        while (head != null && head.val == val) {
            head = head.next;
        }
        
        // Now we can safely start from the second node
        ListNode t = head;

        // Traverse through the list
        while (t != null && t.next != null) {
            if (t.next.val == val) {
                // Skip the node with the target value
                t.next = t.next.next;
            } else {
                // Move to the next node
                t = t.next;
            }
        }

        return head;
    }
}
