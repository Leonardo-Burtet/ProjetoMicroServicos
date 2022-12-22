package br.edu.projeto.matricula.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.projeto.matricula.modelo.entidade.Matricula;
import br.edu.projeto.matricula.modelo.services.MatriculaService;

@RestController
@RequestMapping("/matriculas")
public class MatriculaResource {
	
	@Autowired
	private MatriculaService matriculaService;
	
	@GetMapping("/{codigo}")
	public Matricula getMatricula(@PathVariable Long Codigo) {
		return matriculaService.getByCodigo(Codigo);
	}
}
