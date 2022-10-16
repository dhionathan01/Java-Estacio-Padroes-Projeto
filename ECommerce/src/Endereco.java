
public class Endereco {
	private Integer id_endereco;
	private String rua;
	private String bairro;
	private String cidade;
	private String cep;
	private String pais;
	
	Endereco(Integer id_endereco, String rua, String bairro, String cidade, String cep, String pais){
		setId_endereco(id_endereco);
		setRua(rua);
		setBairro(bairro);
		setCidade(cidade);
		setCep(cep);
		setPais(pais);
	}
	public void exibirEndereco() {
		System.out.println("ID Endereco: " + getId_endereco());
		System.out.println("Rua: " + getRua());
		System.out.println("Bairro: " + getBairro());
		System.out.println("Cidade: " + getCidade());
		System.out.println("Cep: " + getCep());
		System.out.println("Pais: " + getPais());
		System.out.println("\n");
	}
	public Integer getId_endereco() {
		return id_endereco;
	}
	public void setId_endereco(Integer id_endereco) {
		this.id_endereco = id_endereco;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
