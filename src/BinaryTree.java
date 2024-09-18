import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public BinaryTree(int data) {
        this.root = new Node(data);
    }

    public BinaryTree(Node node) {
        this.root = node;
    }

    public BinaryTree() {
        this.root = null;
    }

    public void simetricTraversal(Node node) {
        if (node == null) {
            node = root;
        }
        if (node.left != null) {
            System.out.print('(');
            simetricTraversal(node.left);
        }
        System.out.print(node);
        if (node.right != null) {
            simetricTraversal(node.right);
            System.out.print(')');
        }
    }

    public void postorderTraversal(Node node) {
        if (node == null) {
            node = root;
        }
        if (node.left != null) {
            postorderTraversal(node.left);
        }
        if (node.right != null) {
            postorderTraversal(node.right);
        }
        System.out.println(node);
    }

    public int height(Node node) {
        if (node == null) {
            node = root;
        }
        int hleft = 0;
        int hright = 0;
        if (node.left != null) {
            hleft = height(node.left);
        }
        if (node.right != null) {
            hright = height(node.right);
        }
        return Math.max(hleft, hright) + 1;
    }

    public void inorderTraversal(Node node) {
        if (node == null) {
            node = root;
        }
        if (node.left != null) {
            inorderTraversal(node.left);
        }
        System.out.print(node + " ");
        if (node.right != null) {
            inorderTraversal(node.right);
        }
    }

    public void levelorderTraversal(Node node) {
        if (node == null) {
            node = root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            System.out.print(node + " ");
        }
    }
}

