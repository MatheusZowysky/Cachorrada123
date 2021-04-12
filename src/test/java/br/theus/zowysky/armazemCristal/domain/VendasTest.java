package br.theus.zowysky.armazemCristal.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VendasTest {
	@Test
	
	public void criar() {
		new Vendas(
				Short.valueOf("10001"), 
				"415.202.587-96");
	}

}
