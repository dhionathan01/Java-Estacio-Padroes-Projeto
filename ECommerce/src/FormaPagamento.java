
public class FormaPagamento {
	Integer id_formaPagamento;
	String tipo;
	String nome;
	String gateway;
	
	FormaPagamento(Integer id_formaPagamento, String tipo, String nome, String gateway){
		setId_formaPagamento(id_formaPagamento);
		setTipo(tipo);
		setNome(nome);
		setGateway(gateway);
	}
	
	public Integer getId_formaPagamento() {
		return id_formaPagamento;
	}
	public void setId_formaPagamento(Integer id_formaPagamento) {
		this.id_formaPagamento = id_formaPagamento;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGateway() {
		return gateway;
	}
	public void setGateway(String gateway) {
		this.gateway = gateway;
	}
}
