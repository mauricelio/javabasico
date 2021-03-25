package cursoJava.basico;
/* Fun��es
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
		
		//Operador tern�rio
		int nota = 8;
		String resultado = nota>=7?"Voc� foi aprovado":"Voc� ficou de recupera��o";
		System.out.println(resultado);
		System.out.println();
		
		//exerc�cio de progress�o de m�dulo
		String resultado2 = 19>6?"verdadeiro":"falso";
		System.out.println(resultado2);

	}
	//com retorno do tipo int e recebe dois par�metros
	static int soma(int a, int b) {
		return a + b;
	}
	//Sem retorno
	static void quadrado(int numero) {
		System.out.println(numero*numero);
	}
	
	//N�o recebe par�metro e tem retorno
	static String mensagem() {
		return "Mensagem do sistema";
	}
	//N�o recebe par�metro e n�o retorna nada
	static void olaMundo() {
		System.out.println("Ol� Mundo!");
	}
}
