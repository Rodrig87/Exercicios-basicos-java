package fundamentos;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu sexo: F para Feminino e M para Masculino");
		char resp = entrada.next().charAt(0);
		System.out.println(resp == 'M' || resp == 'm'?"Masculino":"Feminino");
		;
		

	}

}
