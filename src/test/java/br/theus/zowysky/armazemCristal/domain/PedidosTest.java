package br.theus.zowysky.armazemCristal.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PedidosTest {
	@Test
	public void criar() {
		new Pedidos(
			Short.valueOf("10001"), 
			"Boleto", 
			"Avenida Brasil 155 - AP 12", 
			"Correios",
			"100g Pimenta do reino, 1kg de farinha de amendoas");

}
}
