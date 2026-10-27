/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode ln1=new ListNode();
            ListNode ln2=ln1;
            while(list1!=null&&list2!=null)
            {
                if(list1.val<list2.val)
                {
                  ln2.next=list1;
                  list1=list1.next;
                  ln2=ln2.next;
                }
                else
                {
                  ln2.next=list2;
                  list2=list2.next;
                  ln2=ln2.next;
                }
            }
            ln2.next=(list1!=null)?list1:list2;
            return ln1.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna