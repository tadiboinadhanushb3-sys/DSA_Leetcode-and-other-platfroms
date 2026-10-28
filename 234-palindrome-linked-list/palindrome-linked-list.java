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
    public boolean isPalindrome(ListNode head) {
        ListNode cur = head;
        ListNode original=new ListNode(head.val);
        
        ListNode prev=null;
        if(head==null)
        {
            return true;
        }
        ListNode t=original;
        ListNode temp=head;
        while(temp.next!=null)
        {
        
          temp=temp.next;
          t.next=new ListNode(temp.val);
          t=t.next;
        }
        
        while(cur!=null)
        {
          ListNode next=cur.next;
          cur.next=prev;
          prev=cur;
          cur=next;
         if(next!=null)
         {
          next=next.next;
         }
          
        }
        ListNode h1=prev;
        ListNode h2=original;
        while(h1!=null&&h2!=null)
        {
            if(h1.val!=h2.val)
            {
                return false;
            }
            h1=h1.next;
            h2=h2.next;
        }
    return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna