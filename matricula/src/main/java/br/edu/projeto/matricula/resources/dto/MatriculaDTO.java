package br.edu.projeto.matricula.resources.dto;

import java.util.List;

public class MatriculaDTO {

	private Long alunoId;

	private List<TurmaDTO> turmas;


	public Long getAlunoId() {
		return alunoId;
	}

	public void setClienteId(Long clienteId) {
		this.alunoId = clienteId;
	}

	public List<TurmaDTO> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<TurmaDTO> turmas) {
		this.turmas = turmas;
	}

	@Override
	public String toString() {
		return "MatriculaDTO [alunoId=" + alunoId + ", turmas=" + turmas + "]";
	}

	
}