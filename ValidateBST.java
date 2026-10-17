
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class ValidateBST {

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

    static boolean isValidBST(Node root, long min, long max) {
        if (root == null) {
            return true;
        }

        if (root.data <= min || root.data >= max) {
            return false;
        }

        return isValidBST(root.left, min, root.data)
            && isValidBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        System.out.println("Enter tree in preorder (-1 for null):");
        Node root = createTree();

        if (isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE)) {
            System.out.println("Valid BST");
        } else {
            System.out.println("Not a Valid BST");
        }

        sc.close();
    }
}
