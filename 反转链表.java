public class 反转链表 {
    
    public ListNode reverseList(ListNode head) {
    ListNode pre = null;
    ListNode next = null;
    while (head != null) {
        next = head.next;
        head.next = pre;
        pre = head;
        head = next;
    }
    return pre;
}
//双指针循环
}