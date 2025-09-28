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

// TreeNode structure
class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int value) {
        this.data = value;
        this.left = this.right = null;
    }
}

// Binary Tree class
class BinaryTree {
    TreeNode root;

    // Preorder Traversal (Root -> Left -> Right)
    void preorder(TreeNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Inorder Traversal (Left -> Root -> Right)
    void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Postorder Traversal (Left -> Right -> Root)
    void postorder(TreeNode node) {
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
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

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