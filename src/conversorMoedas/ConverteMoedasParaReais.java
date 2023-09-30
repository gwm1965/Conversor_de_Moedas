package conversorMoedas;

import javax.swing.*;

public class  ConverteMoedasParaReais {

    public void converterDolaresParaReais(double valorRecebido) {
        double moedaDolar = valorRecebido * 5.13;
        moedaDolar = (double)Math.round(moedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $" + moedaDolar + " Reais");
    }

    public void converterEurosParaReais(double valorRecebido){
        double moedaEuro = valorRecebido * 10.85;
        moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " Reais");
    }



}
