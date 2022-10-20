package CursoJavaOOEntendendoAOrientaçãoAObjetos;

// Criando a classe Conta
public class Conta {
	// Definindo atributos da classe
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	// Definindo métodos da classe
	// Obs.: Usando void para retornar nada
	public void deposita(double valor) {
		// this é referente a conta no qual está invocando
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
		return false;
	}
	
}