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
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Colaboradores {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short cod_Colaborador;
	
	@Column(nullable = false, unique = true)
	private String cpf;
	
	@Column
	private String nome;
	
	@Column(nullable = false)
	private Byte idade;
	
	@Column(nullable = false)
	private String setorDeAtuação;
	
	@Column(nullable = false)
	private LocalDate dataDeAdmissão;
	
	

}
