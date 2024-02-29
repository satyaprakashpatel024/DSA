package CodingThinker.linkedlist;

class linkedlist {
    private class Node {
        int data;
        Node next;
        Node() {}
        Node(int val) {
            this.data = val;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int getSize() {
        return this.size;
    }

    public void addFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int val) {
        Node newNode = new Node(val);
        if (head == null || tail == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public int getFirst() {
        if (head != null) {
            return head.data;
        }
        return -1;
    }

    public int getLast() {
        if (tail != null) {
            return tail.data;
        }
        return -1;
    }

    private Node getNode(int k) {
        if (k <= 0 || k > size) {
            return null;
        }
        Node temp = head;
        int indx = 1;
        while (indx < k) {
            temp = temp.next;
            indx++;
        }
        return temp;
    }

    public void addAtIndex(int val, int indx) {
        if (indx < 0 || indx > size) {
            System.out.println(" index doesn't Exist ");
            return;
        } else if (indx == 0) {
            addFirst(val);
            return;
        }
        Node temp = getNode(indx - 1);
        if (temp != null) {
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    public int getAtIndex(int indx) {
        if (indx <= 0 || indx > size) {
            return -1;
        } else if (indx == 1) {
            return getNode(indx).data;
        }
        return getNode(indx).data;
    }

    public void removeFirst() {
        if (head == tail) {
            head = tail = null;
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
    }

    public void removeLast() {
        if (head == null || tail == null) {
            System.out.println("empty list : con't remove");
            return;
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        size--;
    }

    public void removeAtIndex(int indx) {
        if(indx<=0 || indx>size){
            return ;
        }
        else if(indx == size){
            removeLast();
        }
        else if(indx == 1){
            removeFirst();
        }else {
            Node temp = getNode(indx - 1);
            Node currNode = temp.next;
            temp.next = currNode.next;
            currNode.next = null;
        }
        size--;
    }

    public void reverse(){
        Node currNode = head;
        Node prevNode = null;
        tail = head;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }
}
