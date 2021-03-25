package cursoJava.basico;

import java.util.ArrayList;

/*
 * Classe que especifica a criação e manipulação de Arrays
 * 
 * autor: Mauricelio Lima
 * data: 25/03/2021 
 * 
 * */
public class Vetores {

	public static void main(String[] args) {
		
		//Declaração de um vetor vazio
		int numeros[] = new int[5];
		
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		
		System.out.println(numeros[2]);
		
		//Declarando um vetor com seus valores
		char consoantes[] = {'b','c','d','f','g'};
		
		System.out.println(consoantes[4]);

		//Usando Arraylist, precisa importar a bilioteca CTRL+SHIT+O
		ArrayList<Integer> pares = new ArrayList<>();
		
		pares.add(2);
		pares.add(4);
		
		System.out.println(pares.get(1));
		
		//exercicio progressão de módulo
		char vogais[] = {'a','e','i','o','u'};
		System.out.println(vogais[3]);
		
	}

}
