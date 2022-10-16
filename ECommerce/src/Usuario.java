
public class Usuario  extends Pessoa{
	
	private Integer id_usuario;
	private String email;
	private String senha;
	
	 Usuario(Integer id_usuario,
			 String email,
			 String senha,
			 Integer id_pessoa,
			 String nome,
			 String cpf,
			 String telefone,
			 String sexo,
			 String dataNascimento){
		super(id_pessoa, nome,cpf,telefone,sexo,dataNascimento);
		this.id_usuario = id_usuario;
		this.email = email;
		this.senha = senha;
	}
	
	public void exibirInformacoes() {
		System.out.println("Id: " + this.id_usuario);
		System.out.println("Email: " + this.email);
		System.out.println("senha: " + this.senha);
		System.out.println("Nome: " + this.getNome());
		System.out.println("cpf: " + this.getCpf());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Data Nascimento: " + this.getDataNascimento());
		System.out.println("\n");
	}
	
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
