import javax.swing.*;




public class Principal {
    public static void main(String[] args) {

        Funcao moedas = new Funcao();

        String opcao = (JOptionPane.showInputDialog(null,"Escolha a moeda para a qual deseja converter seu dinheiro", "Moedas", JOptionPane.PLAIN_MESSAGE, null,new Object[]{"De Reais a Dolares","De Reais a Euros", "De Dolares a Reais","De Reais a Euros", "De Euros a Reais"},"Escolha")).toString();





        switch (opcao) {
            case "Conversor de Moeda":
                String input = JOptionPane.showInputDialog("Insira um valor: ");
                if (checar(input)) {
                    double valorRecebido = Double.parseDouble(input);
                    moedas.converterMoeda(valorRecebido);

                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    if (JOptionPane.OK_OPTION == resposta) {
                        System.out.println("Escolha opção Afirmativa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
                break;

        }
    }

    public static boolean checar(String input) {
        try {
            double x Double.parseDouble(input);
            if (x >= 0 || x < 0) ;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

