package CursoJavaOOEntendendoAOrientaçãoAObjetos;

public class TestaValores {
	public static void main(String[] args) {	
		// Agora para instanciar uma nova conta é necessário informar os dados que
		// o construtor solicita
		Conta conta = new Conta(1337, 24226);
			
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 12423);
		
		System.out.println(Conta.getTotal());
	}
}
