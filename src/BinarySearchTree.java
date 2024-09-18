public class BinarySearchTree extends BinaryTree {

    public void insert(int value) {
        Node parent = null;
        Node x = root;
        while (x != null) {
            parent = x;
            if (value < x.data) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        if (parent == null) {
            root = new Node(value);
        } else if (value < parent.data) {
            parent.left = new Node(value);
        } else {
            parent.right = new Node(value);
        }
    }

    public Node search(int value) {
        return search(value, root);
    }

    private Node search(int value, Node node) {
        if (node == null || node.data == value) {
            return node;
        }
        if (value < node.data) {
            return search(value, node.left);
        } else {
            return search(value, node.right);
        }
    }

    public int min(Node node) {
        if (node == null) {
            node = root;
        }
        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }

    public int max(Node node) {
        if (node == null) {
            node = root;
        }
        while (node.right != null) {
            node = node.right;
        }
        return node.data;
    }

    public Node remove(int value, Node node) {
        if (node == null) {
            return null;
        }

        if (value < node.data) {
            node.left = remove(value, node.left);
        } else if (value > node.data) {
            node.right = remove(value, node.right);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                int substitute = min(node.right);
                node.data = substitute;
                node.right = remove(substitute, node.right);
            }
        }
        return node;
    }
}
