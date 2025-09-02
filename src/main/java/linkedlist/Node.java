package linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Node {

    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class MiddleElement {

    private static Node getMiddleElement(Node head) {
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

    private static boolean hasCycle(Node head) {
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

class Palindrome {

    private static boolean isPolindrome(Node head) {
        if(head==null || head.next==null) {
            return true;
        }

        StringBuilder sb = new StringBuilder();

        while(head !=null) {
            sb.append(head.data);
            head = head.next;
        }

        String original = sb.toString();
        String reversed = sb.reverse().toString();

        return original.equals(reversed);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println(isPolindrome(head));
    }
}

class NodeFromEnd {

    private static int findNthNodeFromEnd(Node head, int n) {
        int i=0;
        Node first=head;
        Node second=head;
        while(first!=null && i<n) {
            first= first.next;
            i++;
        }

        while(first!=null) {
            first= first.next;
            second = second.next;
        }

        assert second != null;
        return second.data;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println(findNthNodeFromEnd(head, 4));
        System.out.println(findNthNodeFromEnd(head, 2));
    }
}

class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node ans = reverseLL(head);

        while(ans!=null) {
            System.out.print(ans.data+"->");
            ans = ans.next;
        }
    }

    private static Node reverseLL(Node head) {
        if(head==null || head.next==null) {
            return head;
        }

        Node current = head;
        Node prev = null;
        Node temp;

        while(current !=null) {
            temp = current.next;   //store next node
            current.next = prev;   //reverse the link
            prev = current;        // move prev forward
            current = temp;        //move current forward
        }
        return prev;
    }
}

class  SortLinkedList{

    private static Node sort(Node head) {
        Node temp = head;
        List<Integer> list = new ArrayList<>();

        while(temp !=null) {
            list.add(temp.data);
            temp = temp.next;
        }

        Collections.sort(list);
        temp = head;

        for(int n : list) {
            temp.data = n;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(4);

        Node ans = sort(head);

        while(ans!=null) {
            System.out.print(ans.data+"->");
            ans = ans.next;
        }
    }
}

class PairsWithSum {
    //find pairs with target sum from given sorted doubly linked list
    public static void main(String[] args) {
        // build DLL properly
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;

        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = new Node(5);
        head.next.next.next.next.prev = head.next.next.next;

        System.out.println(findPairsWithSumFromSortedLL(head, 5));
    }

    private static Node findTail(Node head) {
        Node tail=head;
        while(tail!=null && tail.next !=null) {
            tail = tail.next;
        }
        return tail;
    }

    private static List<List<Integer>> findPairsWithSumFromSortedLL(Node head, int target) {
        Node left = head;
        Node right = findTail(head);

        List<List<Integer>> ans = new ArrayList<>();

        while(left.data<right.data) {

            if(left.data + right.data==target) {
                ans.add(Arrays.asList(left.data, right.data));
                left=left.next;
                right = right.prev;
            }else if(left.data + right.data<target) {
                left=left.next;
            }else {
                right=right.prev;
            }
        }
        return ans;
    }
}

class MergeSortedLL {

    private static Node mergeTwoSortedLinkedList(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node current = dummy;

        while(l1!=null && l2!=null) {
            if(l1.data<=l2.data) {
                current.next = l1;
                l1=l1.next;
            }else {
                current.next = l2;
                l2=l2.next;
            }
            current = current.next;
        }

        if(l1!=null) {
            current.next = l1;
        }else {
            current.next = l2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(7);

        Node head1 = new Node(2);
        head1.next = new Node(3);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(6);

        Node ans = mergeTwoSortedLinkedList(head, head1);

        while(ans!=null) {
            System.out.print(ans.data+"->");
            ans = ans.next;
        }
    }
}

class RotateLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node ans = rotate(head, 2);

        while(ans!=null) {
            System.out.print(ans.data+"->");
            ans = ans.next;
        }
    }

    private static Node findNthNode(Node temp, int k) {
        int i = 1;
        while(temp !=null) {
            if(i==k) {
                return temp;
            }
            i++;
            temp = temp.next;
        }
        return temp;
    }

    private static Node rotate(Node head, int k) {
        if(head ==null || head.next==null || k==0) {
            return head;
        }
        int len = 1;
        Node temp = head;
        while(temp.next!=null) {
            temp=temp.next;
            len++;
        }

        if(k%len==0) {
            return head;
        }

        temp.next=head;

        Node newLastNode = findNthNode(head, len-k);

        head = newLastNode.next;
        newLastNode.next=null;

        return head;
    }
}