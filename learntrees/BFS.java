//package learntrees;

//import java.lang.classfile.components.ClassPrinter;
import java.util.LinkedList;
import java.util.Queue;


class Node {
    int key;
    Node left, right;
    public Node(int d){
        key=d;
        left=right=null;

    }
}


class BFS{
    static void bfs(Node root) {
        if(root==null) {
            return;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            Node n= q.poll();
            System.out.println(n.key);
            if(n.left!=null) q.add(n.left);
            if(n.right!=null) q.add(n.right);

        }

    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        System.out.println("BFS");
        bfs(root);
    }
}


