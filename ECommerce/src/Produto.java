
public class Produto {
	Integer id_produto;
	String nome;
	String marca;
	Double preco;
	String categoria;
	String descricao;
	String imagem;
	Produto(Integer id_produto, String nome, String marca,Double preco, String categoria, String descricao, String imagem){
		setId_produto(id_produto);
		setNome(nome);
		setMarca(marca);
		setPreco(preco);
		setCategoria(categoria);
		setDescricao(descricao);
		setImagem(imagem);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public Integer getId_produto() {
		return id_produto;
	}
	public void setId_produto(Integer id_produto) {
		this.id_produto = id_produto;
	}
	public void exibirProduto() {
		System.out.println("ID Produto: " + getId_produto());
		System.out.println("Nome Produto: " + getNome());
		System.out.println("Marca Produto: " + getMarca());
		System.out.println("Preco Produto: " + getPreco());
		System.out.println("Categoria Produto: " + getCategoria());
		System.out.println("Descricao" + getDescricao());
		System.out.println("Imagem Produto: " + getImagem());
		System.out.println("\n");
	}
	
}
