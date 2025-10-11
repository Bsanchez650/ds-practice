package LinkedLists;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class LinkedListPractice {

    public static ListNode insertAtBeginning(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public static ListNode insertAtEnd(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            return head;
        }

        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            //newNode.next = temp; -> i got this wrong
        }
        //It needs to be over here and other way around
        temp.next = newNode;

        //i need to remember to have a return statement
        return head;
    }

    public static ListNode deleteNode(ListNode head, int val) {
        // Your code here
        // Hints:
        // 1. If head.val == val, return head.next (skip head)
        // 2. Otherwise, traverse to find node where node.next.val == val
        // 3. Skip over that node: node.next = node.next.next
        // 4. Return head

        //ListNode newNode = new ListNode(val); i dont need top create a new node
        //if(head.val == val){- so my logic was correct but i have to take care of null checks
            if(head != null & head.val == val){
                return head.next;
        }

        ListNode temp = head;
        //while (temp.next.val != val){-> here too i have to take care of null checks,
        //we dont want our code crashing
        while(temp != null && temp.next != null && temp.next.val != val){
          temp = temp.next;
        }
        //newNode.next = newNode.next.next;-> since i dont got a newNOde i gotta out temp
        // but i also gotta create another check because two things can happen
        //either we found the data or its not in the list
        //so we gotta check
        if(temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;

    }






    public static void main(String[] args){

    }


}
