package Java_Exercicios;
import java.util.Scanner;
public class OperadorTernario {
	
 //indicar se estamos na primeira ou na segunda quinzena de um mês.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("entre com numero de dias: ");
		int dias = teclado.nextInt();
		
		String quinzena = (dias <=15)? " Primeira":"Segunda quinzena";
		System.out.println(quinzena);
		
		teclado.close();
		
	
	}

}
