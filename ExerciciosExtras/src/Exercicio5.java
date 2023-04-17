import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int dist;
		
		System.out.println("Informe a distância do inimigo: ");
		dist = sc.nextInt();
		
		if(dist < 70) {
			System.out.println("ATIVADO");
		}
		else {
			System.out.println("DESATIVADO");
		}
	}
}
