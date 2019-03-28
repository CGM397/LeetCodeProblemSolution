package _025_reverseKGroup;

import _0_entity.ListNode;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tmp = head;
        int count = 0;
        while(tmp != null){
            count++;
            tmp = tmp.next;
        }
        int loopTime = count / k;
        int count1 = 0, count2 = 0;
        ListNode newHead = new ListNode(0);
        ListNode res = null;
        ListNode curNode = head;
        ListNode preNode = null;
        ListNode nextNode;
        while(count1 < loopTime){
            while(count2 < k){
                if(count2 == 0)
                    newHead.next = curNode;

                nextNode = curNode.next;
                curNode.next = preNode;
                preNode = curNode;
                curNode = nextNode;

                if(count2 == k - 1) {
                    if(count1 == 0)
                        res = preNode;
                    preNode = newHead.next;
                }
                count2++;
            }
            count2 = 0;

            count1++;
        }
        return res;
    }
}
