package Java_Exercicios;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class EX25 {
	/*
	 * 2.5 Modifique o exercício 2.1 para utilizar caixas diálogo para ler e mostrar
	 * os valores. Use os seguintes comandos para converter o texto em números,
	 * considerando que showInputDialog retorna texto.
	 * 
	 * int <variável> = Integer.parseInt(<texto lido>); float <variável> =
	 * Float.parseFloat(<texto lido>);
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valorHora = JOptionPane.showInputDialog("Valor da hora trabalhada: ");
		double valorHoraTrabalhada = Double.parseDouble(valorHora);
		String hora = JOptionPane.showInputDialog("Quantas horas Trabalhou: ");
		int horaTrabalhada = Integer.parseInt(hora);
		JOptionPane.showMessageDialog(null, "Valor a ser recebido: R$ " + (valorHoraTrabalhada * horaTrabalhada));
	}

}
