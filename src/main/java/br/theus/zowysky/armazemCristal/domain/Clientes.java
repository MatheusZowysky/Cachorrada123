package br.theus.zowysky.armazemCristal.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Clientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String cpf;
	
	@Column(nullable = false)
	private Byte idade;
	
	@Column(nullable = false)
	private LocalDate dataDeNascimento;
	
	@Column(nullable = false)
	private Short telefone;
	
	

}
