/*A Binary Tree is a hierarchical data structure where each node has at most two children:
1.Left child 2.Right child */
/*There are mainly three depth-first traversals:
1.Inorder (L → Root → R)
>Visit left subtree
>Visit root
>Visit right subtree

2.Preorder (Root → L → R)
>Visit root
>Visit left subtree
>Visit right subtree

3.Postorder (L → R → Root)
>Visit left subtree
>Visit right subtree
>Visit root */

package DSA;
// Node structure
class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

// Binary Tree class
class BinaryTree {
    Node root;

    // Preorder Traversal
    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Inorder Traversal
    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Postorder Traversal
    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
}

public class BinaryTreeTraversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Creating a sample tree
        /*
                1
               / \
              2   3
             / \
            4   5
        */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Traversals
        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.root);
        System.out.println();
    }
}

/*Real-life Usage
Inorder → Used in Binary Search Trees (gives sorted order).

Preorder → Used in expression trees (to get prefix expression).

Postorder → Used in deleting trees and expression evaluation (postfix). */