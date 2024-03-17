package Java_Exercicios;

import java.util.Scanner;
import java.util.Locale;

public class EX23 {
	/*
	 * 2.3 Construa um programa para que o usuário informe a altura entre 2 andares
	 * de uma construção e informe a quantidade de degraus que deseja construir. Em
	 * seguida o sistema deve calcular e mostrar qual a altura de cada um dos
	 * degraus que deverão ser construídos para que a escada ligue o primeiro ao
	 * segundo andar. Note que todos os degraus devem ter a mesma altura. A altura
	 * entre os andares será fornecida em metros e a altura do degrau deverá ser
	 * fornecida em centímetros.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a ALTURA da escada: ");
		float altura = teclado.nextFloat();
		System.out.println("Informe a quantidade Degraus: ");
		int qtdDegrau = teclado.nextInt();
		float calc = (float)(altura * 100) / qtdDegrau;
		System.out.println(calc);
	}

}
