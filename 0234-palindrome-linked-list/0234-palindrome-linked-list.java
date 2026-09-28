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
    public boolean isPalindrome(ListNode head) {
        ListNode rev = null;
        ListNode curr = head;
        while(curr != null){
          ListNode temp = new ListNode(curr.val);
          temp.next = rev;
          rev = temp;
          curr = curr.next;
        }

        curr = head;
        while(curr != null) {
            if(curr.val != rev.val) return false;
            curr = curr.next;
            rev = rev.next;
        }

        return true;
    }
}