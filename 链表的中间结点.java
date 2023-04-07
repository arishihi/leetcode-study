
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode p = head;
        int i = 0;
        while (p != null)
        {
            i++;
            p = p.next;
        };
        
        i = i / 2 ;
        p = head;
        for(int n = 1; n <= i; n++)
        {
            p = p.next;
        }
        
        return p;
    }
}