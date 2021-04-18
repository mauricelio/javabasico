package cursoJava.programacaoEstruturada;

/*Exercício aula ao vivo 03/04/2021
 * 
 * Comparar 3 números e dizer qual é o maior
 * 
 * */

import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args) {
		
		int num1=0, num2=0, num3=0;
		
		
		//criar o leitor
		Scanner leitor  = new Scanner (System.in);
		
		System.out.println("Digite o 1º número");
		
		num1 = leitor.nextInt();
		
		System.out.println("Digite o 2º número");
		
		num2 = leitor.nextInt();
		
		System.out.println("Digite o 3º número");
		
		num3 = leitor.nextInt();
		
		boolean igual = num1 == num2 && num2 == num3;
		boolean um = num1 > num2 && num1 > num3;
		boolean dois =  num2 > num3;
		
		System.out.println();
		
		if (igual)
			System.out.println("Todos os números são iguais");
		else if (um)
			System.out.println("O maior número é: "+num1);
		else if (dois)
			System.out.println("O maior número é: "+num2);
		else
			System.out.println("O maior número é: "+num3);
		

	}

}