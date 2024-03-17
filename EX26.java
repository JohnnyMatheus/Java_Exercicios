package Java_Exercicios;

public class EX26 {
/*2.6 Analise as seguintes variáveis em Java a seguir:
	char c = 'c';
	int i = 10;
	String s = "Hello";
	
	De acordo com as variaveis acima, qual/quais das instruções abaixo compila sem erro?
	
	a)	c = c + i;
	b)	s += i; <- Resposta correta
	c)	i +=  s;
	d)	c += s;

*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'c';
		int i = 10;
		String s = "Hello";
		s += i; 
		
	}

}
