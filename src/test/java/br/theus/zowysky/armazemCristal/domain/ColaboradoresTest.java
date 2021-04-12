package br.theus.zowysky.armazemCristal.domain;

import java.time.LocalDate;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ColaboradoresTest {
	@Test
	public void criar() {
		 new Colaboradores(
				Short.valueOf("115"),
				"475.120.378-99",
				"Matheus Zowysky",
				Byte.valueOf("21"),
				"Separação e Pesagem",
				LocalDate.of(2021,01,14));
	}

}
