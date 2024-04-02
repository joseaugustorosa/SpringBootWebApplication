package br.edu.infnet.joserosa;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.joserosa.model.domain.Endereco;



@Component
public class EnderecoLoader implements ApplicationRunner{

	public void run(ApplicationArguments args) throws Exception {
		
		Endereco e1 = new Endereco();
		e1.setCep("12345678");
		e1.setLocalidade("teste1");
		e1.setBairro("teste2");
		System.out.println(e1);
		
		Endereco e2 = new Endereco("12345678");
		e2.setLocalidade("teste1");
		e2.setBairro("teste2");
		System.out.println(e2);
		
		Endereco e3 = new Endereco("12345678","teste1", "teste2", "teste3","teste4", "teste5" );
		System.out.println(e3);
		}
}
