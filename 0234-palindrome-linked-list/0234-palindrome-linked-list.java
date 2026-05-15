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
        List<Integer> stack = new ArrayList<>();

        while (head != null) {
            stack.add(head.val);
            head = head.next;
        }
        int l = 0, r = stack.size() - 1;
        while (l <= r) {
            if (stack.get(l) != stack.get(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}