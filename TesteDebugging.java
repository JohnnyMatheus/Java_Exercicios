package Java_Exercicios;

public class TesteDebugging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b = 10;
		int c = maior(a,b);
		if( c!=0) {
			System.out.println("O maior é "+ c);
		}else {
			System.out.println("Os valores são Iguais");
		}
	}
	public static int maior(int x,int y) {
		if(x>y) {
			return x;
		}else if(x<y) {
			return y;
		}else {
			return 0;
		}

	}
}
