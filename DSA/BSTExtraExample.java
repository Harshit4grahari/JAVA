/*1. Height of a Binary Tree
 Height = Maximum depth (longest path from root to a leaf). */
/*2. Diameter of a Binary Tree
 Diameter = Longest path between any two nodes in the tree (may or may not pass through root). */
 /*3. Lowest Common Ancestor (LCA) in BST
> LCA = The lowest node in the tree that has both given nodes as descendants.
> In a BST, we can use the property left < root < right to find LCA efficiently. */

package DSA;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BSTExtraExample {

    // Insert into BST
    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    // Height of tree
    public static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // Diameter of tree
    public static int diameter(Node root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    }

    // Lowest Common Ancestor (LCA) in BST
    public static Node LCA(Node root, int n1, int n2) {
        if (root == null) return null;

        if (root.data > n1 && root.data > n2) {
            return LCA(root.left, n1, n2);
        }
        if (root.data < n1 && root.data < n2) {
            return LCA(root.right, n1, n2);
        }
        return root; // This is the LCA
    }

    // Inorder Traversal
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = {50, 30, 20, 40, 70, 60, 80};

        // Build BST
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();

        System.out.println("Height of BST: " + height(root));
        System.out.println("Diameter of BST: " + diameter(root));

        int n1 = 20, n2 = 40;
        Node lca = LCA(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is: " + lca.data);
    }
}
