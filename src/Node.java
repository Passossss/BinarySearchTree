public class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
