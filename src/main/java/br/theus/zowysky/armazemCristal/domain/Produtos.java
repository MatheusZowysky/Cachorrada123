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
public class Produtos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short codigo;
	
	@Column(length = 100, nullable = false, unique = true)
	private String nome; 
	
	@Column(nullable = false)
	private Double preço;
	
	@Column(nullable = false)
	private Double quantidade; 
	
	@Column(nullable = false)
	private LocalDate dataDeVencimento;
	
	

}
