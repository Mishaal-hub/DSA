
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

    static boolean sameTree(Node p, Node q) {
        if (p == null && q == null) return true;

        if (p == null || q == null) return false;

        if (p.data != q.data) return false;

        return sameTree(p.left, q.left)
            && sameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        Node first = createTree();
        Node second = createTree();

        System.out.println(sameTree(first, second));
    }
}
