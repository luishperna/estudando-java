package CursoJavaOOEntendendoAOrientaçãoAObjetos;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta outraConta = new Conta();
		System.out.println(outraConta);
		
		outraConta.titular = new Cliente();
		System.out.println(outraConta.titular);
		
		outraConta.titular.nome = "Felipe";
		System.out.println(outraConta.titular.nome);
		
	}
}
