package Java_Exercicios;

import java.util.Scanner;

public class TesteVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int v1[] = new int[5];
		int v2[] = { 1, 2, 3, 4, 5 };

		System.out.println("Valor vetor 2");
		for (int i = 0; i < 5; i++) {
			System.out.print(v2[i] + " ");

		}
		System.out.println();
		System.out.print("Informe os valores do vetor 1: ");
		for (int i = 0; i < v1.length; i++) {
			v1[i] = sc.nextInt();
		}

		System.out.println("Valores Lidos: ");
		for (int i = 0; i < v1.length; i++) {
			System.out.print(v1[i] + " ");
		}
	}

}
