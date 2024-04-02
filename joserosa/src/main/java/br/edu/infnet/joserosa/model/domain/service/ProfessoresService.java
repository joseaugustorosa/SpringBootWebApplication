package br.edu.infnet.joserosa.model.domain.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.joserosa.model.domain.Professor;
@Service
public class ProfessoresService {
	
	private static Map<String, Professor> professores = new HashMap<String, Professor>();
	public void incluir(Professor profe) {
		professores.put(profe.getNome(), profe);
	}
	public void excluir(int registro) {
		professores.remove(registro);
	}
	public Collection<Professor> obterLista(){
		return professores.values();
	}
	public  Professor obter(int registro) {
		
		return professores.get(registro);
	}

}
