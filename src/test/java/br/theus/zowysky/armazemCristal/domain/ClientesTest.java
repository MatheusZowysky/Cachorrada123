package br.theus.zowysky.armazemCristal.domain;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClientesTest {
	@Test
	
	public void criar() {
		new Clientes(
				475129,
				Byte.valueOf("18"),
				LocalDate.of(2005,5,14),
				Short.valueOf("20145"));
	}

}
