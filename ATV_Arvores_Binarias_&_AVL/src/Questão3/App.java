public class App {
    public static void main(String[] args) {
        int[] valores = {1,2,3,10,4,5,9,7,8,6};

        // Monta BST
        AppBST bst = new AppBST();
        for (int v : valores) bst.insert(v);

        // Monta AVL
        AppAVL avl = new AppAVL();
        for (int v : valores) avl.insert(v);

        System.out.println("Elementos inseridos: {1,2,3,10,4,5,9,7,8,6}\n");

        System.out.println("=== BST (Árvore Binária de Busca) ===");
        System.out.println("Raiz: " + bst.rootKey());
        System.out.println("Altura (nós): " + bst.heightNodes());
        System.out.println("Em-ordem: " + bst.inorder()); // mesma ordem em ambas
        System.out.println("Níveis (BFS):");
        bst.imprimirPorNiveis();

        System.out.println();

        System.out.println("=== AVL (Árvore Balanceada AVL) ===");
        System.out.println("Raiz: " + avl.rootKey());
        System.out.println("Altura (nós): " + avl.heightNodes());
        System.out.println("Em-ordem: " + avl.inorder());
        System.out.println("Níveis (BFS):");
        avl.imprimirPorNiveis();
    }
}
