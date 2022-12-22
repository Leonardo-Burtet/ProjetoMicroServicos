package br.edu.projeto.matricula.resources.dto;


public class TurmaAlunoDTO {

	private Long codigo;
	
	private String nome;
	
	private String sigla;
	
	public TurmaAlunoDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Override
	public String toString() {
		return "Turma [codigo=" + codigo + ", nome=" + nome + ", sigla=" + sigla + "]";
	}	
}
