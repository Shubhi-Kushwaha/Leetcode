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
        public static int size(ListNode head){
            ListNode t=head;
            int c=0;
            while(t!=null){
                c++;
                t=t.next;
            }
            return c;
        }
         public int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
        public int getDecimalValue(ListNode head) {
            ListNode t=head;
            int n=size(head);
            int v=0;
            while(t!=null){
                if(t.val==1){
                    v=v+power(2,n-1);
                    t=t.next;
                    n--;
                }
                else if(t.val==0){
                   n--;
                   t=t.next;
                }
            }
            return v;

        }
    }