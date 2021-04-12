package br.theus.zowysky.armazemCristal.repository;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.theus.zowysky.armazemCristal.domain.Colaboradores;
@SpringBootTest
public class ColaboradoresRepositoryTest {
	@Autowired
	
	private ColaboradoresRepository colaboradoresRepository;
	@Test
	public void inserir() {
		Colaboradores c1 = new Colaboradores(
				null,
				"475.120.378-99",
				"Matheus Zowysky",
				Byte.valueOf("21"),
				"Separação e Pesagem",
				LocalDate.of(2021,01,14));
		
		Colaboradores c2 =new Colaboradores(
				null,
				"475.120.378-99",
				"Matheus Zowysky",
				Byte.valueOf("21"),
				"Separação e Pesagem",
				LocalDate.of(2021,01,14));
		
		colaboradoresRepository.save(c1);
		colaboradoresRepository.save(c2);

	}

}
