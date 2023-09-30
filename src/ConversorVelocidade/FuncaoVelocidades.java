package ConversorVelocidade;

import ConversorTemperatura.ConverteTemperatura;

import javax.swing.*;

public class FuncaoVelocidades {
    ConverteVelocidades velocidades = new ConverteVelocidades();

    public void converterVelocidades(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null, "Escolha velocidade em KM para converter",
                "Velocidade", JOptionPane.PLAIN_MESSAGE,null, new Object[]{
                        "Kilometro para Milha",
                        "Milha para Kilometro"}, "Escolha")).toString();

        switch (opcao) {
            case "Kilometro para Milha":
                velocidades.converterKilometroParaMilhas(valorRecebido);
                break;

            case "Milha para Kilometro":
                velocidades.converterMilhasParaKilometro(valorRecebido);
                break;

        }
    }
}
