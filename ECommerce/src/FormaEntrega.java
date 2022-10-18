
public class FormaEntrega {
	Integer id_formaEntrega;
	Double valor;
	String tipo;
	Integer qtdDias;
	
	FormaEntrega(Integer id_formaEntrega,Double valor, String tipo, Integer qtdDias){
		setId_formaEntrega(id_formaEntrega);
		setValor(valor);
		setTipo(tipo);
		setQtdDias(qtdDias);

	}
	
	public Integer getId_formaEntrega() {
		return id_formaEntrega;
	}
	public void setId_formaEntrega(Integer id_formaEntrega) {
		this.id_formaEntrega = id_formaEntrega;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getQtdDias() {
		return qtdDias;
	}
	public void setQtdDias(Integer qtdDias) {
		this.qtdDias = qtdDias;
	}
}
