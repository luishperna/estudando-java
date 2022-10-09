package CursoJavaJREEJDKCompileEExecuteOSeuPrograma;

/* Nome da classe em CamelCase */
public class TestaVariaveis {
	
	public static void main(String[] args) {
		System.out.println("Olá, novo teste!");
		
		/* Declarando a variável idade como um valor do tipo inteiro */
		int idade;
		
		/* Atribuindo um valor para a variável idade */
		idade = 19;
		
		/* Mostrando a variável idade no console */
		System.out.println(idade);
		
		/* Trabalhando com operadores aritméticos na variável idade */
		idade = 30 + 10;
		
		System.out.println(idade);
		
		idade = 7 * 5 + 2;
		
		System.out.println(idade);
		
		/* Concatenando a variável idade em uma string*/
		System.out.println("A idade é: " + idade + ", parabéns!");
	}
}
