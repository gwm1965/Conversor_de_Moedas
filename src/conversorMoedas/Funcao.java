package conversorMoedas;

import javax.swing.*;

public class Funcao {

    ConverteMoedas moedas = new ConverteMoedas();
    ConverteMoedasParaReais reais = new ConverteMoedasParaReais();

    public void converterMoeda(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog
                (null,"Escolha a moeda para a qual você deseja girar seu dinheiro", "Moedas",
                        JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Reais a Dólares", "De Reais a Euros", "De Dólares a Reais", "De Euros a Reais"}
                        , "Escolha")).toString();

        switch (opcao) {
            case "De Reais a Dólares":
                moedas.converterReaisParaDolares(valorRecebido);
                break;

            case "De Reais a Euros":
                moedas.converterReaisParaDolares(valorRecebido);
                break;

            case "De Dólares a Reais":
                moedas.converterReaisParaDolares(valorRecebido);
                break;

            case "De Euros a Reais":
                moedas.converterReaisParaDolares(valorRecebido);
                break;


        }
    }
}
