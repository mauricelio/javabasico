package cursoJava.basico;

/*
 *Classe explicativa sobre as express�es aritm�ticas 
 * 
 * autor: Mauricelio Lima
 * 
 */

public class ExpressoesAritmeticas {

	public static void main(String[] args) {
		
		//Testando as preced�ncias
		int resultado = (10 + 2) * 3 / 2;
		boolean resultado2 = 27 + 40 > 100-20;
		boolean resultado3 = 30 == 3 * 10 && 50 < 15;
		
		//Biblioteca Class Math, pot�ncia
		double resultado4 = Math.pow(2,  10);
		
		//Resultados
		System.out.println(resultado);
		System.out.println(resultado2);
		System.out.println(resultado3);
		System.out.println(resultado4);

		System.out.println(Math.PI);

		

	}

}
