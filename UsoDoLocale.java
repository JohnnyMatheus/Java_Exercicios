package Java_Exercicios;
import java.util.Locale;
import java.util.Scanner;
//import java.util.Locale;

public class UsoDoLocale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double peso = sc.nextDouble();
		System.out.println(peso);
	}

}
