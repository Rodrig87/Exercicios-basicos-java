package fundamentos;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		int cont = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Telefonou para a vitima?");
		char telefone = entrada.next().charAt(0);
		cont = telefone == 's'?cont+1:cont+0;
		System.out.println("Esteve no local do crime?");
		char local = entrada.next().charAt(0);
		cont = local == 's'?cont+1:cont+0;
		System.out.println("Mora perto da vitima?");
		char mora = entrada.next().charAt(0);
		cont = mora == 's'?cont+1:cont+0;
		System.out.println("Devia para a vitima?");
		char divida = entrada.next().charAt(0);
		cont = divida == 's'?cont+1:cont+0;
		System.out.println("Já trábalhou com a vitima?");
		char trabalho = entrada.next().charAt(0);
		cont = trabalho == 's'?cont+1:cont+0;
		System.out.println(cont  == 2 ?"Suspeito":cont == 3 || cont == 4?"Cumplice":cont == 5? "Assassino":"Inocente");
		
		}
	
	}


