
public class Pedido {
	private Integer id_pedido;
	private Integer numeroPedido;
	private String status;
	private Double valor = 0.0;
	private Usuario users;
	private Endereco endereco;
	private Produto[] produtos;
	
	Pedido(
		 Integer id_pedido,
		 Integer numeroPedido,
		 String status, Produto[] produto)
	{
		setId_pedido(id_pedido);
		setNumeroPedido(numeroPedido);
		setStatus(status);
		setProdutos(produto);
	}
	
	public Integer getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(Integer id_pedido) {
		this.id_pedido = id_pedido;
	}
	public Integer getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(Integer numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Usuario getUsers() {
		return users;
	}
	public void setUsers(Usuario users) {
		this.users = users;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Produto[] getProdutos() {
		return produtos;
	}
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
		Integer qtdProdutos = produtos.length;
		for(Integer i = 0; qtdProdutos > i; i++) {
			if(produtos[i] == null) {
				break;
			}
			if(produtos[i] != null) {
				setValor( getValor()+ produtos[i].getPreco());
			}else {
				setValor(produtos[i].getPreco());
			}
		}
	}
	public void listaProdutos() {
		if(produtos.length > 0) {	
			Integer qtdProdutos = produtos.length;
			for(Integer i = 0; qtdProdutos > i; i++) {
				if(produtos[i] == null) {
					break;
				}
				produtos[i].exibirProduto();
			}
		}else {
			System.out.println("Não a produtos cadastrados");
		}
	}
	
	public void donoPedido() {
		Usuario donoPedido = getUsers();
		if(donoPedido != null) {
			System.out.println(donoPedido.getNome()); 
		}else {
			System.out.println("Dono do pedido não foi definido");
		}
	}
	
	public void dadosEntrega() {
		Endereco entrega = getEndereco();
		if(entrega != null) {
			entrega.exibirEndereco();
		}else {
			System.out.println("Endereco de entrega Não definido");
		}
		
	}
	
	public void exibirPedido() {
		System.out.println("-------- PEDIDO N° "+ getNumeroPedido() +" ---------");
		System.out.println("ID Pedido: " + getId_pedido());
		System.out.println("Status Pedido: " + getStatus());
		String valorFormatado = String.format("%.2f", getValor());
		System.out.println("Valor Pedido: " + valorFormatado);
		System.out.println("Dono do Pedido: ");
		donoPedido();
		System.out.println("Dados Para Entrega: ");
		dadosEntrega();
		System.out.println("Lista de Produtos: ");
		listaProdutos();
		
	}
}
