package cursoJava.programacaoEstruturada;

import java.util.Scanner;

/*
  Mauricelio Lima
  data: 06/04/2021
  
 */

public class EstruturasRepeticao {

	public static void main(String[] args) {
		// estrutura de repetição controlada por flag
		
		boolean flag = false;
		
		Scanner leitor = new Scanner(System.in);
		
		while (flag) {
		
			System.out.println("true");
			
			flag = leitor.nextBoolean();
			
		}
		
		// estrutura de repetição controlada por contador
		int contador = 0;
		
		while(contador<10) {
			
			System.out.println(contador++);
			
		}
		
		//boolean flag = false;
		
		do {
			
			System.out.println("Testando o do-while");
		}
		while(false);

	}

}
