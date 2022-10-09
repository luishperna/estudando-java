package CursoJavaJREEJDKCompileEExecuteOSeuPrograma;

public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;

		// Não aplica o valor após a atribuição
		primeiro = 10;

		System.out.println(segundo);
	}
}
