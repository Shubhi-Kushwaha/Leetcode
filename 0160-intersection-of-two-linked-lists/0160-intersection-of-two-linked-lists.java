/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public  int length(ListNode head){
        ListNode temp=head;
        int length=0;
        while(temp!=null){
          length++;
          temp=temp.next;
        }
        return length;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       int len1=length(headA);
       int len2=length(headB);
        if(len1>len2){
            int n=len1-len2;
            for(int i=0;i<n;i++){
                headA=headA.next;
            }
        }else if(len1<len2){
            int m=len2-len1;
            for(int i=0;i<m;i++){
                headB=headB.next;
            }
        }   
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA; 
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null; 
        
        
        
    }
}