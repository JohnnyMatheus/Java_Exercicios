package Java_Exercicios;

import java.util.Scanner;
import java.util.Locale;
import java.math.*;
import java.text.Format;

public class EX24 {

	/*
	 * 2.4 Uma pessoa deseja pregar um quadro em uma parede, utilizando uma escada
	 * como apoio. Construa um programa para calcular e mostrar a que distância a
	 * escada deve estar da parede. O usuário deve fornecer o tamanho da escada e a
	 * altura em que deseja pregar o quadro. Lembre-se, porém, que o tamanho da
	 * escada precisa ser maior que a altura que se deseja alcançar. Lembram da
	 * fórmula ?
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o tamaho a medida da escada: ");
		double medidaEscada = teclado.nextDouble();
		System.out.println("Informe a altura: ");
		double altura = teclado.nextDouble();
		System.out.printf("Distancia: %.2f", (double) Math.sqrt((Math.pow(medidaEscada, 2) - Math.pow(altura, 2))));
	}
}
