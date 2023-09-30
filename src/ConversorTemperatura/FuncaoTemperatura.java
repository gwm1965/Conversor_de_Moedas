package ConversorTemperatura;

import javax.swing.*;

public class FuncaoTemperatura {
    ConverteTemperatura temperatura = new ConverteTemperatura();

    public void converterTemperatura(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null, "Escolha uma escala detemperatura para converter",
                "Temperatura", JOptionPane.PLAIN_MESSAGE,null, new Object[]{
                        "Graus Celsius a Fahrenheit",
                        "Graus Celsius a Kelvin",
                        "Graus Fahrenheit a Celsius",
                        "Kelvin a Graus Celsius",
                        "Kelvin a Graus Fahrenheit"}, "Escolha")).toString();

        switch (opcao) {
            case "Graus Celsius a Fahrenheit":
                temperatura.converterCelsiusParaFahrenheit(valorRecebido);
                break;

            case "Graus Fahrenheit a Celsius":
                temperatura.converterCelsiusParaFahrenheit(valorRecebido);
                break;

        }
    }
}
