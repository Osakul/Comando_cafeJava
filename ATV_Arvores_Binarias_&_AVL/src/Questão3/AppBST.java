import java.util.*;

public class AppBST {

    public static class Node {
        int key;
        Node left, right;
        Node(int k) { key = k; }
    }

    private Node root;

    public void insert(int key) { root = insertRec(root, key); }
    private Node insertRec(Node n, int k) {
        if (n == null) return new Node(k);
        if (k < n.key) n.left = insertRec(n.left, k);
        else if (k > n.key) n.right = insertRec(n.right, k);
        return n;
    }
    public List<Integer> inorder() {
        List<Integer> r = new ArrayList<>();
        inorderRec(root, r);
        return r;
    }
    private void inorderRec(Node n, List<Integer> r) {
        if (n == null) return;
        inorderRec(n.left, r); r.add(n.key); inorderRec(n.right, r);
    }

    public int heightNodes() { return heightRec(root); }
    private int heightRec(Node n) {
        return (n == null) ? 0 : 1 + Math.max(heightRec(n.left), heightRec(n.right));
    }

    public Integer rootKey() { return (root == null) ? null : root.key; }

    public void imprimirPorNiveis() {
        if (root == null) { System.out.println("(vazia)"); return; }
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                Node n = q.poll();
                System.out.print(n.key + (i < sz - 1 ? " " : ""));
                if (n.left != null) q.add(n.left);
                if (n.right != null) q.add(n.right);
            }
            System.out.println();
        }
    }
}
