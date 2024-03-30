package linkedlist;

public class MiddleElement {

    int data;
    MiddleElement next;

    MiddleElement(int data) {
        this.data =data;
    }


     public static MiddleElement getMiddle(MiddleElement head) {
         MiddleElement slow = head;
         MiddleElement fast = head;

         while (fast!=null && fast.next!=null) {
             slow= slow.next;
             fast=fast.next.next;
         }
         return slow;
     }

    public static void main(String[] args) {
        MiddleElement head = new MiddleElement(1);

        // Adding nodes to the linked list
        head.next = new MiddleElement(2);
        head.next.next = new MiddleElement(3);
        head.next.next.next = new MiddleElement(4);
        head.next.next.next.next = new MiddleElement(5);

        System.out.println("Original Linked List:");
        printList(head);

        //print middle node
        MiddleElement middleNode = getMiddle(head);
        System.out.println("Middle element is: "+ middleNode.data);
    }

    private static void printList(MiddleElement head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }
}
