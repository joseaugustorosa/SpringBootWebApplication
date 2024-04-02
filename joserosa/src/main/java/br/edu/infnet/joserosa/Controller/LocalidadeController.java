package br.edu.infnet.joserosa.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.joserosa.model.domain.Distrito;
import br.edu.infnet.joserosa.model.domain.Endereco;
import br.edu.infnet.joserosa.model.domain.Estado;
import br.edu.infnet.joserosa.model.domain.Municipio;
import br.edu.infnet.joserosa.model.domain.service.LocalidadeService;

@RestController
@RequestMapping("/api/localidade")
public class LocalidadeController {
	@Autowired
	private LocalidadeService localidadeClient;
	

	@GetMapping(value = "/{cep}")
	public Endereco obterPorCep(@PathVariable String cep) { return localidadeClient.obterPorCep(cep);}
	
	@GetMapping(value = "/estados")
	public Collection<Estado> obterEstados(){ return localidadeClient.obterEstados();}
	@GetMapping(value = "/{uf}/municipios")
	public Collection<Municipio> obterMunicipioPorUf(@PathVariable Integer uf){ 
		 return localidadeClient.obterMunicipioPorUf(uf);
		}
	@GetMapping(value = "/{municipio}/distritos")
	public Collection<Distrito> obterDistritoPorUf(@PathVariable Integer municipio){ 
		 return localidadeClient.obterDistritoPorUf(municipio);
		}
	
	
}
