package Java_Exercicios;

import java.util.Scanner; //importar biblioteca Scanner
import java.util.Locale;

public class EntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		String nome;
		int idade;
		float altura;
		char sexo;
		double salario;
		System.out.print("Nome: ");
		nome = teclado.next();
		System.out.print("Idade: ");
		idade = teclado.nextInt();
		System.out.println("Altura: ");
		altura = teclado.nextFloat();
		System.out.print("Sexo: ");
		sexo = teclado.next().charAt(0);
		System.out.print("Sálario: ");
		salario = teclado.nextDouble();

		System.out.println(nome);
		System.out.println(idade);
		System.out.println(altura);
		System.out.println(sexo);
		System.out.println(salario);
		
		teclado.close();
	}

}
