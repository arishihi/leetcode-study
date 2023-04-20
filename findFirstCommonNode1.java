public class findFirstCommonNode1 {
public ListNode findFirstCommonNode(ListNode head1, ListNode head2) {
    if (head1 == null || head2 == null) {
        return null;
    }
    int len1 = getLength(head1);
    int len2 = getLength(head2);
    ListNode p1 = head1, p2 = head2;
    int diff = Math.abs(len1 - len2);
    if (len1 > len2) {
        for (int i = 0; i < diff; i++) {
            p1 = p1.next;
        }
    } else {
        for (int i = 0; i < diff; i++) {
            p2 = p2.next;
        }
    }
    while (p1 != null && p2 != null) {
        if (p1 == p2) {
            return p1;
        }
        p1 = p1.next;
        p2 = p2.next;
    }
    return null;
}

private int getLength(ListNode head) {
    int len = 0;
    ListNode p = head;
    while (p != null) {
        len++;
        p = p.next;
    }
    return len;
}
}