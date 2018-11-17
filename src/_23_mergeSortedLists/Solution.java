package _23_mergeSortedLists;

import _0_entity.ListNode;

public class Solution {
    private ListNode[] list = null;
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode(0);
        ListNode ptr = res;
        list = lists;
        while(true){
            ListNode one = getMin();
            if(one == null)
                break;
            else
                ptr.next = one;
            ptr = ptr.next;
        }
        return res.next;
    }

    private ListNode getMin(){
        int count = 0;
        while(count < list.length && list[count] == null)
            count++;
        if(count == list.length)
            return null;
        ListNode res = list[count];
        int pos = count;
        for(int i = 0; i < list.length; i++){
            if(list[i] != null && res != null){
                if(list[i].val < res.val){
                    res = list[i];
                    pos = i;
                }
            }
        }
        if(list[pos] != null)
            list[pos] = list[pos].next;
        return res;
    }
}
