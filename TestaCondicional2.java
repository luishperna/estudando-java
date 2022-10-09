
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 19;
		int quantidadePessoas = 2;
		
		// Expressão booleana aceita apenas true ou false, não números.
		// boolean aceita expressão que retorna true ou false.
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Está acompanhado = " + acompanhado);
		
		// e -> &&
		// ou -> ||
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
		 
	}
}
