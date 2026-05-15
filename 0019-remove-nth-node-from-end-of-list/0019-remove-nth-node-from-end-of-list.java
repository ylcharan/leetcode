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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cpy = head;
        ListNode speed = head;
        while (n > 0) {
            speed = speed.next;
            n--;
        }
        if (speed == null) return cpy.next;
        while (speed != null) {
            if (speed.next == null) {
                ListNode temp = head.next.next;
                head.next = temp;
                break;
            }
            speed = speed.next;
            head = head.next;
        }

        return cpy;
    }

}