import javax.swing.JOptionPane;

public class Main {


    public static void main(String[] args) {

        String texto1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        double n1 = Double.parseDouble(texto1);

        String texto2 = JOptionPane.showInputDialog("Digite o segundo número:");
        double n2 = Double.parseDouble(texto2);

        String operacaoTexto = JOptionPane.showInputDialog("Qual operação?  [+]  [-]  [x]  [/]");
        char operacao = operacaoTexto.charAt(0);

        double resultado = 0;
        String mensagem = "";

        if (operacao == '+') {
            resultado = n1 + n2;
            mensagem = n1 + " + " + n2 + " = " + resultado;
        } else if (operacao == '-') {
            resultado = n1 - n2;
            mensagem = n1 + " - " + n2 + " = " + resultado;
        } else if (operacao == 'x') {
            resultado = n1 * n2;
            mensagem = n1 + " x " + n2 + " = " + resultado;
        } else if (operacao == '/') {
            if (n2 != 0) {
                resultado = n1 / n2;
                mensagem = n1 + " / " + n2 + " = " + resultado;
            } else {
                mensagem = "Erro: Não é possível dividir por zero!";
            }
        } else {
            mensagem = "Operação inválida!";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }
}