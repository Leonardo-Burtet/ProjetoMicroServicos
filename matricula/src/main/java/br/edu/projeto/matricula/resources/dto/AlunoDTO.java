package br.edu.projeto.matricula.resources.dto;

public class AlunoDTO {
	
	private Long codigo;
	private String email;
	private String nome;
	private String cpf;
	private String endereco;
	
	public AlunoDTO() {
		// TODO Auto-generated constructor stub
	}

	public AlunoDTO( String email, String nome, String cpf, String endereco) {
		super();
		this.email = email;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}