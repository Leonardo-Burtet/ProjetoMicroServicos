package br.edu.projeto.turma.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.projeto.turma.modelo.entidade.Turma;
import br.edu.projeto.turma.modelo.services.TurmaService;

@RestController
@RequestMapping("/turmas")
public class TurmaResource {
	
	private static Logger log = LoggerFactory.getLogger(TurmaResource.class);
	
	@Autowired
	private TurmaService turmaService;
	
	@GetMapping
	public ResponseEntity<List<Turma>> getTurmas() {
		log.info("Api de turma");
		
		try {
			throw new RuntimeException("Erro de negocio");
		} catch (Exception e) {
			log.error("Erro forçado", e);
		}
		
		return ResponseEntity.ok(turmaService.getAll());
	}
}
