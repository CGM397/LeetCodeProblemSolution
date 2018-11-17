package _19_removeListNode;

import _0_entity.ListNode;

import java.util.ArrayList;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> store = new ArrayList<>();
        ListNode ptr = head;
        store.add(head);
        while(ptr.next != null) {
            store.add(ptr.next);
            ptr = ptr.next;
        }
        int pos = store.size() - n;
        if(pos - 1 >= 0){
            ListNode lastNode = store.get(pos - 1);
            lastNode.next = lastNode.next.next;
            return head;
        }else
            return head.next;
    }
}
