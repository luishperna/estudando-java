package CursoJavaOOEntendendoAOrientaçãoAObjetos;

// Criando a classe Conta
public class Conta {
	// Definindo atributos da classe
	// Encapsulamento do atributo saldo como private
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	// static => o atributo total é da classe, não do objeto
	private static int total;
	
	// Construtor da classe => Rotina de inicialização
	// Obs.: Criado automaticamente pelo Java caso não descrito
	public Conta(int agencia, int numero) {
		// Atributo da classe
		Conta.total++;
		System.out.println("O total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta: " + this.numero);
	}

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
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	// set normalmente não retorna nada
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	// Definindo o método da classe com static
	// método static não existe atributo this (dessa)
	public static int getTotal() {
		return Conta.total;
	}
}