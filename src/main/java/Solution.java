import java.util.HashSet;
import java.util.Set;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums) {
            set.add(x);
        }
        ListNode cur = head;
        ListNode prev = null;

        while(cur != null) {
            if(set.contains(cur.val)) {
                if(prev != null) {
                    prev.next = cur.next;
                }else {
                    head = cur.next;
                }
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }

        }

        return head;
    }
}