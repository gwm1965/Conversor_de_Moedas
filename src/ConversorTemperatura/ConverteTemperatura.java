package ConversorTemperatura;

import javax.swing.*;
import java.util.Objects;

public class ConverteTemperatura {
    public double converterCelsiusParaFahrenheit(double valorRecebido) {
        double celsiusParaFahrenheit = valorRecebido * 1.8 + 32;
        celsiusParaFahrenheit = (double) Math.round(celsiusParaFahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null,
                valorRecebido + " Graus Celsius são " + celsiusParaFahrenheit + " Graus Fahrenheit ");
        return celsiusParaFahrenheit;


    }
}
