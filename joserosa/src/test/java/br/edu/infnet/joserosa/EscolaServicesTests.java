package br.edu.infnet.joserosa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.joserosa.model.domain.Escola;
import br.edu.infnet.joserosa.model.domain.service.EscolaService;


@SpringBootTest
public class EscolaServicesTests {
	
	
	private EscolaService escolaService; 
	
	@BeforeEach
	void setUp() {
		escolaService = new EscolaService();
		
	}
	@Test
	void inclusao() {
		Escola escola = new Escola("infnet", "Infnet@infnet");
		escolaService.incluir(escola);
		assertEquals(escola, escolaService.obter("infnet"));
		
	}
	@Test
	void exclusao() {
		
		}
	@Test
	void recuperarTotal() {
		
	}
	@Test
	void mockito() {
		
	}
	
}
