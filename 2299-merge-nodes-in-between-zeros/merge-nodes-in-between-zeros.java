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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> al=new ArrayList<>();
        int sum=0;
        while(temp!=null)
        {
            
            if(temp.val!=0)
            {
              sum+=temp.val;
             
            
            }
            else if(temp.val==0)
            {
                al.add(sum);
                sum=0;
            }
             temp=temp.next;
        }
        ListNode t=new ListNode(0);
        ListNode a=t;
        for(int x:al)
        {
            a.next=new ListNode(x);
            a=a.next;
        }
        return t.next.next;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna