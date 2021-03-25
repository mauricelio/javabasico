package cursoJava.basico;

/*
 *Classe explicativa sobre as expressões aritméticas 
 * 
 * autor: Mauricelio Lima
 * 
 * data: 25/03/2021
 * 
 */

public class ExpressoesAritmeticas {

	public static void main(String[] args) {
		
		//Testando as precedências
		int resultado = (10 + 2) * 3 / 2;
		boolean resultado2 = 27 + 40 > 100-20;
		boolean resultado3 = 30 == 3 * 10 && 50 < 15;
		
		//Biblioteca Class Math, potência
		double resultado4 = Math.pow(2,  10);
		
		//Resultados
		System.out.println(resultado);
		System.out.println(resultado2);
		System.out.println(resultado3);
		System.out.println(resultado4);

		System.out.println(Math.PI);
		
		
		//exercício de progressão
		int a = 14, b = 5;
		int c = a % b;
		double divisao = a / b;
		System.out.println(c);
		
		System.out.println(Math.ceil(divisao));
		
		System.out.println(Math.pow(5,2));
		
		

	}

}
