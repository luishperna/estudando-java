
public class TestaConversao {

		public static void main(String[] args) {
			double salario = 1270.50;
			/* Obs.: Um valor do tipo double não é compilado para um valor do tipo inteiro por padrão
			int valor = salario; */
			
			// Convertertendo um double para inteiro - Apenas a parte inteira do valor é considerada
			int valor = (int) salario;
			System.out.println(valor);
			
			
			// Guardando valor grande com long (64 bits)
			long numeroGrande = 124312324l;
			
			// Guardando valor pequeno com short (16 bits)
			short numeroPequeno = 2131;
			
			// Guardando valor muito pequeno com byte
			byte b = 127;
			
			// Guardando valor com float
			float pontoFlutuante = 3.14f;
			
			double valor1 = 0.2;
			double valor2 = 0.1;
			double total = valor1 + valor2;
			System.out.println(total);
		}
}
