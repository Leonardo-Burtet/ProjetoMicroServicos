package br.edu.projeto.matricula.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.projeto.matricula.resources.dto.TurmaAlunoDTO;

@FeignClient("alunos")
public interface AlunoClient {
	
	@GetMapping("/alunos")
	ResponseEntity<List<TurmaAlunoDTO>> getAlunos();
}
