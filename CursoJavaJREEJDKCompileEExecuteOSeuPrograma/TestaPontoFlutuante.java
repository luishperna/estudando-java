package CursoJavaJREEJDKCompileEExecuteOSeuPrograma;

public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		/* Declarando a variável salario como o tipo double */
		double salario;
		salario = 1250.70;
		
		System.out.println("Meu salário é " + salario);
		
		/* Declarando a variável idade como o tipo double e atribuindo um valor */
		double idade = 19;
		System.out.println("Minha idade é " + idade);
		
		/* Calculando diretamente na variável do tipo double */
		double divisao = 3.14 / 2;
		System.out.println("O resultado da divisão é " + divisao);
		
		/* Obs.: O lado direito é executado primeiro e, posteriormente, o direito, ou seja, o cálculo
		   entre inteiros é executado primeiro e depois esse valor é passado para o tipo inteiro */
		int outraDivisao = 5 / 2;
		System.out.println("O resultado da parte inteira da divisão é " + outraDivisao);
		
		/* Obs.: Nesse caso o cálculo está entre valores do tipo double pelo 5.0, logo o resultado será
		   um valor do tipo double */
		double novaTentativa = 5.0 / 2;
		System.out.println("O resultado da divisão agora é " + novaTentativa);
				
	}
}
