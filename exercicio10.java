package fundamentos;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double resp = entrada.nextDouble();
		double resp2 = entrada.nextDouble();
		double resp3 = entrada.nextDouble();
		
		if (resp > resp2) {
			if (resp > resp3) {
				if (resp2 > resp3) {
					System.out.println("O número maior é o " + resp);
					System.out.println("O número menor é o "+ resp3);
				}
				else {
					System.out.println("O número maior é o " + resp);
					System.out.println("O número menor é o "+ resp2);
				}
			}
			else {
				System.out.println("O número maior é o " + resp3);
				System.out.println("O número menor é o "+ resp2);
			}
		}
		else {
			if (resp2 > resp3) {
				if (resp > resp3) {
					System.out.println("O número maior é o " + resp2);
					System.out.println("O número menor é o "+ resp);
				}
				else {
					System.out.println("O número maior é o " + resp2);
					System.out.println("O número menor é o "+ resp3);
				}
			}
			else {
				System.out.println("O número maior é o " + resp3);
				System.out.println("O número menor é o "+ resp);
			}
		}
		

}
}