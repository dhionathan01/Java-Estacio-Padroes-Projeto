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
		
		
		// Criando produto
		Produto produto1 = new Produto(
				1,
				 "TV 55pol",
				 "Samsung",
				 3550.90,
				 "Eletronico",
				 "TV Led 55 4k dolby atmos",
				 "caminhofictiocio/img/TV_Samsung_55_4k_3312"
				);
		
		Produto produto2 = new Produto(
				2,
				 "notebook Acer 15.6",
				 "Acer",
				 4500.90,
				 "Eletronico",
				 "Notebook Acer , processador Ryzen 5 3500u, 16gbRam, Placa de video Radeon 540x",
				 "caminhofictiocio/img/Notebook Acer"
				);
		produto1.exibirProduto();
		produto2.exibirProduto();
		Produto[] produtos = new Produto[10];
		produtos[0] = produto1;
		produtos[1] = produto2;
		
		FormaEntrega forma1 = new FormaEntrega(1, 56.90,"Sedex", 5);
		FormaEntrega forma2 = new FormaEntrega(2, 20.90,"CorreiosPadrão", 14);
		
		FormaPagamento  pagamento1 = new FormaPagamento(1,"digital","Cartão Credito","3112");
		FormaPagamento  pagamento2 = new FormaPagamento(2,"fisico","dinheiro","null");
		
		Pedido pedido1 = new Pedido(
				  1,
				  3312,
				  "Concluído",
				  produtos
				);
		pedido1.setEndereco(endereco1);
		pedido1.setUsers(user1);
		pedido1.setFormaEntrega(forma1);
		pedido1.setFormaPagamento(pagamento1);
		pedido1.exibirPedido();

	}

}
