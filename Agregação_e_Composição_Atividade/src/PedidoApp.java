import java.util.ArrayList;
import java.util.List;

public class PedidoApp{

    static class Pedido {

        class ItemPedido {
            String nomeProduto;
            int quantidade;
            double precoUnitario;

            ItemPedido(String nomeProduto, int quantidade, double precoUnitario) {
                this.nomeProduto = nomeProduto;
                this.quantidade = quantidade;
                this.precoUnitario = precoUnitario;
            }

            double subtotal() {
                return quantidade * precoUnitario;
            }
        }

        // a lista de itens do pedido
        private List<ItemPedido> itens = new ArrayList<>();

        // adiciona um novo item
        public void adicionarItem(String nome, int qtd, double preco) {
            
            if (qtd <= 0) {
                System.out.println("Quantidade deve ser maior que zero.");
                return;
            }
            if (preco < 0) {
                System.out.println("Preço não pode ser negativo.");
                return;
            }
            itens.add(new ItemPedido(nome, qtd, preco));
        }

        // soma os subtotais e retorna o total
        public double valorTotal() {
            double total = 0.0;
            for (ItemPedido it : itens) {
                total += it.subtotal();
            }
            return total;
        }
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionarItem("Teclado", 2, 150.0);
        pedido.adicionarItem("Mouse", 1, 80.0);

        double total = pedido.valorTotal();
        System.out.printf("Valor total do pedido: R$ %.2f%n", total);
    }
}
