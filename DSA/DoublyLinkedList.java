/*>Each node has data, next pointer, and prev pointer.
  >Traversal is possible in both directions (forward and backward). */

package DSA;

class DoublyLinkedList {
    // Node class
    class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp; // linking backwards
        }
    }

    // Display forward
    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Display backward
    public void displayBackward() {
        Node temp = head;
        if (temp == null) return;

        // Move to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Traverse backward
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("Forward Traversal:");
        list.displayForward(); // 10 <-> 20 <-> 30 <-> NULL

        System.out.println("Backward Traversal:");
        list.displayBackward(); // 30 <-> 20 <-> 10 <-> NULL
    }
}

/*Feature	        Singly Linked List	               Doubly Linked List
Memory	             Less (only next)	                More (stores prev + next)
Traversal	         Forward only	                    Forward & Backward
Insertion/Deletion	 Slower (need previous node)	    Faster (direct access via prev)
Use Case	         Simple data structures (stacks,    Complex structures (deques, navigation systems)
                     queues) */