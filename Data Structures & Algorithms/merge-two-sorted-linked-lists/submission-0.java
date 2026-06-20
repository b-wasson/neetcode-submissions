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
        if(list1 != null && list2 == null){
            return list1;
        }
        
        if(list1 == null && list2 != null){
            return list2;
        }

        if(list1 == null && list2 == null){
            return null;
        }

        ListNode head;

        //find head 
        if(list1.val <= list2.val){
            head = list1;
            list1 = list1.next;
        }else {
            head = list2;
            list2 = list2.next;
        }
        
        ListNode curr = new ListNode(-101);
        ListNode lastNode = head;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                
                
                lastNode.next = list1;
                list1 = list1.next;

            }else{
               
                lastNode.next = list2;
                list2 = list2.next;
            }
            lastNode = lastNode.next; 
        }

        lastNode.next = (list1 != null) ? list1 : list2;



        return head;
    }
}