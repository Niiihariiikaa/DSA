public class inorder {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    
    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);

        System.out.print(root.data + " ");
        
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);

        System.out.println("inorder Traversal:");
        inorder(root);
    }
}
