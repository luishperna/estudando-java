package CursoJavaOOEntendendoAOrientaçãoAObjetos;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(40);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta outraConta = new Conta();
		outraConta.deposita(1000);
		
		boolean sucessoTransferencia = outraConta.transfere(300, conta);
		
		if (sucessoTransferencia) {
			System.out.println("Transferência feita com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(outraConta.saldo);
		System.out.println(conta.saldo);
	}
}
