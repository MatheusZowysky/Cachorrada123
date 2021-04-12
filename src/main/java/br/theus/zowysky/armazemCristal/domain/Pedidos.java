package br.theus.zowysky.armazemCristal.domain;

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
public class Pedidos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short numPedido;
	
	@Column(nullable = false)
	private String formaPagamento;
	
	
	@Column(nullable = false)
	private String endereço;
	
	@Column(nullable = false)
	private String formaEnvio;
	
	
	
	@Column(nullable = false)
	private String produtos;

	

}
