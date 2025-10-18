import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class App {

    // Nó simples da BST
    static class Node {
        int key;
        Node left, right;
        Node(int k) { key = k; }
    }

    Node root;

    // Inserção padrão de BST
    public void insert(int key) {
        root = insertRec(root, key);
    }
    private Node insertRec(Node n, int key) {
        if (n == null) return new Node(key);
        if (key < n.key) n.left = insertRec(n.left, key);
        else if (key > n.key) n.right = insertRec(n.right, key);
        return n;
    }

    // Em-ordem (L-N-R)
    public List<Integer> inorder() {
        List<Integer> r = new ArrayList<>();
        inorderRec(root, r);
        return r;
    }
    private void inorderRec(Node n, List<Integer> r) {
        if (n == null) return;
        inorderRec(n.left, r);
        r.add(n.key);
        inorderRec(n.right, r);
    }

    // Pós-ordem (L-R-N)
    public List<Integer> postorder() {
        List<Integer> r = new ArrayList<>();
        postorderRec(root, r);
        return r;
    }
    private void postorderRec(Node n, List<Integer> r) {
        if (n == null) return;
        postorderRec(n.left, r);
        postorderRec(n.right, r);
        r.add(n.key);
    }

    public int min() {
        if (root == null) throw new NoSuchElementException("árvore vazia");
        Node n = root;
        while (n.left != null) n = n.left;
        return n.key;
    }

    public int max() {
        if (root == null) throw new NoSuchElementException("árvore vazia");
        Node n = root;
        while (n.right != null) n = n.right;
        return n.key;
    }

    public int lastOfPostorder() {
        if (root == null) throw new NoSuchElementException("árvore vazia");
        return root.key;
    }

    public int sumFirstAndLastOfInorder() {
        return min() + max();
    }

    public static void main(String[] args) {
        int[] dados = {50, 35, 100, 20, 40, 37, 45};

        App bst = new App();
        for (int v : dados) bst.insert(v);

        System.out.println("BST  in-ordem : " + bst.inorder());           
        System.out.println("BST  pós-ordem: " + bst.postorder());
        System.out.println("BST  último do pós-ordem (raiz): " + bst.lastOfPostorder()); 
        System.out.println("BST  soma(1º+últ) em-ordem: " + bst.sumFirstAndLastOfInorder()); 
    }
}
