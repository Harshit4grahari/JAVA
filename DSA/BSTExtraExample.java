/*1. Height of a Binary Tree
 Height = Maximum depth (longest path from root to a leaf). */
/*2. Diameter of a Binary Tree
 Diameter = Longest path between any two nodes in the tree (may or may not pass through root). */
 /*3. Lowest Common Ancestor (LCA) in BST
> LCA = The lowest node in the tree that has both given nodes as descendants.
> In a BST, we can use the property left < root < right to find LCA efficiently. */

package DSA;

// TreeNode for BST
class BSTNode {
    int data;
    BSTNode left, right;

    public BSTNode(int value) {
        this.data = value;
        this.left = this.right = null;
    }
}

public class BSTExtraExample {
    BSTNode root;

    // Insert into BST
    BSTNode insert(BSTNode node, int value) {
        if (node == null) {
            return new BSTNode(value);
        }
        if (value < node.data) {
            node.left = insert(node.left, value);
        } else if (value > node.data) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    // Search in BST
    boolean search(BSTNode node, int key) {
        if (node == null) return false;
        if (node.data == key) return true;
        if (key < node.data) return search(node.left, key);
        return search(node.right, key);
    }

    // Delete from BST
    BSTNode delete(BSTNode node, int key) {
        if (node == null) return null;

        if (key < node.data) {
            node.left = delete(node.left, key);
        } else if (key > node.data) {
            node.right = delete(node.right, key);
        } else {
            // Case 1: No child
            if (node.left == null && node.right == null) {
                return null;
            }
            // Case 2: One child
            else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            // Case 3: Two children -> inorder successor
            BSTNode successor = minValueNode(node.right);
            node.data = successor.data;
            node.right = delete(node.right, successor.data);
        }
        return node;
    }

    // Helper: Find minimum node in a subtree
    BSTNode minValueNode(BSTNode node) {
        BSTNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    // Inorder Traversal (sorted order for BST)
    void inorder(BSTNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        BSTExtraExample bst = new BSTExtraExample();

        // Insert values
        bst.root = bst.insert(bst.root, 50);
        bst.root = bst.insert(bst.root, 30);
        bst.root = bst.insert(bst.root, 70);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 40);
        bst.root = bst.insert(bst.root, 60);
        bst.root = bst.insert(bst.root, 80);

        System.out.print("Inorder Traversal: ");
        bst.inorder(bst.root);
        System.out.println();

        // Search
        System.out.println("Search 40: " + bst.search(bst.root, 40)); // true
        System.out.println("Search 90: " + bst.search(bst.root, 90)); // false

        // Delete
        bst.root = bst.delete(bst.root, 50);
        System.out.print("Inorder after deleting 50: ");
        bst.inorder(bst.root);
        System.out.println();
    }
}
