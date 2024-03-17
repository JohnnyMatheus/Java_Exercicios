package Java_Exercicios;

import java.util.Scanner;

public class EX33 {
	// 3.3 Ampliar o programa anterior para datas com dia, mês e ano.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dia1, dia2, mes1, mes2, ano1, ano2;
		System.out.print("Dia1: ");
		dia1 = sc.nextInt();
		System.out.print("Mês1: ");
		mes1 = sc.nextInt();
		System.out.print("Ano1: ");
		ano1 = sc.nextInt();

		System.out.print("Dia2: ");
		dia2 = sc.nextInt();
		System.out.print("Mês2: ");
		mes2 = sc.nextInt();
		System.out.print("Ano2: ");
		ano2 = sc.nextInt();

		if (dia1 > dia2 || mes1 > mes2 || ano1 > ano2) {
			System.out.printf("Maior data: %d/%d/%d", dia1, mes1, ano1);
		}else {
			System.out.printf("Maior data: %d/%d/%d", dia2, mes2, ano2);
		}

	}

}
