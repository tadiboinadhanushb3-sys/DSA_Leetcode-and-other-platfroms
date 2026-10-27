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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while(temp!=null && temp.next!=null)
        {
            int a=temp.val;
            int b=temp.next.val;
            int c=Math.max(a,b);
            int m=0;
            int d=0;
            for(int i=1;i<=c;i++)
            {
                if((a%i==0)&&(b%i==0))
            {
                d=i;
            }
            m=Math.max(d,m);
            }
            ListNode n=new ListNode(m);
            n.next=temp.next;
            temp.next=n;
            temp=n.next;
        }
        return head;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna