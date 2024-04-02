package br.edu.infnet.joserosa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.joserosa.model.domain.Professor;

@SpringBootTest
class ProfessorTests {

	private Professor professor;
	@BeforeEach
	void setUp() {
		professor = new Professor();
		professor.setNome("teste");
		professor.setRegistro(123);
		professor.setMestre(false);
		professor.setSalario(0);
	}
	@Test
	void professorMestre() {
		
		professor.setMestre(true);
		professor.setSalario(1000);
		assertEquals(2000, professor.calcularSalario());
		
		
	}
	@Test
	void professorNaoMestre() {
		professor.setMestre(false);
		professor.setSalario(2000);
		assertEquals(2500, professor.calcularSalario());
		

	}
	@Test
	void professorSemIndicacaoMestre() {
		professor.setSalario(3000);
		assertEquals(3500, professor.calcularSalario());
		
	}
	@Test
	void RecuperandoDados() {
		assertEquals("teste", professor.getNome());
		assertEquals(0, professor.getSalario());
		assertEquals(false, professor.isMestre());
		
		assertEquals(123, professor.getRegistro());
		
	}

}
