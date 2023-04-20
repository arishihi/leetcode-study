import java.util.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */    // 分治法
public class mergeklists {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists == null || lists.size() == 0)return null;
        return mergelists(lists, 0, lists.size() - 1);

    }
    public ListNode mergelists(ArrayList<ListNode> lists, int l, int f) {
        if (l == f) return lists.get(l);
        ListNode list1 = mergelists(lists, l,l+(f-l)/2);
        ListNode list2 = mergelists(lists, l+1+(f-l)/2, f);
        return merge2(list1, list2);
    }
    public ListNode merge2(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if (list1 != null) {
            tail.next = list1;
        }
        if (list2 != null) {
            tail.next = list2;
        }
        return dummy.next;
    }
}
