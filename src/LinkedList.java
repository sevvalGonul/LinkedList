
public class LinkedList {
    
    private class Node{
        private Node next;
        private int data;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    
    private Node head;
    public LinkedList() {
        head = null;
    }
    
    public void addToStart(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void addToEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        }
        else {
            Node current = head;
            while(current.next != null)
                current = current.next;
            current.next = newNode;
        }
    }
    
    public void addToMiddle(int position, int data) {
        Node newNode = new Node(data);
        Node current = head;
        for(int i = 1; i < position-1; i++) {
            current = current.next;
        }
        // current'tan sonraya ekleme yapilacak:
        newNode.next = current.next;
        current.next = newNode;
        
    }
    
    public void deleteFromFront() {
        head = head.next;
    }
    
    public void deleteFromMiddle(int position) {
        Node current = head;
        for(int i = 1; i < position-1;i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }
    
    public void deleteFromEnd() {
        Node current = head;
        while(current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
    
    public void print() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
        
    private boolean isEmpty() {
        return head == null;
    }
    
}
