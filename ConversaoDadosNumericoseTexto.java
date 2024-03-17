package Java_Exercicios;

public class ConversaoDadosNumericoseTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Conversão entre dados numéricos e texto
		
		String texto1 = "0123456789";
		int n = Integer.parseInt(texto1);
		System.out.println("Valor de n = "+n);
		String texto2 = Integer.toString(n);
		System.out.println("Conteúdo de texto2 ="+texto2);
		
	}

}
