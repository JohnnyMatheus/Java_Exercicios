package Java_Exercicios;

import java.util.Scanner;

public class EX31 {

	/*
	 * 3.1 – Construir um programa que apresente uma mensagem para o usuário
	 * informando se ele pode votar, dependendo da idade que tem. Considerar que a)
	 * Até 15 anos não vota b) Entre 16 e 17 é opcional c) Entre 18 e 70 é
	 * obrigatório d) Acima de 70 é opcional
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe sua idade: ");
		int idade = teclado.nextInt();
		if (idade > 0) {
			if (idade <= 15) {
				System.out.println("Não vota");
			} else if (idade <= 17) {
				System.out.println("É Opcional");
			} else if (idade <= 70) {
				System.out.println("É obrigatório");
			} else {
				System.out.println("É OPCIONAL");
			}

		} else {
			System.out.println("Número inválido");
		}

		teclado.close();
	}

}
