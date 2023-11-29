package fundamentos;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double resp = entrada.nextDouble();
		
		System.out.println(resp==0?"Número neutro":resp>0?"Número positivo":"Negativo");
		
		
		}
	}


