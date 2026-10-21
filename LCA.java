
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class LowestCommonAncestorBST {

    static Scanner sc = new Scanner(System.in);

    // Create tree using preorder input
    // Enter -1 for null
    static Node createTree() {
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        Node root = new Node(data);

        root.left = createTree();
        root.right = createTree();

        return root;
    }

    static Node search(Node root, int key) {
        while (root != null) {
            if (root.data == key) {
                return root;
            } else if (key < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return null;
    }

    static Node lowestCommonAncestor(Node root, int p, int q) {
        while (root != null) {
            if (p < root.data && q < root.data) {
                root = root.left;
            } else if (p > root.data && q > root.data) {
                root = root.right;
            } else {
                return root;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println("Enter BST in preorder (-1 for null):");
        Node root = createTree();

        System.out.println("Enter first node:");
        int p = sc.nextInt();

        System.out.println("Enter second node:");
        int q = sc.nextInt();

        if (search(root, p) == null || search(root, q) == null) {
            System.out.println("One or both nodes not found");
        } else {
            Node lca = lowestCommonAncestor(root, p, q);

            if (lca != null) {
                System.out.println("Lowest Common Ancestor: " + lca.data);
            }
        }
    }
}
