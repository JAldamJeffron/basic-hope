class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtTop(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;

    }

    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void deleteAtStart() {
        if (head != null) {
            head = head.next;
        }
    }

    public void deleteAtEnd() {
        if (head == null)
            return;
        if (head.next == null)
            head = null;
        Node cur = head;
        while (cur.next.next != null) {
            cur = cur.next;
        }
        cur.next = null;
    }

    public void deleteAtPosition(int index) {
        if (index == 0 && head != null && head.next == null) {
            head = null;
        }
        if (index == 0 && head != null && head.next != null) {
            head = head.next;
            head.next = null;
        } else {
            Node cur = head;
            Node prev = cur;
            int pos = 0;
            while (pos < index) {
                prev = cur;
                cur = cur.next;
                pos++;
            }
            prev.next = cur.next;
        }
    }

    public void insertAtPosition(int data, int index) {
        Node newNode = new Node(data);
        if (index == 0 && head == null) {
            head = newNode;
            head.next = null;
        }
        if (index == 0 && head != null) {
            newNode.next = head;
            head = newNode;
        } else {
            Node cur = head;
            Node prev = cur;
            int pos = 0;
            while (pos < index) {
                prev = cur;
                cur = cur.next;
                pos++;
            }
            prev.next = newNode;
            newNode.next = cur;
        }
    }
}

public class Linked {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertAtEnd(10);
        l.insertAtEnd(20);
        l.insertAtEnd(30);
        l.insertAtEnd(40);
        l.display();
        // l.deleteAtStart();
        l.display();
        // l.deleteAtEnd();
        l.display();
        l.insertAtPosition(50, 2);
        l.display();
        l.deleteAtPosition(2);
        l.display();
    }
}