package ConversorVelocidade;

import javax.swing.*;

public class ConverteVelocidades {

    public double converterKilometroParaMilhas(double valorRecebido) {
        double kilometroParaMilhas = valorRecebido / 1.609344;
        kilometroParaMilhas = (double) Math.round(kilometroParaMilhas * 100d) / 100;
        JOptionPane.showMessageDialog(null,
                valorRecebido + "Kilometros são " + kilometroParaMilhas + " Milhas ");
        return kilometroParaMilhas;
    }

    public double converterMilhasParaKilometro(double valorRecebido) {
        double milhasParaKilometro = valorRecebido * 1.609344;
        milhasParaKilometro = (double) Math.round(milhasParaKilometro * 100d) / 100;
        JOptionPane.showMessageDialog(null,
                valorRecebido + "Milhas são " + milhasParaKilometro + " Kilometro ");
        return milhasParaKilometro;
    }
}
