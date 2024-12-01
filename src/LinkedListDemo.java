class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert at the head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the tail
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Insert after a specific value
    public void insertAfter(int prevData, int data) {
        Node current = head;
        while (current != null && current.data != prevData) {
            current = current.next;
        }
        if (current == null) return; // Value not found
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
    }

    // Remove from the head
    public void removeFromHead() {
        if (head == null) return; // List is empty
        head = head.next;
    }

    // Remove from the tail
    public void removeFromTail() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Remove by value
    public void removeByValue(int data) {
        if (head == null) return; // List is empty
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next == null) return; // Value not found
        current.next = current.next.next;
    }

    // Get the head value
    public int getHead() {
        if (head == null) throw new IllegalStateException("List is empty");
        return head.data;
    }

    // Get the tail value
    public int getTail() {
        if (head == null) throw new IllegalStateException("List is empty");
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    // Get the middle value
    /*public int getMiddle() {
        if (head == null) throw new IllegalStateException("List is empty");
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }*/

    // Find value in the list
    public boolean findValue(int target) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                return true; // Value found
            }
            current = current.next;
        }
        return false;
    }

    // Print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Class to demonstrate LinkedList operations
public class LinkedListDemo {

    // Method to perform the operations on LinkedList
    public void execute() {
        LinkedList ll = new LinkedList();

        // Insert elements
        ll.insertAtHead(10);
        ll.insertAtTail(30);
        ll.insertAfter(10, 20);
        System.out.println("List after insertions:");
        ll.printList();
        // Remove elements
        //ll.removeFromHead();
        //ll.removeFromTail();
        //ll.removeByValue(20);
        //System.out.println("List after deletions:");
        //ll.printList();

        /* Get values
        ll.insertAtTail(40);
        ll.insertAtTail(50);
        ll.insertAtTail(60);
        System.out.println("Head value: " + ll.getHead());
        System.out.println("Tail value: " + ll.getTail());
        // Find the value 40 in the list
        boolean found = ll.findValue(40);
        System.out.println("Is value 40 in the list? " + found); // Output: true

        // Try finding a value not in the list
        boolean notFound = ll.findValue(80);
        System.out.println("Is value 80 in the list? " + notFound); // Output: false

        //ll.printList();

         */



    }

}
