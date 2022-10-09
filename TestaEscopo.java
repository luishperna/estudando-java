
public class TestaEscopo {
	
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 19;
		int quantidadePessoas = 2;
		
		// Expressão booleana aceita apenas true ou false, não números.
		// boolean aceita expressão que retorna true ou false.
		//boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
				
		// Uma variável é valida apenas em seu bloco (escopo) que é definido pelas chaves {}
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
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
