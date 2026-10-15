
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class Main {
    static Scanner sc = new Scanner(System.in);

    static Node createTree() {
        int data = sc.nextInt();

        if (data == -1) return null;

        Node root = new Node(data);
        root.left = createTree();
        root.right = createTree();

        return root;
    }

    static int maxDepth(Node root) {
        if (root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        Node root = createTree();
        System.out.println(maxDepth(root));
    }
}
