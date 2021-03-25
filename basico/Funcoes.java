package cursoJava.basico;
/* Funções
 * 
 * data: 25/03/2021
 * 
 * */
public class Funcoes {

	public static void main(String[] args) {
		
		int result = soma(10,60);
		System.out.println(result);
		System.out.println();
		
		quadrado(7);
		System.out.println();
		
		String texto = mensagem();
		System.out.println(texto);
		System.out.println();
		
		olaMundo();
		System.out.println();
		
		//Operador ternário
		int nota = 8;
		String resultado = nota>=7?"Você foi aprovado":"Você ficou de recuperação";
		System.out.println(resultado);
		System.out.println();
		
		//exercício de progressão de módulo
		String resultado2 = 19>6?"verdadeiro":"falso";
		System.out.println(resultado2);

	}
	//com retorno do tipo int e recebe dois parâmetros
	static int soma(int a, int b) {
		return a + b;
	}
	//Sem retorno
	static void quadrado(int numero) {
		System.out.println(numero*numero);
	}
	
	//Não recebe parâmetro e tem retorno
	static String mensagem() {
		return "Mensagem do sistema";
	}
	//Não recebe parâmetro e não retorna nada
	static void olaMundo() {
		System.out.println("Olá Mundo!");
	}
}
