package br.edu.infnet.joserosa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.joserosa.clients.IEnderecoClient;
import br.edu.infnet.joserosa.model.domain.Endereco;
import br.edu.infnet.joserosa.model.domain.Escola;
import br.edu.infnet.joserosa.model.domain.service.EscolaService;
import br.edu.infnet.joserosa.model.domain.service.LocalidadeService;


@Component
public class EscolaLoader implements ApplicationRunner{
	@Autowired
	private LocalidadeService enderecoClient;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Endereco loc =enderecoClient.obterPorCep("20010020");
		
		
		EscolaService escolaService = new EscolaService();
		System.out.println(escolaService.obterLista());
		escolaService.incluir(new Escola("infnet 1", "infnet@infnet.com",loc));
		escolaService.excluir("infnet 1");
		escolaService.incluir(new Escola("infnet 2", "infnet2@infnet.com",loc));
		escolaService.incluir(new Escola("infnet 3", "infnet3@infnet.com",loc));
		System.out.println(escolaService.obterLista());
		System.out.println(escolaService.obter("infnet 2"));
	}
}
