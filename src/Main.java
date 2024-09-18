public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(7);
        tree.root.left = new Node(18);
        tree.root.right = new Node(14);

        System.out.println(tree.root);
        System.out.println(tree.root.right);
        System.out.println(tree.root.left);
    }
}