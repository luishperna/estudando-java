package CursoJavaJREEJDKCompileEExecuteOSeuPrograma;

public class TestaWhile {

	public static void main(String[] args) {
		int contador = 0;
		
		// Dentro dos parênteses deve ser uma expressão booleana (true ou false)
		while (contador <= 10) {
			System.out.println(contador);
			// contador = contador + 1;
			// contador += 1;]
			contador ++;
		}
	
		// Variável contador ainda no escopo do main
		System.out.println(contador);
	}
}
