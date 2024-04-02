package br.edu.infnet.joserosa;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.joserosa.clients.ILocalidadeClient;
import br.edu.infnet.joserosa.model.domain.Estado;
import br.edu.infnet.joserosa.model.domain.Municipio;
import br.edu.infnet.joserosa.model.domain.service.LocalidadeService;


@Component
public class LocaclidadeLoader implements ApplicationRunner{
	@Autowired
	private LocalidadeService localidadeClient;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Collection<Estado> estados = localidadeClient.obterEstados();
		
		for (Estado estado : estados) {
			System.out.println(estado.getNome());
			Collection<Municipio> MUNI = localidadeClient.obterMunicipioPorUf(estado.getId());
			for (Municipio mun : MUNI) {
				System.out.println(mun.getNome());
				
			}
		}
		
		//localidadeClient.obterEstados();
		//localidadeClient.obterDistritoPorUf();
		//localidadeClient.obterMunicipioPorUf();
	}
}
