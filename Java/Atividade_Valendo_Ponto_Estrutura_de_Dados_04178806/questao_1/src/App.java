import java.util.LinkedList;
public class App {

    public static void main(String[] args) throws Exception {
        
        int posicao = 1;
        int i;

        LinkedList<String> clientes = new LinkedList<String>();


        clientes.add("João");
        clientes.add("Carlos");
        clientes.add("Lucas");

        for (String c:clientes){

            System.out.println("Posição : " + posicao);
            System.out.println(c);
            posicao += 1;

        }

        System.out.println("----------------");

        clientes.addLast("Rafael");
        clientes.addLast("Gustavo");
        clientes.addLast("Thaynara");
        posicao = 1;

        for (i = 1; i < 3; i++){
            clientes.removeFirst();
        }

        for (String c:clientes){

            System.out.println("Posicao : " + posicao);
            System.out.println(c);
            posicao += 1;

        }

    }


} 
