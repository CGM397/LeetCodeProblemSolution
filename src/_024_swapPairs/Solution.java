package _024_swapPairs;

import _0_entity.ListNode;

/**
 * Your algorithm should use only constant extra space.
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 * Well done!
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode tmp1;
        ListNode tmp2;
        ListNode res;
        ListNode ptr = new ListNode(0);
        ptr.next = head;
        res = ptr;
        while(ptr.next != null && ptr.next.next != null){
            //delete
            tmp1 = ptr.next;
            ptr.next = ptr.next.next;
            ptr = ptr.next;

            //insert
            tmp2 = ptr.next;
            ptr.next = tmp1;
            tmp1.next = tmp2;

            ptr = ptr.next;
        }
        return res.next;
    }
}
