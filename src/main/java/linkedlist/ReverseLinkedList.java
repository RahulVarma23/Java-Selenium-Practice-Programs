package linkedlist;

class ReverseLinkedList {

     int data;
     ReverseLinkedList next;

     public ReverseLinkedList(int data) {
         this.data =data;
     }

     public static ReverseLinkedList reverse(ReverseLinkedList head) {
         if(head == null || head.next == null) {
             return head;
         }

         ReverseLinkedList prev = null;
         ReverseLinkedList current = head;
         ReverseLinkedList temp;

         while(current !=null) {
             temp= current.next;
            current.next=prev;
            prev=current;
            current=temp;
         }
         return prev;
     }

     public static void main(String[] args) {
         ReverseLinkedList head1 = new ReverseLinkedList(1);
         head1.next = new ReverseLinkedList(2);
         head1.next.next = new ReverseLinkedList(3);

         printList(head1);

         ReverseLinkedList ans = reverse(head1);
         printList(ans);
     }

     private static void printList(ReverseLinkedList head) {
         while (head != null) {
             System.out.print(head.data + "->");
             head = head.next;
         }
         System.out.println("null");
     }
 }
