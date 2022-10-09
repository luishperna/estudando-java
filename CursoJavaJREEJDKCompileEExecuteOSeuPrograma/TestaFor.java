package CursoJavaJREEJDKCompileEExecuteOSeuPrograma;

public class TestaFor {
	
	public static void main(String[] args) {
		
		// for (inicialização da variável; condição booleana; atualização do valor da váriavel) {}
		for (int contador = 0; contador <= 10; contador++) {
			System.out.println(contador);
		}
		
		// Não compila, pois o contador é valido apenas no escopo do for:
		// System.out.println(contador);
	}
}
