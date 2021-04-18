package cursoJava.programacaoEstruturada;


public class EstruturasDecisao {

	public static void main(String[] args) {
		
		//if
		int idade = 20;
		if(idade>=18) {
			System.out.println("Já pode tirar a CNH");
		}
		System.out.println();
		
		//if-else
		if(idade>=18) {
			System.out.println("Já pode tirar a CNH");
		}else {
			System.out.println("Não tem idade para dirigir");
		}
		
		System.out.println();
		
		//if-else com mais opções
		String semaforo ="verde";
		
		if(semaforo=="verde") {
			System.out.println("Siga em frente");
		}
		else if (semaforo=="amarelo") {
			System.out.println("Tenha atenção");
		}
		else if(semaforo=="vermelho") {
			System.out.println("Pare");
		}
		else {
			System.out.println("Chame a autarquia de trânsito");
		}
		
		System.out.println();
		
		//switch-case, tomar decisões em menu
		char opcao = 'a';
		
		switch (opcao) {
			case 'a': System.out.println("Cadastrar produto");	break;
			case 'b': System.out.println("Visualizar detalhes");	break;
			case 'c': System.out.println("Editar produto");	break;
			case 'd': System.out.println("Deletar produto");	break;
			default: System.out.println("Opção inválida"); break;
		}

	}

}
