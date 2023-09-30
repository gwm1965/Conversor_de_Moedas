package conversorMoedas;

import javax.swing.*;

public class ConverteMoedas {
    public void converterReaisParaDolares(double valorRecebido){
        double moedaDolar = valorRecebido / 5.13;
        moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " Dólares");
    }

    public void converterReaisParaEuros(double valorRecebido){
        double moedaEuro = valorRecebido / 10.85;
        moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " Euros");
    }
}
