package cursoJava.orientacaoObjeto;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		FuncionarioOperacional f1 = new FuncionarioOperacional(1112, "João", "auxiliar administrativo", 2000.0, "vendas");
		
		FuncionarioOperacional f2 = new FuncionarioOperacional();
		
		FuncionarioOperacional f3 = new FuncionarioOperacional();
		
		/*f1.setCadastro((long) 1112);
		f1.setNome("João");
		f1.setOcupacao("auxiliar administrativo");
		f1.setSalario(2000.0);*/
		
		System.out.println(f1.getCadastro());
		System.out.println(f1.getNome());
		System.out.println(f1.getOcupacao());
		System.out.println(f1.getSalario());
		System.out.println(f1.getSetor());
		
		Funcionario.verFuncionarios();
		FuncionarioOperacional.verFuncionarios();
				

	}

}
