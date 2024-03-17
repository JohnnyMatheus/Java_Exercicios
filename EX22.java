package Java_Exercicios;

import java.util.Scanner;
import java.util.Locale;

public class EX22 {
	/*
	 * 2.2 Implemente um programa para calcular e mostrar a área de um trapézio,
	 * sabendo que: h = altura, b = base menor, B = base maior, Área = (h x (b + B))
	 * / 2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double h, b, B, area;
		System.out.print("Base maior: ");
		B = teclado.nextDouble();
		System.out.print("Base menor: ");
		b = teclado.nextDouble();
		System.out.print("Altura: ");
		h = teclado.nextDouble();
		area = ((B + b)*h)/2;
		System.out.println("Area Trapézio: "+area);
	}

}
