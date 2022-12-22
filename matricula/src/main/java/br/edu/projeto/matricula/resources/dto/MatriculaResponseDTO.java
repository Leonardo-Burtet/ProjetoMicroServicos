package br.edu.projeto.matricula.resources.dto;

import java.util.List;

public class MatriculaResponseDTO {
	
	private AlunoDTO aluno;
	
	private List<TurmaAlunoDTO> listaTurmaAlunoDTO;
	
	public MatriculaResponseDTO() {
	}
	public MatriculaResponseDTO(AlunoDTO aluno, List<TurmaAlunoDTO> listaTurmaAlunoDTO) {
		super();
		this.aluno = aluno;
		this.listaTurmaAlunoDTO = listaTurmaAlunoDTO;
	}

	
	public AlunoDTO getAluno() {
		return aluno;
	}

	public List<TurmaAlunoDTO> getListAlunoTurma() {
		return listaTurmaAlunoDTO;
	}

	
	

}
