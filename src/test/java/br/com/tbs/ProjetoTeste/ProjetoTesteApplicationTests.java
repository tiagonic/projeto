package br.com.tbs.ProjetoTeste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.tbs.ProjetoTeste.pessoa.PessoaEntity;

@SpringBootTest
class ProjetoTesteApplicationTests {

	@Test
	void contextLoads() {
		PessoaEntity p = new PessoaEntity();
		
		assertEquals(1, 1);
		assertNotNull(p);
		
		return;
	}

}
