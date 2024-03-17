package Java_Exercicios;

public class DeclaracaoVariaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1° Declaração forma Tradicional
		String nome1 = "Johnny";
		int idade1 = 29;
		float altura1 = 1.85f;
		double salario1 = 5000.00;
		char sexo1 = 'M';
		char letra1 = 65;
		boolean ativo1 = true;

		System.out.println("Nome: " + nome1);
		System.out.println("Idade: " + idade1);
		System.out.println("Altura: " + altura1);
		System.out.println("Sexo: " + sexo1);
		System.out.println("Letra: " + letra1);
		System.out.println("Boolean: " + ativo1);

		// 2° Declaração: typecast
		String nome2 = (String) "Johnny";
		int idade2 = (int) 29;
		float altura2 = (float) 1.85;
		char sexo2 = (char) 'J';
		char letra2 = (char) 'A';
		boolean ativo2 = (boolean) false;

		System.out.println("Nome: " + nome2);
		System.out.println("Idade: " + idade2);
		System.out.println("Altura: " + altura2);
		System.out.println("Sexo: " + sexo2);
		System.out.println("Letra: " + letra2);
		System.out.println("Boolean: " + ativo2);

		// 3° Wrapper class ou invólucro
		Integer idade3 = new Integer(29);
		Float altura3 = new Float(1.85);
		Character sexo3 = new Character('M');
		Character letra3 = new Character('J');
		Boolean ativo3 = new Boolean(true);
		String nome3 = new String("Johnny");

		System.out.println("Nome: " + nome3);
		System.out.println("Idade: " + idade3);
		System.out.println("Altura: " + altura3);
		System.out.println("Sexo: " + sexo3);
		System.out.println("Letra: " + letra3);
		System.out.println("Boolean: " + ativo3);
		
		//CONSTANTES
		
		final float QUANTIDADE = 400F; 
	}

}
