package fundamentos;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		System.out.println("Digite a segunda nota: ");
		double nota = entrada.nextDouble();
		double nota1 = entrada.nextDouble();
		double media = ((nota + nota1)/2);
		System.out.println(media);
		System.out.println(media>=7? "Aprovado":media>=4.5?"Recuperação":"Reprovado");
	}

}
