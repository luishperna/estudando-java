package CursoJavaJREEJDKCompileEExecuteOSeuPrograma;

public class TestaCaracteres {

		public static void main(String[] args) {
			//O tipo char aceita apenas um carácter (no fundo é um número)
			char letra = 'a';
			System.out.println(letra);
			
			char valor = 65;
			System.out.println(valor);
			
			valor = (char) (valor + 1);
			System.out.println(valor);
			
			String palavra = "alura cursos online de tecnologia";
			System.out.println(palavra);
			
			palavra = palavra + 2020;
			System.out.println(palavra);

		}			
}
