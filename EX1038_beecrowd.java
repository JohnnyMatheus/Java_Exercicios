package Java_Exercicios;
import java.util.Locale;
import java.util.Scanner;
public class EX1038_beecrowd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.printf("Código Especicação Preço%n"
				+ "1 - Cachorro quente R$: 4.00%n"
				+ "2 - X-Salada R$: 4.50%n"
				+ "3 - X-Bacon R$: 5.00%n"
				+ "4 - Torrada simples R$: 2.00%n"
				+ "5 - Refrigerante R$ 1.50%n");
		System.out.print("Informe o código: ");
		int codigo = sc.nextInt();
		System.out.println("Informe a Quantidade: ");
		int quantidade = sc.nextInt();
		switch(codigo) {
		case 1:
			System.out.printf("Total: R$ %.2f",(double)quantidade *4.00);
		break;	
		case 2:
			System.out.printf("Total: R$ %.2f",(double)quantidade *4.50);
		break;	
		case 3:
			System.out.printf("Total: R$ %.2f",(double)quantidade *5.00);
		break;	
		case 4:
			System.out.printf("Total: R$ %.2f",(double)quantidade *2.00);
		break;	
		case 5:
			System.out.printf("Total: R$ %.2f",(double)quantidade *1.50);
		break;	
		default:
			System.out.println("CÓDIGO INVÁLIDO");
		break;
		}
		
	}

}
