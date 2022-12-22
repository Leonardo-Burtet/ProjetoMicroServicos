package br.edu.projeto.matricula.modelo.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Matricula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String email;
	private String nome;
	private String cpf;
	private Double idade;
	
	public Matricula() {
		// TODO Auto-generated constructor stub
	}

	public Matricula(Long codigo, String email, String nome, String cpf, Double idade) {
		super();
		this.codigo = codigo;
		this.email = email;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Matricula [codigo=" + codigo + ", email=" + email + ", nome=" + nome + ", cpf=" + cpf + ", idade="
				+ idade + "]";
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getIdade() {
		return idade;
	}

	public void setIdade(Double idade) {
		this.idade = idade;
	}
	
	
}
