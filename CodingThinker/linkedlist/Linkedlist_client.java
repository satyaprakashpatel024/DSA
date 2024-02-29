package CodingThinker.linkedlist;

public class Linkedlist_client {
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        System.out.print("Printing list : ");
        ll.display();
//        ll.removeFirst();
//        ll.display();
//        ll.removeLast();
        ll.removeAtIndex(3);
        System.out.print("Printing list : ");
        ll.display();
        ll.reverse();
        System.out.print("Printing reverse list : ");
        ll.display();
//        System.out.println("element at given index : "+ll.getAtIndex(1));
        System.out.println("LinkedList size : "+ll.getSize());
    }
}
