class Node {
    int data;       // Node ka data
    Node next;      // Node ka reference to next
    Node(int data) {
        this.data = data;
        this.next = null; // By default, next null hoga
    }
}
class linkList {
    Node head; // Linked List ka starting point
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // Pehla node agar empty ho
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode; // Add new node at the end
        }
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
public class linkeList {
    public static void main(String[] args) {
        linkeList list = new linkeList();
        // LinkedList <String> linkeL= new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        
        list.printList();
    }
}
