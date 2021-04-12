package br.theus.zowysky.armazemCristal.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EstoqueTest {
	@Test
	public void criar() {
		 new Estoque(
				Short.valueOf("141"),
				10.5,
				Short.valueOf("50"));
	}

}
