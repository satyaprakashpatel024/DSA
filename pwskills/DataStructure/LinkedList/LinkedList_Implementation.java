package pwskills.DataStructure.LinkedList;

public class LinkedList_Implementation {
    public static class Node{
        int data;
        Node next;
        Node(){}

        Node(int x){
            this.data = x;
            this.next = null;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size  = 0;

        void insertAtBeg(int val){
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
                tail.next = newNode;
            }else{
                newNode.next = head;
                head = newNode;
            }
            size++;
        }
        void insertAtEnd(int x){
            Node newNode = new Node(x);
            if(head==null){
                head = newNode;
            }else{
                tail.next = newNode;
            }
            tail = newNode;
            size++;
        }
        void insertAt(int indx,int val){
            Node temp = head;
            Node newNode = new Node(val);
            if(indx==size()){
                insertAtEnd(val);
                return;
            }else if(indx==0) {
                insertAtBeg(val);
                return;
            }else if(indx<0 || indx>size()){
                System.out.println(indx+" doesn't exist");
                return;
            }else{
                for(int i=1; i<indx; i++){
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
            size++;
        }
        int getAt(int indx){
            Node temp = head;
            if(indx<0 || indx>size()){
                System.out.println(indx+" doesn't exist");
                return -1;
            }
            for(int i=0; i<indx; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void display(){
            Node temp = head;
            while(temp.next!=null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
        int size(){
            return size;
        }
        void deleteAt(int indx){
            Node temp = head;
            if(indx==0){
                head = head.next;
                size--;
                return;
            }
            else if(indx==size()){
                for(int i=1; i<indx; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                tail = temp;
            }else {
                for (int i = 1; i < indx; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
            size--;
        }
    }
//    public static void display(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//    }
//    public static void display2(Node head){
//        if(head==null){
//            return ;
//        }
//        System.out.print(head.data+" ");
//        display2(head.next);
//    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(12);
        ll.display();

        ll.insertAtEnd(22);
        ll.insertAtEnd(32);
        ll.display();

        ll.insertAtBeg(25);
        ll.insertAtBeg(45);

        ll.insertAt(6,52);
        ll.insertAt(2,86);
        ll.display();
        int x = ll.size();
        System.out.println(x);
        ll.deleteAt(4);
        ll.display();
        System.out.println(ll.tail.data);
        System.out.println(ll.size());

    }
}
