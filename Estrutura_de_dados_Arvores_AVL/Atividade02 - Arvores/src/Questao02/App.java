import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class App{

    // Nó da AVL com altura
    static class Node {
        int key;
        int height = 1; // folha tem altura 1
        Node left, right;
        Node(int k) { key = k; }
    }

    Node root;

    private int h(Node n) { return (n == null) ? 0 : n.height; }
    private void update(Node n) { n.height = 1 + Math.max(h(n.left), h(n.right)); }
    private int bf(Node n) { return h(n.left) - h(n.right); } // fator de balanceamento

    // Inserção + balanceamento
    public void insert(int key) { root = insertRec(root, key); }
    private Node insertRec(Node n, int key) {
        if (n == null) return new Node(key);

        if (key < n.key) n.left = insertRec(n.left, key);
        else if (key > n.key) n.right = insertRec(n.right, key);
        else return n; // ignora duplicatas

        update(n);
        int fb = bf(n);

        // Casos de rotação
        if (fb > 1 && key < n.left.key) return rotateRight(n);          // LL
        if (fb < -1 && key > n.right.key) return rotateLeft(n);         // RR
        if (fb > 1 && key > n.left.key) {                               // LR
            n.left = rotateLeft(n.left); return rotateRight(n);
        }
        if (fb < -1 && key < n.right.key) {                              // RL
            n.right = rotateRight(n.right); return rotateLeft(n);
        }
        return n;
    }

    private Node rotateRight(Node y) {
        Node x = y.left, t2 = x.right;
        x.right = y; y.left = t2;
        update(y); update(x);
        return x;
    }

    private Node rotateLeft(Node x) {
        Node y = x.right, t2 = y.left;
        y.left = x; x.right = t2;
        update(x); update(y);
        return y;
    }

    // Percursos
    public List<Integer> inorder()  { List<Integer> r=new ArrayList<>(); inorderRec(root, r);  return r; }
    private void inorderRec(Node n, List<Integer> r){ if(n==null)return; inorderRec(n.left,r); r.add(n.key); inorderRec(n.right,r); }

    public List<Integer> postorder(){ List<Integer> r=new ArrayList<>(); postorderRec(root, r); return r; }
    private void postorderRec(Node n, List<Integer> r){ if(n==null)return; postorderRec(n.left,r); postorderRec(n.right,r); r.add(n.key); }

    public int min(){ if(root==null) throw new NoSuchElementException("árvore vazia"); Node n=root; while(n.left!=null) n=n.left; return n.key; }
    public int max(){ if(root==null) throw new NoSuchElementException("árvore vazia"); Node n=root; while(n.right!=null) n=n.right; return n.key; }

    public int lastOfPostorder(){ if(root==null) throw new NoSuchElementException("árvore vazia"); return root.key; }
    public int sumFirstAndLastOfInorder(){ return min() + max(); }

    // Demonstração com os mesmos valores
    public static void main(String[] args) {
        int[] dados = {50, 35, 100, 20, 40, 37, 45};

        App avl = new App();
        for (int v : dados) avl.insert(v);

        System.out.println("AVL  in-ordem : " + avl.inorder());          // ordenado
        System.out.println("AVL  pós-ordem: " + avl.postorder());
        System.out.println("AVL  último do pós-ordem (raiz AVL): " + avl.lastOfPostorder()); // tende a ser 40
        System.out.println("AVL  soma(1º+últ) em-ordem: " + avl.sumFirstAndLastOfInorder()); // 120
    }
}
