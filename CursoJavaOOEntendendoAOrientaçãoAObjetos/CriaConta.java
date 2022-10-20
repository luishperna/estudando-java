package CursoJavaOOEntendendoAOrientaçãoAObjetos;

public class CriaConta {
	
	public static void main(String[] args) {
		
		// Criando Objeto instanciado da classe Conta
		Conta primeiraConta = new Conta();
		
		// Definindo valor ao atributo saldo da classe Conta
		primeiraConta.saldo = 200;
		
		// Acessando o atributo da classe Conta
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		// Criando outro Objeto instanciado da classe Conta
		// Obs.: segundaConta é uma referência do tipo Conta
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);
		
		// Os valores default para as classes são zero
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
		} else {
			
		} System.out.println("Contas diferentes");
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
