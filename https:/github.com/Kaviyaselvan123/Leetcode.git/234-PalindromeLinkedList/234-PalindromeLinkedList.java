// Last updated: 7/14/2026, 2:05:38 PM
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
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while( fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next!=null) return slow.next;
        return slow;
    }
    public ListNode reverseList(ListNode h1) {
        ListNode h2=null;
        while(h1!=null){
            ListNode temp=h1;
            h1=h1.next;
            temp.next=h2;
            h2=temp;
        }
        return h2;
    }
    public boolean isPalindrome(ListNode h1) {
        ListNode midE1=middleNode(h1);
        ListNode h2=reverseList(midE1);
        while(h2!=null){
            if(h1.val!=h2.val) return false;
            h1=h1.next;
            h2=h2.next;
        } 
        return true;
    }
}