import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();

        for(int x : nums) {
            set.add(x);
        }

        ListNode tail = new ListNode();
        ListNode res = null;


        while(head != null) {
            if(!set.contains(head.val)) {
                if(res == null) {
                    res = head;
                    tail = head;
                } else {
                    tail.next = head;
                    tail = tail.next;
                }
            }
            head = head.next;
        }
        tail.next = null;

        return res;
    }
}
