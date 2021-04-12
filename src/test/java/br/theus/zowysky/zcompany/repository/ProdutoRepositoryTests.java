package br.theus.zowysky.zcompany.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.theus.zowysky.zcompany.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Test
	public void inserir() {
		Produto p1 = new Produto(
			null,
			"Coca Cola",
			Byte.valueOf("15"),
			BigDecimal.valueOf(10.50),
			LocalDate.of(2021, 12, 6),
			null
			);
		Produto p2 = new Produto(
				null,
				"Budweiser",
				Byte.valueOf("30"),
				BigDecimal.valueOf(9.00),
				LocalDate.of(2023, 01, 9),
				null
				);
			
		produtoRepository.save(p1);
		produtoRepository.save(p2);
		
	}

}
