package temperary;

public class CircularSingly {
        private static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next = null;
            }
        }
        Node head;
        Node tail;
        int size;
        void insertFirst(int data){
            Node newNode= new Node(data);

            if(head==null){
                head=newNode;
                tail=newNode;
                size++;
                return;
            }else{
                newNode.next=head;
                head=newNode;
                tail.next=newNode;
                size++;
            }

        }
        void display(){
            Node temp=head;
            do{
                System.out.print(temp.data+"-->");
                temp=temp.next;

            }
            while(temp!=head);
        }
        public static void main(String[] args) {
            CircularSingly ll = new CircularSingly();
            ll.insertFirst(10);
            ll.insertFirst(30);
            ll.insertFirst(20);
//            ll.insertFirst(40);
            ll.display();
    }
}
