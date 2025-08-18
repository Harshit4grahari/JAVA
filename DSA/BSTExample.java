/*A BST is a binary tree where:
>Left child < Root
>Right child > Root
>No duplicates

This property allows efficient searching, insertion, and deletion (O(log n) on average). */

package DSA;

// Node class
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

// BST class
class BST {
    Node root;

    // Insert a node
    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.key)
            root.left = insert(root.left, key);
        else if (key > root.key)
            root.right = insert(root.right, key);
        return root;
    }

    // Search a key
    boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.key == key)
            return true;
        if (key < root.key)
            return search(root.left, key);
        return search(root.right, key);
    }

    // Find minimum value (helper for delete)
    Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Delete a node
    Node delete(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = delete(root.left, key);
        else if (key > root.key)
            root.right = delete(root.right, key);
        else {
            // Case 1: No child
            if (root.left == null && root.right == null)
                return null;

            // Case 2: One child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 3: Two children → replace with inorder successor
            Node temp = minValueNode(root.right);
            root.key = temp.key;
            root.right = delete(root.right, temp.key);
        }
        return root;
    }

    // Inorder Traversal (Sorted order)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
}

// Main class
public class BSTExample {
    public static void main(String[] args) {
        BST tree = new BST();

        // Insert elements
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        // Display inorder traversal
        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        // Search
        System.out.println("Search 40: " + tree.search(tree.root, 40));
        System.out.println("Search 90: " + tree.search(tree.root, 90));

        // Delete nodes
        tree.root = tree.delete(tree.root, 20); // Case 1: Leaf
        tree.root = tree.delete(tree.root, 30); // Case 2: One child
        tree.root = tree.delete(tree.root, 50); // Case 3: Two children

        // Inorder after deletion
        System.out.print("Inorder after deletion: ");
        tree.inorder(tree.root);
    }
}

/*Real-Life Applications of BST
Databases indexing

Auto-complete & dictionary apps

File systems (hierarchical structure)

Searching in dynamic datasets */