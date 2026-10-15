
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

    static void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node root = createTree();
        levelOrder(root);
    }
}
