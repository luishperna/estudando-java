package CursoJavaOOEntendendoAOrientaçãoAObjetos;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente luis = new Cliente();
		luis.nome = "Luís Perna";
		luis.cpf = "123.123.123-12";
		luis.profissao = "Desenvolvedor";
		
		Conta contaDoLuis = new Conta();
		contaDoLuis.deposita(100);
		
		// Composição
		// Associa o cliente luis a contaDoLuis
		contaDoLuis.titular = luis;
		System.out.println(contaDoLuis.titular.nome);
	}
}
