/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        boolean flag = false;
        while(node.next!=null)
        {
            ListNode node1 = node.next;
            if(node1.next == null)
                flag =true;
            
            node.val = node1.val;
            if(flag)
                break;
            node = node.next;
        }
        node.next = null;
        
    }
}