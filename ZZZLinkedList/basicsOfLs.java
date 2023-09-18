package ZZZLinkedList;

public class basicsOfLs {
    public static void displayRecursive(Node head){
        if(head ==null) return;
        System.out.print(head.data+" ");
        displayRecursive(head.next);
    }
    public static void display(Node head){

        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static class Node{
       int data;
       Node next; // this node contains the address of the next node;
        Node(int data){   // constructor
           this.data = data;
        }

    }
    public static void main(String[] args) {
        Node a = new Node(5);  // this is a  head node
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9); // these nodes are not linked to each other;
        Node f = new Node(100);
        // we want to connect these nodes like this
        // 5 >- 6 >- 7 >- 8 >-9
        a.next = b; // address of next node b stores in a
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
//        System.out.println(a.data);           // boring
//        System.out.println(a.next.data);      // tareeqa
//        System.out.println(a.next.next.data); // hai
//        System.out.println(a.next.next.next.data); // display krne ka
//        System.out.println(a.next.next.next.next.data);
       // Node temp = a;
//        for(int i=1; i<=5; i++){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
        // if we don't know   the  length of the linked list
        // we know the address of the last node contains >>>null<<<
//        System.out.println();
//        while(temp.next!=null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
       // display(a);
        displayRecursive(a);


    }
}
