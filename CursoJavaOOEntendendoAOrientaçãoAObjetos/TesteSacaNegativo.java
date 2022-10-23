package CursoJavaOOEntendendoAOrientaçãoAObjetos;

public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101));
		
		// Um atribuito privado não pode ser modificado ou lido por outras classes:
		// conta.saldo = conta.saldo - 101;
		
		// Invocando o método para ver o atributo saldo (privado)
		System.out.println(conta.getSaldo());
	}
}
