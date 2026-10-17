
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class KthSmallestBST {

    static Scanner sc = new Scanner(System.in);
    static int count = 0;
    static int answer = -1;

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

    static void inorder(Node root, int k) {
        if (root == null || count >= k) {
            return;
        }

        inorder(root.left, k);

        if (count >= k) {
            return;
        }

        count++;

        if (count == k) {
            answer = root.data;
            return;
        }

        inorder(root.right, k);
    }

    public static void main(String[] args) {
        System.out.println("Enter tree in preorder (-1 for null):");
        Node root = createTree();

        System.out.println("Enter k:");
        int k = sc.nextInt();

        if (k <= 0) {
            System.out.println("Invalid k");
        } else {
            inorder(root, k);

            if (count < k) {
                System.out.println("K is larger than the number of nodes");
            } else {
                System.out.println("Kth smallest element: " + answer);
            }
        }

        sc.close();
    }
}
