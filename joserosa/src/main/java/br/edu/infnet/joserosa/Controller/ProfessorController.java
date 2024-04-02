package br.edu.infnet.joserosa.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.joserosa.model.domain.Professor;
import br.edu.infnet.joserosa.model.domain.service.ProfessoresService;

@RestController
@RequestMapping("/api/professor")
public class ProfessorController {
	@Autowired
	private  ProfessoresService professorService;
 
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Professor profe) {
	
		professorService.incluir(profe);
	}
	@DeleteMapping(value = "/{registro}/excluir")
	public void excluir(int registro) {
	
		professorService.excluir(registro);
	}
	@GetMapping(value = "/listar")
	public Collection<Professor> obterLista(){
	 return professorService.obterLista();
	}
	@GetMapping(value = "/{registro}/listar")
	public  Professor obter(@PathVariable int registro) {
		return professorService.obter(registro);
	
	}
	
}
