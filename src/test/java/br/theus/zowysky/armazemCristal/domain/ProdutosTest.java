package br.theus.zowysky.armazemCristal.domain;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutosTest {
	@Test
	
	public void criar() {
		 new Produtos(
				Short.valueOf("141"),
				"Pimenta do Reino",
				4.50,
				10.5,
				LocalDate.of(2022, 03, 04));
	}

}
