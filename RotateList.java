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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null) return head;
        ListNode t = head;
        int tr = 0;
        while(t!=null){
            tr++;
            t = t.next;
        }
        int r = k % tr;
        if(r==0) return head;
        ListNode L = head;
        ListNode R = head;
        while(r!=0){
            R = R.next;
            r--;
        }
        while(R.next!=null){
            L = L.next;
            R =  R.next;
        }
        ListNode temp = L.next;
        R.next = head;
        head = temp;
        L.next = null;

        return head;
    }
}
