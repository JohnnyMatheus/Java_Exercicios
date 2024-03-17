package Java_Exercicios;

import java.util.Scanner;

public class EX32 {
	/*
	 * 3.2 Construir um programa que determine a data cronologicamente maior
	 * (posterior) entre duas datas informadas pelo usuário. Cada data deve ser
	 * composta por 2 valores inteiros, sendo o primeiro o dia e o segundo o mês.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Dia 1: ");
		int dia1 = sc.nextInt();
		System.out.print("Mês 1: ");
		int mes1 = sc.nextInt();

		System.out.print("Dia 2: ");
		int dia2 = sc.nextInt();
		System.out.print("Mês 2: ");
		int mes2 = sc.nextInt();

		if (dia1 > dia2 || mes1 > mes2) {
			System.out.printf("Maior data %d/%d", dia1, mes1);
		} else {
			System.out.printf("Maior data %d/%d", dia2, mes2);
		}

		sc.close();

	}

}
