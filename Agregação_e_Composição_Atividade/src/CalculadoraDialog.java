import javax.swing.JOptionPane;

public class CalculadoraDialog{

    public static void main(String[] args) {

        Double n1 = lerNumero("Digite o primeiro número:");
        if (n1 == null) return; // usuário cancelou

        Double n2 = lerNumero("Digite o segundo número:");
        if (n2 == null) return;

        // escolhe a operação
        String[] opcoes = { "+", "-", "x", "÷" };
        int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha a operação",
                "Operação",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );
        if (escolha < 0) return; // cancelou a caixa

        // trata divisão por zero
        while (escolha == 3 && n2 == 0.0) {
            JOptionPane.showMessageDialog(null,
                    "Não é possível dividir por zero!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            n2 = lerNumero("Digite outro valor para o segundo número (≠ 0):");
            if (n2 == null) return;
        }

        double resultado = 0.0;
        if (escolha == 0) {
            resultado = n1 + n2;
        } else if (escolha == 1) {
            resultado = n1 - n2;
        } else if (escolha == 2) {
            resultado = n1 * n2;
        } else if (escolha == 3) {
            resultado = n1 / n2;
        }

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }

    private static Double lerNumero(String mensagem) {
        while (true) {
            String texto = JOptionPane.showInputDialog(null, mensagem);
            if (texto == null) return null; // usuário clicou Cancelar
            texto = texto.trim().replace(',', '.'); // aceita vírgula

            try {
                return Double.parseDouble(texto);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Valor inválido. Tente de novo.",
                        "Entrada inválida",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
