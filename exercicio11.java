package fundamentos;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número equivalente ao dia da semana: ");
		int resp = entrada.nextInt();
		System.out.println(resp==1?"Domingo":resp==2?"Segunda":resp==3?"Terça":resp==4?"Quarta":resp==5?"Quinta":resp==6?"Sexta":resp==7?"Sabado":"numero invalido");
		
	
		
	}

}
