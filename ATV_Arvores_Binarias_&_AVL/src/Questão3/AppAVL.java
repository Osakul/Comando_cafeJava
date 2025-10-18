import java.util.*;

public class AppAVL {

    public static class Node {
        int key, height = 1;     
        Node left, right;
        Node(int k) { key = k; }
    }

    private Node root;

    private int  h(Node n){ return (n==null)?0:n.height; }
    private void up(Node n){ n.height = 1 + Math.max(h(n.left), h(n.right)); }
    private int  bf(Node n){ return h(n.left) - h(n.right); }

    public void insert(int key) { root = insertRec(root, key); }
    private Node insertRec(Node n, int k){
        if(n==null) return new Node(k);

        if(k < n.key) n.left  = insertRec(n.left, k);
        else if(k > n.key) n.right = insertRec(n.right, k);
        else return n; 

        up(n);
        int b = bf(n);

        if(b > 1 && k < n.left.key)   return rotRight(n);          
        if(b < -1 && k > n.right.key) return rotLeft(n);           
        if(b > 1 && k > n.left.key){                               
            n.left = rotLeft(n.left);
            return rotRight(n);
        }
        if(b < -1 && k < n.right.key){                             
            n.right = rotRight(n.right);
            return rotLeft(n);
        }
        return n;
    }

    private Node rotRight(Node y){
        Node x = y.left, t2 = x.right;
        x.right = y; y.left = t2;
        up(y); up(x); return x;
    }
    private Node rotLeft(Node x){
        Node y = x.right, t2 = y.left;
        y.left = x; x.right = t2;
        up(x); up(y); return y;
    }

    public List<Integer> inorder(){
        List<Integer> r = new ArrayList<>();
        inRec(root, r); return r;
    }
    private void inRec(Node n, List<Integer> r){
        if(n==null) return;
        inRec(n.left, r); r.add(n.key); inRec(n.right, r);
    }

    public int heightNodes(){ return h(root); }
    public Integer rootKey(){ return (root==null)?null:root.key; }

    public void imprimirPorNiveis(){
        if(root==null){ System.out.println("(vazia)"); return; }
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int sz=q.size();
            for(int i=0;i<sz;i++){
                Node n=q.poll();
                System.out.print(n.key + (i<sz-1?" ":""));
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }
            System.out.println();
        }
    }
}
