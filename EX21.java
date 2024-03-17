package Java_Exercicios;

import java.util.Scanner;
import java.util.Locale;

public class EX21 {
	/*
	 * 2.1 Uma empresa contrata programadores para desenvolver projetos em suas
	 * casas. Faça um programa que pergunte ao usuário qual o valor pago a ele por
	 * hora de trabalho e quantas horas ele trabalhou em um projeto. Em seguida,
	 * mostre o valor equivalente a ser recebido por ele.Lembre-se de formatar os
	 * números.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.print("Valor da hora trabalhada: ");
		float valorHora = teclado.nextFloat();
		System.out.println("Quantas horas Trabalhou: ");
		int hora = teclado.nextInt();
		System.out.println("Valor a ser recebido: R$ " + (valorHora * hora));
		teclado.close();
	}

}
