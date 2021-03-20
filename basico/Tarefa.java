package cursoJava.basico;

public class Tarefa {

	public static void main(String[] args) {
		// Exemplo da aula ao vivo dia 20/03/2021
		int contador = 1;
		double somador = 0;
		
		for(;contador<=100;contador++) {
			
			somador+= (double)1/contador;
		}
		
		System.out.println(somador);
	}

}
