package br.theus.zowysky.armazemCristal.domain;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DistribuidoresTest {
	@Test
	public void criar() {
		new Distribuidores(
				Short.valueOf("1001"),
				"Armazem Santa Filomena",
				Short.valueOf("1052"),
				LocalDate.of(2021, 03,21));
	}

}
