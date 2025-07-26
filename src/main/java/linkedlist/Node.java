package linkedlist;

public class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}

class MiddleElement {

    public static Node getMiddleElement(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        System.out.println(getMiddleElement(head).data);
    }
}
class Cycle {

    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;

           if(slow==fast) {
               return true;
           }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = head;

        System.out.println(hasCycle(head));
    }
}