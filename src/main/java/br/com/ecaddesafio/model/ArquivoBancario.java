package br.com.ecaddesafio.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity(name = "ARQUIVOBANCARIO")
@Data
public class ArquivoBancario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private Long tipo;

	@Temporal(TemporalType.DATE)
	private Date data;

	private Long quantidadeLinha;

	private BigDecimal valor;

}
