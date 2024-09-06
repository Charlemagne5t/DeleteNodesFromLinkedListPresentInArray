import java.util.HashSet;
import java.util.Set;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();

        for(int x : nums) {
            set.add(x);
        }

        ListNode firstValid = null;
        ListNode lastValid = null;
        while(head != null) {
            if(!set.contains(head.val)) {
                if(firstValid == null) {
                    firstValid = head;
                    lastValid = head;
                }else {
                    lastValid.next = head;
                    lastValid = head;
                }
            }
            head = head.next;
        }
        lastValid.next = null;

        return firstValid;
    }
}