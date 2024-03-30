package linkedlist;

public class MergeTwoLinkedList {

    int data;
    MergeTwoLinkedList next;

    MergeTwoLinkedList(int data) {
        this.data = data;
    }

    public static MergeTwoLinkedList mergeList(MergeTwoLinkedList head1, MergeTwoLinkedList head2) {
        if(head1==null) return head2;
        else if(head2==null) return head1;

        MergeTwoLinkedList dummy = new MergeTwoLinkedList(0);

        MergeTwoLinkedList tail = dummy;

        while(head1!=null && head2 !=null) {
            if(head1.data< head2.data) {
                tail.next= head1;
                head1=head1.next;
            }else{
                tail.next=head2;
                head2=head2.next;
            }

            tail=tail.next;

        }

        if(head1==null) {
            tail.next=head2;
        }else if(head2==null) {
            tail.next=head1;
        }
        return dummy.next;
    }

    private static void printList(MergeTwoLinkedList head) {
        while(head !=null) {
            System.out.print(head.data+ "->");
            head=head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeTwoLinkedList head1 = new MergeTwoLinkedList(1);
        head1.next = new MergeTwoLinkedList(3);
        head1.next.next = new MergeTwoLinkedList(5);

        MergeTwoLinkedList head2 = new MergeTwoLinkedList(2);
        head2.next = new MergeTwoLinkedList(4);
        head2.next.next = new MergeTwoLinkedList(8);

        printList(head1);
        printList(head2);

        MergeTwoLinkedList ans = mergeList(head1, head2);
        printList(ans);
    }
}
