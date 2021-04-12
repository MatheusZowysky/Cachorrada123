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
public class Distribuidores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short cod_Cadastro;
	
	@Column
	private String nomeEmpresa;
	
	@Column
	private Short cod_Produto;
	
	@Column
	private LocalDate dataDeEmissão;
	
		
	}

