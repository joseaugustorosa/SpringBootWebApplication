package br.edu.infnet.joserosa;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.joserosa.model.domain.Professor;
@Component
public class ProfessorTeste  implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Professor prof = new Professor();
		prof.setNome("Jorge");
		prof.setRegistro(123);
		prof.setMestre(true);
		prof.setSalario(1000);
		System.out.println("Professor " + prof.getNome());
		
		
		
		Professor prof1 = new Professor();
		prof1.setNome("Paula");
		prof1.setRegistro(1234);
		prof1.setMestre(true);
		prof1.setSalario(2000);
		System.out.println("Professor " + prof1.getNome());


	}
}
