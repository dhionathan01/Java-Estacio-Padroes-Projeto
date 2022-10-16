
public class Pedido {
	private Integer id_pedido;
	private Integer numeroPedido;
	private String status;
	private Double valor;
	private Usuario users;
	private Endereco endereco;
	private Produto[] produtos;
	
	Pedido(
		 Integer id_pedido,
		 Integer numeroPedido,
		 String status,
		 Double valor)
	{
		setId_pedido(id_pedido);
		setNumeroPedido(numeroPedido);
		setStatus(status);
		setValor(valor);
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
	}
}
