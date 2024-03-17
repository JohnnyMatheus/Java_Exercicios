package Java_Exercicios;

import java.util.Calendar;

public class EX35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendario = Calendar.getInstance();

		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		int mes = calendario.get(Calendar.MONTH);
		int ano = calendario.get(Calendar.YEAR);

		switch (mes) {
		case 0:
			System.out.printf("Dia: %d%n", dia);
			System.out.println("Mês: Janeiro");
			System.out.printf("Ano: %d", ano);
			break;
		case 1:
			System.out.printf("Dia: %d%n", dia);
			System.out.println("Mês: Fevereiro");
			System.out.printf("Ano: %d", ano);
			break;
		case 2:
			System.out.printf("Dia: %d%n", dia);
			System.out.println("Mês: Março ");
			System.out.printf("Ano: %d", ano);
			break;
		case 3:
			System.out.printf("Dia: %d%n", dia);
			System.out.println("Mês: Abril ");
			System.out.printf("Ano: %d", ano);
			break;
		case 4:
			System.out.printf("Dia: %d%n", dia);
			System.out.println("Mês: Maio ");
			System.out.printf("Ano: %d", ano);
			break;
		case 5:
			System.out.printf("Dia: %d%n", dia);
			System.out.println("Mês: Junho");
			System.out.printf("Ano: %d", ano);
			break;
		case 6:
			System.out.printf("Dia: %d%n", dia);
			System.out.println("Mês: Julho");
			System.out.printf("Ano: %d", ano);
			break;
		case 7:
			System.out.printf("Dia: %d%n", dia);
			System.out.println("Mês: Agosto");
			System.out.printf("Ano: %d", ano);
			break;
		case 8:
			System.out.printf("Dia: %d%n", dia);
			System.out.println("Mês: Setembro");
			System.out.printf("Ano: %d", ano);
			break;
		case 9:
			System.out.printf("Dia: %d%n", dia);
			System.out.println("Mês: Outubro");
			System.out.printf("Ano: %d", ano);
			break;
		case 10:
			System.out.printf("Dia: %d%n", dia);
			System.out.println("Mês: Novembro");
			System.out.printf("Ano: %d", ano);
			break;
		case 11:
			System.out.printf("Dia: %d%n", dia);
			System.out.println("Mês: Dezembro");
			System.out.printf("Ano: %d", ano);
			break;

		}
	}

}
