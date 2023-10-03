package principal;

import javax.swing.*;


import ConversorTemperatura.FuncaoTemperatura;
import ConversorVelocidade.FuncaoVelocidades;
import conversorMoedas.Funcao;


public class Principal {
    public static void main(String[] args) {

        Funcao moedas = new Funcao();
        FuncaoTemperatura temperatura = new FuncaoTemperatura();
        FuncaoVelocidades velocidades = new FuncaoVelocidades();

        while (true) {

            String opcao = (JOptionPane.showInputDialog(null,"Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null,new Object[]{"Converasor de Moeda","Conversor de Temperatura", "Conversor de Velocidade"} ,"Escolha")).toString();

            switch (opcao) {
                case "Converasor de Moeda":
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

                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Insira um Valor de Temperatura para Converter");
                    if (checar(input)) {
                        double valorRecebido = Double.parseDouble(input);
                        temperatura.converterTemperatura(valorRecebido);

                        int resposta = 0;
                        resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                        if ((resposta == 0) && (checar(input))) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa finalizado");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;

                case "Conversor de Velocidade":
                    input = JOptionPane.showInputDialog("Qual a velocidade ou distancia para converter");
                    if (checar(input)) {
                        double valorRecebido = Double.parseDouble(input);
                        velocidades.converterVelocidades(valorRecebido);

                        int resposta = 0;
                        resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                        if ((resposta == 0) && (checar(input))) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa finalizado");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;



            }
        }

    }

    public static boolean checar(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0) ;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}




