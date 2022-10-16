public class main {

	public static void main(String[] args) {
		// Criando usuarios 
		Usuario user1 = new Usuario(
				1,
				"dhionathan01@hotmail.com",
				"88831219",
				1,
				"Dhionathan Jobim",
				"312312-123",
				"32998371783",
				"M",
				"17/04/2001");
		Usuario user2 = new Usuario(
				2,
				"juliocezar@hotmail.com",
				"31231219",
				1,
				"Julio Cesar",
				"512312-123",
				"32871371783",
				"M",
				"17/04/2001");
		user1.exibirInformacoes();
		user2.exibirInformacoes();
		// Criando Endereço
		Endereco endereco1 = new Endereco(1, "Rua Mucio Vieira", "BonFim", "Juiz de Fora", "36051-712", "Brasil");
		endereco1.exibirEndereco();
		
		
		
		
	}

}
