import java.util.Scanner;
	
public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num;
		
		System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();
		
		System.out.println("O número digitado é " + num);
		
		num = num + 1;
		System.out.println("O seu sucessor é " + num);

		num = num - 2;
		System.out.println("O seu antecessor é " + num);
		
		num = (num * 2) + 2;
		System.out.println("O seu dobro é " + num);
		
		num = (num / 2) / 2;
		System.out.println("A sua metade é " + num);
		
	}

}
