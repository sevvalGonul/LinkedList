
public class Test {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        // 1 2 3 4 5 elemanlarını linked liste ekleyelim(addToEnd):
        for(int i = 1; i < 6; i++) {
            linkedList.addToEnd(i);
        }
        linkedList.print();
        
        // Linked Listin başına 7 elemanını ekleyelim:
        linkedList.addToStart(7);
        linkedList.print();
        
        // Linked Listte 3.pozisyona 8 elemanını ekleyelim
        linkedList.addToMiddle(3, 8);
        linkedList.print();
        
        // 5.pozisyona 10 elemanını ekleyelim:
        linkedList.addToMiddle(5, 10);
        linkedList.print();
        
        // Head Node u silelim yani en baştaki elemanı silelim:
        linkedList.deleteFromFront();
        linkedList.print();
        
        // 4.pozisyondaki elemanı silelim:
        linkedList.deleteFromMiddle(4);
        linkedList.print();
        
        // Listenin sonundan silelim:
        linkedList.deleteFromEnd();
        linkedList.print();
        

    }
}
